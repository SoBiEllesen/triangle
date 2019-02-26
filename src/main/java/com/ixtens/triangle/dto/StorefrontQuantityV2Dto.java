package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class StorefrontQuantityV2Dto {

    @ApiModelProperty(value = "Minimal order quantity", required = true)
    private BigDecimal minOrderQuantity = BigDecimal.ONE;

    @ApiModelProperty(value = "Lot size", required = true)
    private BigDecimal lotSize = BigDecimal.ONE;

    public BigDecimal getMinOrderQuantity() {
        return minOrderQuantity;
    }

    public void setMinOrderQuantity(BigDecimal minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public BigDecimal getLotSize() {
        return lotSize;
    }

    public void setLotSize(BigDecimal lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public String toString() {
        return "DiscoveryQuantityDto{" +
                ", minOrderQuantity=" + minOrderQuantity +
                ", lotSize=" + lotSize +
                '}';
    }
}
