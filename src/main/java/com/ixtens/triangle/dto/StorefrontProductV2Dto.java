package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ApiModel("Storefront Product")
public class StorefrontProductV2Dto {

    @ApiModelProperty(value = "Product Identifier", required = true)
    private String identifier;

    @ApiModelProperty(value = "Content", required = true)
    private ProductContentDto content;

    @ApiModelProperty(value = "Offer Items", required = true)
    private List<StorefrontOfferItemV2Dto> offerItems = new ArrayList<>();

    @ApiModelProperty(value = "Supplier ID", required = true)
    private String supplierId;

    @ApiModelProperty(value = "Marketplace ID", required = true)
    private UUID marketplaceId;

    @ApiModelProperty(value = "Supplier Name", required = true)
    private String supplierName;

    @ApiModelProperty(value = "Preferred flag", required = true)
    private boolean preferred;

    @ApiModelProperty(value = "Favorite flag", required = true)
    private boolean favorite;

    @ApiModelProperty(value = "Previously Requested flag", required = true)
    private boolean previouslyRequested;

    public StorefrontProductV2Dto() {}

    public StorefrontProductV2Dto(String identifier, ProductContentDto content, List<StorefrontOfferItemV2Dto> offerItems, String supplier) {
        this.identifier = identifier;
        this.offerItems = offerItems;
        this.content = content;
        this.supplierId = supplier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ProductContentDto getContent() {
        return content;
    }

    public void setContent(ProductContentDto content) {
        this.content = content;
    }

    public List<StorefrontOfferItemV2Dto> getOfferItems() {
        return offerItems;
    }

    public void setOfferItems(List<StorefrontOfferItemV2Dto> offerItems) {
        this.offerItems = offerItems;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public boolean isPreferred() {
        return preferred;
    }

    public void setPreferred(boolean preferred) {
        this.preferred = preferred;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public boolean isPreviouslyRequested() {
        return previouslyRequested;
    }

    public void setPreviouslyRequested(boolean previouslyRequested) {
        this.previouslyRequested = previouslyRequested;
    }

    public UUID getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(UUID marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    @Override
    public String toString() {
        return "StorefrontProductDto{" +
                "identifier='" + identifier + '\'' +
                ", content=" + content +
                ", offerItems=" + offerItems +
                ", supplierId='" + supplierId + '\'' +
                ", marketplaceId=" + marketplaceId +
                ", supplierName='" + supplierName + '\'' +
                ", preferred=" + preferred +
                ", favorite=" + favorite +
                ", previouslyRequested=" + previouslyRequested +
                '}';
    }
}
