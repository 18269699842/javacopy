package com.liwo.app.core;

/**
 * 统一返回类
 * Created by chenhuan on 15-10-30.
 */
public class Response<T> {
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应描述
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
