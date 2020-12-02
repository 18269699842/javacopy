package com.liwo.app.core;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by chenhuan on 15-9-13.
 */
public class BaseReq {
    /**
     * 请求账号
     */
    @NotEmpty(message="accountId不能为空")
    private String accountId;
    /**
     * 请求sessionId
     */
    private String sessionId;

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
}
