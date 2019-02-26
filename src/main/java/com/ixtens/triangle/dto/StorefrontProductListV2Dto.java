package com.ixtens.triangle.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel("List of storefront products")
public class StorefrontProductListV2Dto extends AbstractListDto<StorefrontProductV2Dto> {

    @ApiModelProperty(value = "Requested facets")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<AggregatedDto> facets = new ArrayList<>();

    public StorefrontProductListV2Dto() {
    }

    public StorefrontProductListV2Dto(List<AggregatedDto> facets) {
        this.facets = facets;
    }

    public StorefrontProductListV2Dto(long total, List<StorefrontProductV2Dto> data, List<AggregatedDto> facets) {
        super(total, data);
        this.facets = facets;
    }

    public List<AggregatedDto> getFacets() {
        return facets;
    }

    public void setFacets(List<AggregatedDto> facets) {
        this.facets = facets;
    }

    @Override
    public String toString() {
        return "StorefrontProductListDto{" +
                "facets=" + facets +
                "} " + super.toString();
    }
}
