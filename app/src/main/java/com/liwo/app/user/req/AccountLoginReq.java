package com.liwo.app.user.req;

/**
 * 登录请求实体类
 * Created by chenhuan on 15-9-19.
 */
public class AccountLoginReq {
    /**
     * 手机号
     */
    private String accountId;
    /**
     * 密码
     */
    private String passwd;
    /**
     * 手机操作系统
     */
    private String os;
    /**
     * 手机型号
     */
    private String version;
    /**
     * 手机编号
     */
    private String deviceid;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }
}
