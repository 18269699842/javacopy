package com.liwo.app.user.controller;

import com.liwo.app.core.BaseController;
import com.liwo.app.core.CodeConstants;
import com.liwo.app.user.model.AccountLoginModel;
import com.liwo.app.user.model.MessageCodeModel;
import com.liwo.app.user.req.AccountLoginReq;
import com.liwo.app.user.req.RegisterReq;
import com.liwo.app.user.res.AccountLoginRes;
import com.liwo.app.user.res.MessageRes;
import com.liwo.app.user.res.RegisterRes;
import com.liwo.app.user.req.MessageReq;
import com.liwo.app.user.service.AccountService;
import com.liwo.app.user.service.SessionModelService;
import com.liwo.app.util.JSONUtils;
import com.liwo.app.util.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 用户信息action
 * Created by chenhuan on 15-9-19.
 */
@RequestMapping("/user/account")
@Controller
public class AccountController extends BaseController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountService accountService;

    @Autowired
    private SessionModelService sessionModelService;
    /**
     * 登录方法
     * @param accountLoginReq
     * @return
     */
    @RequestMapping("login")
    public @ResponseBody String login(AccountLoginReq accountLoginReq){
        AccountLoginRes result = new AccountLoginRes();
        try{
            if(accountService.queryAccountByIdAndPwd(accountLoginReq)){
                //生成sessionId设置返回参数
                AccountLoginModel accountLoginModel = new AccountLoginModel();
                accountLoginModel.setSessionId(sessionModelService.createSessionId(accountLoginReq.getAccountId()).getSessionId());
                result.setAccountLoginModel(accountLoginModel);
                result.setCode(CodeConstants.SUCCESS);
                result.setMsg(getMsg(CodeConstants.SUCCESS));
            }else{
                result.setCode(CodeConstants.ACCT_MISMATCH);
                result.setMsg(getMsg(CodeConstants.ACCT_MISMATCH));
            }

        }catch(Exception e){
            log.error("未知异常",e);
            result.setCode(CodeConstants.ERROR);
            result.setMsg(getMsg(CodeConstants.ERROR));
        }
        return JSONUtils.toJSON(result);
    }

    @RequestMapping("register")
    @ResponseBody
    public String register(RegisterReq registerReq) {
        RegisterRes registerRes = new RegisterRes();
        try {
            //校验是否已存在此用户
            if(accountService.existAccount(registerReq.getAccountId())) {
                registerRes.setCode(CodeConstants.ALREADY_USER_ACCOUNT);
            } else {
                //校验短信验证码
                String code = accountService.getMsgCode(registerReq.getAccountId());
                if(registerReq.getCode().equals(code)) {
                    accountService.addUserAccount(registerReq);
                    registerRes.setCode(CodeConstants.SUCCESS);
                }else {
                    registerRes.setCode(CodeConstants.MSG_CODE_ERROR);
                }
            }
        } catch (Exception e) {
            log.error("未知异常", e);
            registerRes.setCode(CodeConstants.ERROR);
        }
        return JSONUtils.toJSON(registerRes);
    }

    @RequestMapping("recvCode")
    @ResponseBody
    public String recvCode(MessageReq reparedRegReq) {
        MessageRes res = new MessageRes();
        try {
            String code = MessageUtil.sendValidCode(reparedRegReq.getMobile());
            accountService.addMessageCode(reparedRegReq.getMobile(), code);
            res.setCode(CodeConstants.SUCCESS);
        } catch (Exception e) {
            res.setCode(CodeConstants.ERROR);
        }
        return JSONUtils.toJSON(res);
    }

}
