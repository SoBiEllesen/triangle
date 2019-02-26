package com.ixtens.triangle.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApiModel("ProductContent")
public class ProductContentDto {

    @ApiModelProperty(value = "Title", required = true)
    private String title;

    @ApiModelProperty("Description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;

    @ApiModelProperty(value = "Language", required = true)
    private String language;

    @ApiModelProperty(value = "Available Languages", required = true)
    private List<String> availableLanguages = new ArrayList<>();

    @ApiModelProperty(value = "Identifiers", required = true)
    private Map<String, String> identifiers = new HashMap<>();

    @ApiModelProperty("Commodity Classification Code")
    @JsonProperty("commodity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CategoryDto categoryDto;

    @ApiModelProperty(value = "Attributes", required = true)
    private Map<String, String> attributes = new HashMap<>();

    @ApiModelProperty(value = "Images", required = true)
    @JsonProperty("images")
    private Map<String, String> images = new HashMap<>();


    @ApiModelProperty("Variant")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private VariationDto variation;

    @ApiModelProperty("Keywords")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String keywords;

    public ProductContentDto() {
    }

    public ProductContentDto(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getAvailableLanguages() {
        return availableLanguages;
    }

    public void setAvailableLanguages(List<String> availableLanguages) {
        this.availableLanguages = availableLanguages;
    }

    public Map<String, String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Map<String, String> getImages() {
        return images;
    }

    public void setImages(Map<String, String> images) {
        this.images = images;
    }

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public VariationDto getVariation() {
        return variation;
    }

    public void setVariation(VariationDto variation) {
        this.variation = variation;
    }

}
