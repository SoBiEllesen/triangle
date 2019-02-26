package com.ixtens.triangle.asdf.v1.buyer;

import io.swagger.annotations.ApiModelProperty;

public class ActionSearchParamsDto extends SortableParamsDto {

    @ApiModelProperty(value = "Filter by action type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ActionSearchParamsDto{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
