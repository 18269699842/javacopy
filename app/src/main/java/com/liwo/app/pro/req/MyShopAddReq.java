package com.liwo.app.pro.req;

import com.liwo.app.core.BaseReq;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 我的购物车添加请求实体
 * Created by chenhuan on 15-9-13.
 */
public class MyShopAddReq extends BaseReq {
    /**
     * 产品id
     */
    @NotEmpty(message="csId不能为空")
    private String csId;
    /**
     * 数量
     */
    @NotEmpty(message="num不能为空")
    private String num;

    public String getCsId() {
        return csId;
    }

    public void setCsId(String csId) {
        this.csId = csId;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
