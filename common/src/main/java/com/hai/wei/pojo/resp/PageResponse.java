package com.hai.wei.pojo.resp;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors
public class PageResponse<T> extends BaseResponse {

    private List<T> body;

    private int page = 1;

    private int limit = 20;

    private int total = 0;

    private int totalPage = 0;
}
