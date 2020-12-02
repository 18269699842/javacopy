package com.liwo.app.user.model;

/**
 * 个人信息实体
 * Created by chenhuan on 15-9-20.
 */
public class InfoDetailsModel {
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 性别
     */
    private String gender;
    /**
     * 生日
     */
    private String birthdate;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像url
     */
    private String headUrl;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }
}