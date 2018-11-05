package com.hai.wei.pojo.user;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName UserInfo
 * @Date 2018/10/27 15:05
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -7200075006153686457L;

    private Long userId;

    private String name;

    private String address;
}
