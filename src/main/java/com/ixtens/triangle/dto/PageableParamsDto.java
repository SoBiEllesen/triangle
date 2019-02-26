package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModelProperty;

public class PageableParamsDto {

    public static final int MAX_LIMIT = 200;

    public static void checkLimit(int limit) {
        if (limit < 0 || limit > PageableParamsDto.MAX_LIMIT) {
            throw new IllegalArgumentException("Not allowed limit, below zero or exceeding max value: " + PageableParamsDto.MAX_LIMIT);
        }
    }

    @ApiModelProperty(value = "Limit number of results, maximum is 200", example = "10")
    protected int limit = 10;

    @ApiModelProperty(value = "Offset of result", example = "0")
    protected int offset = 0;

    public int getLimit() {
        PageableParamsDto.checkLimit(limit);
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    private static int getPageNumber(int limit, int offset) {
        return offset != 0 ? offset / limit : 0;
    }


    @Override
    public String toString() {
        return "PageableParamsDto{" +
                "limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
