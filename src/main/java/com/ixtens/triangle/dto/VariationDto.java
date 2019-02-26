package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Arrays;

@ApiModel("Variation")
public class VariationDto {

    @ApiModelProperty(value = "Variation Identifier", required = true)
    private String variationId;

    @ApiModelProperty(value = "Variation attributes", required = true)
    private String[] attributes = new String[0];

    public String getVariationId() {
        return variationId;
    }

    public void setVariationId(String variationId) {
        this.variationId = variationId;
    }

    public String[] getAttributes() {
        return attributes;
    }

    public void setAttributes(String[] attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "VariationDto{" +
                "variationId='" + variationId + '\'' +
                ", attributes=" + Arrays.toString(attributes) +
                '}';
    }
}
