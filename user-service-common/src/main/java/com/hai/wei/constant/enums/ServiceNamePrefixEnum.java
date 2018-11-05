package com.hai.wei.constant.enums;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName ServiceNameEnum
 * @Date 2018/10/27 15:58
 * @Version 1.0
 */
public enum ServiceNamePrefixEnum {
    /**
     * 订单服务
     */
    ORDER_SERVICE_PREFIX("http://ORDER-SERVICE");

    private String prefi;

    ServiceNamePrefixEnum(String prefi) {
        this.prefi = prefi;
    }

    public String serviceNamePrefix() {
        return this.prefi;
    }

    public String serviceName(String suffix) {
        return this.prefi + suffix;
    }
}
