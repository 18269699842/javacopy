package com.liwo.app.order.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单记录表
 * Created by zou on 15-9-19.
 */
public class OrderRecord {
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 收货地址ID
     */
    private String reapId;

    private String invoiceTitle;

    private int invoiceType;

    private BigDecimal postage;

    private String payKey;

    private String payType;

    private String userId;

    private Date createTime;

    private int orderStatu;

    private Date updateTime;

    private String updateUser;

    private int goodNumTotal;
}
