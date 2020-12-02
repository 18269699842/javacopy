package com.liwo.app.user.res;

import com.liwo.app.core.BaseRes;
import com.liwo.app.user.model.AccountLoginModel;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 登录返回实体
 * Created by chenhuan on 15-9-19.
 */
public class AccountLoginRes extends BaseRes {

    @JsonProperty(value="data")
    private AccountLoginModel accountLoginModel;

    public AccountLoginModel getAccountLoginModel() {
        return accountLoginModel;
    }

    public void setAccountLoginModel(AccountLoginModel accountLoginModel) {
        this.accountLoginModel = accountLoginModel;
    }
}
