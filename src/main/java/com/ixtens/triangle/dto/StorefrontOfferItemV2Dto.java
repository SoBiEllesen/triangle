package com.ixtens.triangle.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@ApiModel("Storefront Offer Item")
public class StorefrontOfferItemV2Dto {

    @ApiModelProperty(value = "Offer Key", required = true)
    private UUID offerKey;

    @ApiModelProperty(value = "Status of the offerItem", required = true, allowableValues = "Pending,Approved,Rejected,PendingReApprove,ChangesRequested")
    private String status;

    @ApiModelProperty(value = "Price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PriceDto price;

    @ApiModelProperty(value = "Accounting Codes", required = true)
    private Map<String, String> accountingCodes = new HashMap<>();

    @ApiModelProperty(value = "Quantity")
    private StorefrontQuantityV2Dto quantity;

    public UUID getOfferKey() {
        return offerKey;
    }

    public void setOfferKey(UUID offerKey) {
        this.offerKey = offerKey;
    }

    public PriceDto getPrice() {
        return price;
    }

    public void setPrice(PriceDto price) {
        this.price = price;
    }

    public Map<String, String> getAccountingCodes() {
        return accountingCodes;
    }

    public void setAccountingCodes(Map<String, String> accountingCodes) {
        this.accountingCodes = accountingCodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StorefrontQuantityV2Dto getQuantity() {
        return quantity;
    }

    public void setQuantity(StorefrontQuantityV2Dto quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StorefrontOfferItemDto{" +
                "offerKey=" + offerKey +
                ", status=" + status +
                ", price=" + price +
                ", accountingCodes=" + accountingCodes +
                ", quantity=" + quantity +
                '}';
    }
}
