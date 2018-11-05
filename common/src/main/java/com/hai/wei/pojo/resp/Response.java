package com.hai.wei.pojo.resp;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class Response<T> extends BaseResponse {
    private T body;
}
