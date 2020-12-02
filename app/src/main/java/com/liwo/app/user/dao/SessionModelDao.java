package com.liwo.app.user.dao;

import com.liwo.app.user.model.SessionModel;
import com.liwo.app.util.DateUtil;
import com.liwo.app.util.UUIDGenerator;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * session dao
 * Created by chenhuan on 15-9-19.
 */
@Component
public class SessionModelDao {
    //默认session失效时间30分钟
    private static final Integer SESSION_FAILURE_TIME = 30*60;

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 根据手机号创建session实体
     * @param accountId 账户id
     * @return
     */
    public SessionModel createSessionId(String accountId)throws Exception{
        String currentTime = DateUtil.getCurrDateTime();
        SessionModel result = new SessionModel();
        result.setAccountId(accountId);
        result.setSessionId(UUIDGenerator.getUUID());
        result.setStartDate(currentTime);
        result.setFailureDate(String.valueOf(Long.parseLong(currentTime)+SESSION_FAILURE_TIME));
        result.setStat("0");
        if(0<sqlSessionTemplate.insert("com.liwo.app.user.dao.SessionModelDao.createSessionId",result)){
            return result;
        }else{
            throw new RuntimeException("生成sessionId失败");
        }

    }
}
