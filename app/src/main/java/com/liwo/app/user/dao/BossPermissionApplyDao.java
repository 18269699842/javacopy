package com.liwo.app.user.dao;

import com.liwo.app.user.req.PermissionApplyReq;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by qinzhen on 2015/9/20.
 */
@Component
public class BossPermissionApplyDao {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    public void addApply(PermissionApplyReq permissionApplyReq) {
        sqlSessionTemplate.insert("com.liwo.app.user.dao.BossPermissionApplyDao.addBossPermissionApply", permissionApplyReq);
    }
}
