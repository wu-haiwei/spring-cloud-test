package com.hai.wei.form;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName CreateOrderForm
 * @Date 2018/10/27 15:11
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class CreateOrderForm {

    private Long productId;

    private String mobile;

    private String name;

    private String address;
}
