package com.liwo.app.pro.model;

/**
 * app_pro_myshop表实体映射
 * Created by chenhuan on 15-9-19.
 */
public class MyShopModelV2 {
    /**
     * 购物车id
     */
    private String msId;
    /**
     * 产品id
     */
    private String csId;
    /**
     * 数量
     */
    private String num;
    /**
     * 所属用户
     */
    private String accId;

    public String getMsId() {
        return msId;
    }

    public void setMsId(String msId) {
        this.msId = msId;
    }

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

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }
}
