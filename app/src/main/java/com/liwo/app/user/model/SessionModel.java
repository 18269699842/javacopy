package com.liwo.app.user.model;

/**
 * session实体
 * Created by chenhuan on 15-9-19.
 */
public class SessionModel {
    /**
     * 主键
     */
    private String id;
    /**
     * 用户号码
     */
    private String accountId;
    /**
     * 用户会话码
     */
    private String sessionId;
    /**
     * 开始时间
     */
    private String startDate;
    /**
     * 失效时间
     */
    private String failureDate;
    /**
     * 状态
     */
    private String stat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFailureDate() {
        return failureDate;
    }

    public void setFailureDate(String failureDate) {
        this.failureDate = failureDate;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
