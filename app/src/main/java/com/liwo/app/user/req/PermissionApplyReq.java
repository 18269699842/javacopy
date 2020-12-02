package com.liwo.app.user.req;

import com.liwo.app.core.BaseReq;

import java.io.ByteArrayInputStream;

/**
 * 老板权限申请请求
 * Created by Andy.Q on 2015/9/20.
 */
public class PermissionApplyReq extends BaseReq {
    private String applyName;
    private String mobile;
    private String identify;
    private String shopName;
    private String address;
    private String telephone;
    private String licenceImage;

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLicenceImage() {
        return licenceImage;
    }

    public void setLicenceImage(String licenceImage) {
        this.licenceImage = licenceImage;
    }
}
