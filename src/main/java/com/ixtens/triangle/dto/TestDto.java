package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

public class TestDto {

    @ApiModelProperty(value = "Limit number of results, maximum is 200", example = "10" )
    private int limit = 10;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
