package com.liwo.app.user.service;

import com.liwo.app.user.dao.BossPermissionApplyDao;
import com.liwo.app.user.req.PermissionApplyReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by qinzhen on 2015/9/20.
 */
@Service
public class BossPermissionApplyService {

    @Autowired
    private BossPermissionApplyDao bossPermissionApplyDao;

    public void addApply(PermissionApplyReq permissionApplyReq) {
        bossPermissionApplyDao.addApply(permissionApplyReq);
    }
}
