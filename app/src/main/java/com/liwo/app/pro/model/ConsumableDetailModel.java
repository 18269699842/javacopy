package com.liwo.app.pro.model;

import java.util.List;

/**
 * 产品明细实体类
 * Created by chenhuan on 15-9-13.
 */
public class ConsumableDetailModel {
    /**
     * 商品id
     */
    private String csId;
    /**
     * 商品名称
     */
    private String csName;
    /**
     * 折扣价
     */
    private String csPrice;
    /**
     * 规格
     */
    private String csStandard;
    /**
     * 原价
     */
    private String csMkprice;
    /**
     * 销售量
     */
    private String sold;
    /**
     * 库存
     */
    private String num;
    /**
     * 7天包退 0:支持 1:不支持
     */
    private String service1;
    /**
     * 包邮 0:支持 1:不支持
     */
    private String service2;
    /**
     * 次日达 0:支持 1:不支持
     */
    private String service3;
    /**
     * 其它服务 0:支持 1:不支持
     */
    private String service4;
    /**
     * 产品描述
     */
    private String csDetail;
    /**
     * 产品特点
     */
    private String csFeature;
    /**
     * 产品图片
     */
    private String ciDetail;
    /**
     * 介绍图片1
     */
    private String ciImage1;
    /**
     * 介绍图片2
     */
    private String ciImage2;
    /**
     * 介绍图片3
     */
    private String ciImage3;
    /**
     * 介绍图片4
     */
    private String ciImage4;
    /**
     * 产品特色简介
     */
    private String csIntroduce;
    /**
     * 所属产品列表
     */
    private String classId;
    /**
     * 相关推荐
     */
    private List<ConsumableSimilar> similarList;

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

    public String getCsPrice() {
        return csPrice;
    }

    public void setCsPrice(String csPrice) {
        this.csPrice = csPrice;
    }

    public String getCsStandard() {
        return csStandard;
    }

    public void setCsStandard(String csStandard) {
        this.csStandard = csStandard;
    }

    public String getCsMkprice() {
        return csMkprice;
    }

    public void setCsMkprice(String csMkprice) {
        this.csMkprice = csMkprice;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getService1() {
        return service1;
    }

    public void setService1(String service1) {
        this.service1 = service1;
    }

    public String getService2() {
        return service2;
    }

    public void setService2(String service2) {
        this.service2 = service2;
    }

    public String getService3() {
        return service3;
    }

    public void setService3(String service3) {
        this.service3 = service3;
    }

    public String getService4() {
        return service4;
    }

    public void setService4(String service4) {
        this.service4 = service4;
    }

    public String getCsDetail() {
        return csDetail;
    }

    public void setCsDetail(String csDetail) {
        this.csDetail = csDetail;
    }

    public String getCsFeature() {
        return csFeature;
    }

    public void setCsFeature(String csFeature) {
        this.csFeature = csFeature;
    }

    public String getCiDetail() {
        return ciDetail;
    }

    public void setCiDetail(String ciDetail) {
        this.ciDetail = ciDetail;
    }

    public String getCiImage1() {
        return ciImage1;
    }

    public void setCiImage1(String ciImage1) {
        this.ciImage1 = ciImage1;
    }

    public String getCiImage2() {
        return ciImage2;
    }

    public void setCiImage2(String ciImage2) {
        this.ciImage2 = ciImage2;
    }

    public String getCiImage3() {
        return ciImage3;
    }

    public void setCiImage3(String ciImage3) {
        this.ciImage3 = ciImage3;
    }

    public String getCiImage4() {
        return ciImage4;
    }

    public void setCiImage4(String ciImage4) {
        this.ciImage4 = ciImage4;
    }

    public String getCsIntroduce() {
        return csIntroduce;
    }

    public void setCsIntroduce(String csIntroduce) {
        this.csIntroduce = csIntroduce;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public List<ConsumableSimilar> getSimilarList() {
        return similarList;
    }

    public void setSimilarList(List<ConsumableSimilar> similarList) {
        this.similarList = similarList;
    }
}
