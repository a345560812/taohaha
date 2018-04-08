package com.atao.po;

public class AtaoUser {
    private Integer userId;

    private String userEmail;

    private Integer userPhone;

    private String userActivecode;

    private String userActivestate;

    private String userAddress;

    private String userUsername;

    private String userPassword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserActivecode() {
        return userActivecode;
    }

    public void setUserActivecode(String userActivecode) {
        this.userActivecode = userActivecode == null ? null : userActivecode.trim();
    }

    public String getUserActivestate() {
        return userActivestate;
    }

    public void setUserActivestate(String userActivestate) {
        this.userActivestate = userActivestate == null ? null : userActivestate.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}