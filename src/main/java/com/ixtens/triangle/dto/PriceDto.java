package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@ApiModel("Price")
public class PriceDto {

    @ApiModelProperty(value = "Currency of price", required = true)
    private Currency currency;

    @ApiModelProperty(value = "Value of price", required = true)
    private BigDecimal value;

    @ApiModelProperty(value = "Price breaks", required = true)
    private List<PriceBreakDto> priceBreaks = new ArrayList<>();

    @ApiModelProperty(value = "Price breaks type", required = true)
    private PriceBreakTypeDto priceBreakType = PriceBreakTypeDto.volume;

    @ApiModelProperty(value = "Base quantity", required = true)
    private BigDecimal baseQuantity = BigDecimal.ONE;

    public PriceDto() {
    }

    public PriceDto(BigDecimal value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public List<PriceBreakDto> getPriceBreaks() {
        return priceBreaks;
    }

    public void setPriceBreaks(@NotNull List<PriceBreakDto> priceBreaks) {
        this.priceBreaks = priceBreaks;
    }

    public PriceBreakTypeDto getPriceBreakType() {
        return priceBreakType;
    }

    public void setPriceBreakType(PriceBreakTypeDto priceBreakType) {
        this.priceBreakType = priceBreakType;
    }

    public BigDecimal getBaseQuantity() {
        return baseQuantity;
    }

    public void setBaseQuantity(BigDecimal baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    @Override
    public String toString() {
        return "PriceDto{" +
                "currency=" + currency +
                ", value=" + value +
                ", priceBreaks=" + priceBreaks +
                ", priceBreakType=" + priceBreakType +
                ", baseQuantity=" + baseQuantity +
                '}';
    }
}
