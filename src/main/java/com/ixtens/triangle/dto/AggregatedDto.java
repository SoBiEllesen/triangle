package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Aggregation")
public class AggregatedDto extends AbstractListDto<AggregatedDataDto> {

    @ApiModelProperty(value = "Aggregating field", required = true)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AggregatedDto{" +
                "total=" + getTotal() +
                ", type='" + type + '\'' +
                ", data=" + getData() +
                '}';
    }
}
