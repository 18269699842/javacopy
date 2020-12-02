package com.liwo.app.user.controller;

import com.liwo.app.core.BaseController;
import com.liwo.app.core.CodeConstants;
import com.liwo.app.user.req.PermissionApplyReq;
import com.liwo.app.user.res.PermissionApplyRes;
import com.liwo.app.user.service.BossPermissionApplyService;
import com.liwo.app.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 权限申请相关请求
 * Created by Andy.Q on 2015/9/20.
 */
@Controller
@RequestMapping("/user/permission")
public class PermissionApplyController extends BaseController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private BossPermissionApplyService bossPermissionApplyService;

    @RequestMapping("apply")
    @ResponseBody
    public String apply(PermissionApplyReq permissionApplyReq) {
        PermissionApplyRes res = new PermissionApplyRes();
        try {
            bossPermissionApplyService.addApply(permissionApplyReq);
            res.setCode(CodeConstants.SUCCESS);
        } catch (Exception e) {
            log.error("未知异常", e);
            res.setCode(CodeConstants.ERROR);
        }
        return JSONUtils.toJSON(res);
    }

}
