package com.liwo.app.user.dao;

import com.liwo.app.user.model.InfoDetailsModel;
import com.liwo.app.user.model.MessageCodeModel;
import com.liwo.app.user.req.AccountLoginReq;
import com.liwo.app.user.req.InfoDetailsReq;
import com.liwo.app.user.req.InfoModifyReq;
import com.liwo.app.user.req.RegisterReq;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 用户信息dao
 * Created by chenhuan on 15-9-19.
 */
@Component
public class AccountDao {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 根据账户密码查询账户信息
     *
     * @param accountLoginReq
     * @return
     */
    public boolean queryAccountByIdAndPwd(AccountLoginReq accountLoginReq) {
        return ((Long) sqlSessionTemplate.selectOne("com.liwo.app.user.dao.AccountDao.queryAccountByIdAndPwd", accountLoginReq)) > 0 ? true : false;
    }

    /**
     * 查询用户信息
     *
     * @param infoDetailsReq
     * @return
     */
    public InfoDetailsModel queryInfoDetails(InfoDetailsReq infoDetailsReq) {
        return sqlSessionTemplate.selectOne("com.liwo.app.user.dao.AccountDao.queryInfoDetails", infoDetailsReq);
    }

    /**
     * 修改用户信息
     *
     * @param infoModifyReq
     * @return
     */
    public boolean updateUserInfo(InfoModifyReq infoModifyReq) {
        return sqlSessionTemplate.update("com.liwo.app.user.dao.AccountDao.updateUserInfo", infoModifyReq) > 0 ? true : false;
    }

    public void addUserAccount(RegisterReq registerReq) {
        sqlSessionTemplate.insert("com.liwo.app.user.dao.AccountDao.registerUserAccount", registerReq);
    }

    public boolean existAccount(String accountId) {
        return ((Integer) sqlSessionTemplate.selectOne("com.liwo.app.user.dao.AccountDao.countAccountId", accountId)) > 0 ? true : false;
    }

    public void addMessageCode(String mobile, String code) {
        //不管数据库中是否存在与此手机号码相关的验证码记录，先作删除
        sqlSessionTemplate.delete("com.liwo.app.user.dao.MessageCodeDao.remove", mobile);

        MessageCodeModel msgcode = new MessageCodeModel();
        msgcode.setMobile(mobile);
        msgcode.setMsgCode(code);
        msgcode.setCreateTime(new Date());

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) + 2);

        msgcode.setExpireTime(calendar.getTime());//设置失效时间为两分钟

        sqlSessionTemplate.insert("com.liwo.app.user.dao.MessageCodeDao.add", msgcode);
    }

    public String getMsgCode(String accountId) {
        List<Object> list = sqlSessionTemplate.selectList("com.liwo.app.user.dao.MessageCodeDao.getMsgcodeByMobile", accountId);
        return list != null && list.size() > 0 ? list.get(0).toString() : null;
    }
}
