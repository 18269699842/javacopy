package com.liwo.app.core;

/**
 * Created by chenhuan on 15-9-13.
 */
public class BaseRes {
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应描述
     */
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
