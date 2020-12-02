package com.liwo.app.user.req;

import com.liwo.app.core.BaseReq;

/**
 * 注册请求
 * Created by Andy.Q on 2015/9/20.
 */
public class RegisterReq extends BaseReq {
    private String passwd;
    private String code;

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
