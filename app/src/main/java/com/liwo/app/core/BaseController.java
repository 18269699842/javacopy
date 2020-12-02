package com.liwo.app.core;

import com.liwo.app.util.JSONUtils;
import com.liwo.app.validate.ValidateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import javax.annotation.Resource;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Set;

/**
 * @author chenhuan
 */
public class BaseController {

    protected Logger log = LoggerFactory.getLogger(getClass());

    @Resource(name="messageSource")
    private MessageSource messageSource;

    @Resource(name="validator")
    private Validator validator;

    /**
     * 得到消息
     * @param code
     * @return
     */
    public String getMsg(String code){
        return messageSource.getMessage(code,null, Locale.SIMPLIFIED_CHINESE);
    }

    /**
     * 带占位符的消息处理
     * @param code
     * @param args
     * @return
     */
    public String getMsg(String code,Object... args){
        return messageSource.getMessage(code,args, Locale.SIMPLIFIED_CHINESE);
    }

    /**
     * 参数校验
     * @param req
     * @param
     */
    public <T> void validate(T req){
        // 校验参数
        Set<ConstraintViolation<T>> sets = validator.validate(req);
        if (sets.size() > 0) {
            for (ConstraintViolation<T> v : sets) {
                throw new ValidateException(v.getMessage());
            }
        }
    }

    /**
     * 校验异常处理
     * @param re
     * @param request
     * @param response
     * @throws Exception
     */
    @ExceptionHandler(ValidateException.class)
    public void handleValidateException(Exception re,HttpServletRequest request,HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = null;
        try{
            out = response.getWriter();
            log.error("系统异常：",re);
            BaseRes result = new BaseRes();
            result.setCode(CodeConstants.VALIDATE_ERROR);
            result.setMsg(getMsg(CodeConstants.VALIDATE_ERROR,re.getMessage()));
            out.println(JSONUtils.toJSON(result));
        }catch(Exception e){
            log.error("超级类出现异常",e);
        }finally{
            if(out!=null){
                out.flush();
                out.close();
            }
        }
    }

    /**
     * 统一异常处理
     * @param re
     * @param request
     * @return
     */
    @ExceptionHandler(Exception.class)
    public void handleException(Exception re,HttpServletRequest request,HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = null;
        try{
            out = response.getWriter();
            log.error("系统异常：",re);
            BaseRes result = new BaseRes();
            result.setCode(CodeConstants.ERROR);
            result.setMsg(getMsg(CodeConstants.ERROR));
            out.println(JSONUtils.toJSON(result));
        }catch(Exception e){
            log.error("超级类出现异常",e);
        }finally{
            if(out!=null){
                out.flush();
                out.close();
            }
        }
    }
}
