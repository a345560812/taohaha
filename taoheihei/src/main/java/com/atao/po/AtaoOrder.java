package com.atao.po;

import java.math.BigDecimal;

public class AtaoOrder {
    private Integer id;

    private String orderId;

    private Integer userId;

    private Integer orderTime;

    private BigDecimal orderMoney;

    private String ataoName;

    private Integer ataoPhone;

    private String ataoAddr;

    private Byte orderStat;

    private Byte orderPay;

    private String orderMes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Integer orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getAtaoName() {
        return ataoName;
    }

    public void setAtaoName(String ataoName) {
        this.ataoName = ataoName == null ? null : ataoName.trim();
    }

    public Integer getAtaoPhone() {
        return ataoPhone;
    }

    public void setAtaoPhone(Integer ataoPhone) {
        this.ataoPhone = ataoPhone;
    }

    public String getAtaoAddr() {
        return ataoAddr;
    }

    public void setAtaoAddr(String ataoAddr) {
        this.ataoAddr = ataoAddr == null ? null : ataoAddr.trim();
    }

    public Byte getOrderStat() {
        return orderStat;
    }

    public void setOrderStat(Byte orderStat) {
        this.orderStat = orderStat;
    }

    public Byte getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(Byte orderPay) {
        this.orderPay = orderPay;
    }

    public String getOrderMes() {
        return orderMes;
    }

    public void setOrderMes(String orderMes) {
        this.orderMes = orderMes == null ? null : orderMes.trim();
    }
}