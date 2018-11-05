package com.hai.wei.constant.enums;

public enum OrderServiceSuffixEnum {

    /** 创建订单 */
    GENERATE_ORDER_SUFFIX("/order/createOrder");

    private String suffix;

    OrderServiceSuffixEnum(String suffix) {
        this.suffix = suffix;
    }

    public String serviceSuffix() {
        return this.suffix;
    }
}
