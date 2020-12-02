package com.liwo.app.pro.req;

import com.liwo.app.core.BaseReq;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 我的购物车删除请求实体
 * Created by chenhuan on 15-9-13.
 */
public class MyShopDeleteReq extends BaseReq {
    /**
     * 购物车商品id
     */
    @NotEmpty(message="msId不能为空")
    private String msId;

    public String getMsId() {
        return msId;
    }

    public void setMsId(String msId) {
        this.msId = msId;
    }
}
