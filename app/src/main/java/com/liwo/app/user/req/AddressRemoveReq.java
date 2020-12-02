package com.liwo.app.user.req;

import com.liwo.app.core.BaseReq;

/**
 * 收货地址删除请求
 * Created by qinzhen on 2015/9/19.
 */
public class AddressRemoveReq extends BaseReq {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
