package com.hai.wei.pojo.product;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName ProductInfo
 * @Date 2018/10/27 15:06
 * @Version 1.0
 */

@Data
@Accessors(chain = true)
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 5611802847571926450L;

    private Long productId;

    private String productName;

    private String desc;
}
