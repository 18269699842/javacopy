package com.liwo.app.pro.model;

/**
 * 产品实体类(略缩实体)
 * Created by chenhuan on 15-9-13.
 */
public class ConsumableModel {
    /**
     * 产品id
     */
    private String csId;
    /**
     * 产品名称
     */
    private String csName;
    /**
     * 产品原价
     */
    private String csMkprice;
    /**
     * 产品折扣价
     */
    private String csProice;
    /**
     * 产品规格
     */
    private String csStandard;
    /**
     * 产品特色简介
     */
    private String csIntroduce;
    /**
     * 产品销量
     */
    private String sold;
    /**
     * 产品略缩图
     */
    private String ciLogo;

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

    public String getCsMkprice() {
        return csMkprice;
    }

    public void setCsMkprice(String csMkprice) {
        this.csMkprice = csMkprice;
    }

    public String getCsProice() {
        return csProice;
    }

    public void setCsProice(String csProice) {
        this.csProice = csProice;
    }

    public String getCsStandard() {
        return csStandard;
    }

    public void setCsStandard(String csStandard) {
        this.csStandard = csStandard;
    }

    public String getCsIntroduce() {
        return csIntroduce;
    }

    public void setCsIntroduce(String csIntroduce) {
        this.csIntroduce = csIntroduce;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public String getCiLogo() {
        return ciLogo;
    }

    public void setCiLogo(String ciLogo) {
        this.ciLogo = ciLogo;
    }
}
