package com.liwo.app.user.service;

import com.liwo.app.user.dao.AccountDao;
import com.liwo.app.user.model.InfoDetailsModel;
import com.liwo.app.user.model.MessageCodeModel;
import com.liwo.app.user.req.AccountLoginReq;
import com.liwo.app.user.req.InfoDetailsReq;
import com.liwo.app.user.req.InfoModifyReq;
import com.liwo.app.user.req.RegisterReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息service
 * Created by chenhuan on 15-9-19.
 */
@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 根据账户密码查询账户信息
     * @param accountLoginReq
     * @return
     */
    public boolean queryAccountByIdAndPwd(AccountLoginReq accountLoginReq){
        return accountDao.queryAccountByIdAndPwd(accountLoginReq);
    }

    /**
     * 查询用户信息
     * @param infoDetailsReq
     * @return
     */
    public InfoDetailsModel queryInfoDetails(InfoDetailsReq infoDetailsReq){
        return accountDao.queryInfoDetails(infoDetailsReq);
    }

    /**
     * 修改用户信息
     * @param InfoModifyReq
     * @return
     */
    public boolean updateUserInfo(InfoModifyReq InfoModifyReq){
        return accountDao.updateUserInfo(InfoModifyReq);
    }

    /**
     * 新用户注册
     * @param registerReq
     */
    public void addUserAccount(RegisterReq registerReq) {
        accountDao.addUserAccount(registerReq);
    }

    /**
     * 校验是否已存在此用户账号
     * @param accountId
     * @return
     */
    public boolean existAccount(String accountId) {
        return accountDao.existAccount(accountId);
    }

    public void addMessageCode(String mobile, String code) {
        accountDao.addMessageCode(mobile, code);
    }

    public String getMsgCode(String accountId) {
        return accountDao.getMsgCode(accountId);
    }
}
