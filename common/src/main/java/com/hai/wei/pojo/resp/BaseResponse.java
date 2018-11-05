package com.hai.wei.pojo.resp;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class BaseResponse {
    private int responseCode = 0;

    private String message;
}
