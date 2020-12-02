package com.liwo.app.pro.model;

/**
 * 我的购物车实体
 * Created by chenhuan on 15-9-13.
 */
public class MyShopModel {
    /**
     * 购物车id
     */
    private String msId;
    /**
     * 商品id
     */
    private String csId;
    /**
     * 商品名称
     */
    private String csName;
    /**
     * 数量
     */
    private String num;
    /**
     * 价格
     */
    private String price;
    /**
     * 产品略缩图
     */
    private String ciLogo;

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

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCiLogo() {
        return ciLogo;
    }

    public void setCiLogo(String ciLogo) {
        this.ciLogo = ciLogo;
    }
}
