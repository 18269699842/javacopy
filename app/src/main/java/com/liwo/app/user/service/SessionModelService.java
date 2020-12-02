package com.liwo.app.user.service;

import com.liwo.app.user.dao.SessionModelDao;
import com.liwo.app.user.model.SessionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * session service
 * Created by chenhuan on 15-9-19.
 */
@Service
public class SessionModelService {
    @Autowired
    private SessionModelDao sessionModelDao;

    /**
     * 根据手机号创建session实体
     * @param mobile
     * @return
     */
    public SessionModel createSessionId(String mobile)throws Exception{
        return sessionModelDao.createSessionId(mobile);
    }
}
