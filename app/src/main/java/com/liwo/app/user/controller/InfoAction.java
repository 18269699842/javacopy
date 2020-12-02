package com.liwo.app.user.controller;

import com.liwo.app.core.BaseController;
import com.liwo.app.core.BaseRes;
import com.liwo.app.core.CodeConstants;
import com.liwo.app.user.req.InfoModifyReq;
import com.liwo.app.user.req.InfoDetailsReq;
import com.liwo.app.user.res.InfoDetailsRes;
import com.liwo.app.user.service.AccountService;
import com.liwo.app.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 个人信息
 * Created by chenhuan on 15-9-20.
 */
@RequestMapping("user/info")
@Controller
public class InfoAction extends BaseController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountService accountService;

    /**
     * 个人信息显显示接口
     * @return
     */
    @RequestMapping("details")
    @ResponseBody
    public String details(InfoDetailsReq infoDetailsReq){
        InfoDetailsRes result = new InfoDetailsRes();
        try{
            result.setInfoDetailsModel(accountService.queryInfoDetails(infoDetailsReq));
            result.setCode(CodeConstants.SUCCESS);
            result.setMsg(getMsg(CodeConstants.SUCCESS));
        }catch(Exception e){
            log.error("未知异常",e);
            result.setCode(CodeConstants.ERROR);
            result.setMsg(getMsg(CodeConstants.ERROR));
        }
        return JSONUtils.toJSON(result);
    }

    /**
     * 个人信息修改接口
     * @return
     */
    @RequestMapping("modify")
    @ResponseBody
    public String modify(InfoModifyReq InfoModifyReq){
        BaseRes result = new BaseRes();
        try{
            if(accountService.updateUserInfo(InfoModifyReq)){
                result.setCode(CodeConstants.SUCCESS);
                result.setMsg(getMsg(CodeConstants.SUCCESS));
            }else{
                result.setCode(CodeConstants.SQL_UPDATE_ERROR);
                result.setMsg(getMsg(CodeConstants.SQL_UPDATE_ERROR));
            }

        }catch(Exception e){
            log.error("未知异常",e);
            result.setCode(CodeConstants.ERROR);
            result.setMsg(getMsg(CodeConstants.ERROR));
        }
        return JSONUtils.toJSON(result);
    }
}
