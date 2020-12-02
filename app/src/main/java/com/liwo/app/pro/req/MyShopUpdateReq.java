package com.liwo.app.pro.req;

import com.liwo.app.core.BaseReq;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 我的购物车修改请求实体
 * Created by chenhuan on 15-9-19.
 */
public class MyShopUpdateReq extends BaseReq {
    /**
     * 购物车商品id
     */
    @NotEmpty(message="msId不能为空")
    private String msId;
    /**
     * 数量
     */
    @NotEmpty(message="num不能为空")
    private String num;

    public String getMsId() {
        return msId;
    }

    public void setMsId(String msId) {
        this.msId = msId;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
