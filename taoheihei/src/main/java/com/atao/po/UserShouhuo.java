package com.atao.po;

public class UserShouhuo {
    private Integer userId;

    private String hygName;

    private String hygPhone;

    private String hygAddr;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHygName() {
        return hygName;
    }

    public void setHygName(String hygName) {
        this.hygName = hygName == null ? null : hygName.trim();
    }

    public String getHygPhone() {
        return hygPhone;
    }

    public void setHygPhone(String hygPhone) {
        this.hygPhone = hygPhone == null ? null : hygPhone.trim();
    }

    public String getHygAddr() {
        return hygAddr;
    }

    public void setHygAddr(String hygAddr) {
        this.hygAddr = hygAddr == null ? null : hygAddr.trim();
    }
}