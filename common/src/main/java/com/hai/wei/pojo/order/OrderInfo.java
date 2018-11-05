package com.hai.wei.pojo.order;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = -7992183882828669090L;

    private Long orderId;

    private String orderNo;

    private Long createTimeMillis;

    private Long productId;

    private Integer status;
}
