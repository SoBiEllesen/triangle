package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel("Price Break")
public class PriceBreakDto {

    @ApiModelProperty(value = "Quantity for price break", required = true)
    private Integer quantity = 0;

    @ApiModelProperty(value = "Value of price break", required = true)
    private BigDecimal amount = BigDecimal.ZERO;

    public PriceBreakDto() {
    }

    public PriceBreakDto(Integer quantity, BigDecimal amount) {
        this.quantity = quantity;
        this.amount = amount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PriceBreakDto{" +
                "quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}
