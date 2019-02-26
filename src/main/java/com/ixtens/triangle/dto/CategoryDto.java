package com.ixtens.triangle.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Commodity")
public class CategoryDto {

    @ApiModelProperty(value = "Category Id", required = true)
    private String code;

    @ApiModelProperty(value = "Category Name", required = true)
    private String name;

    @ApiModelProperty(value = "Category is a service", required = true)
    private boolean service = false;

    @ApiModelProperty(value = "Parent category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CategoryDto parent;

    @SuppressWarnings("unused")
    public CategoryDto() {
    }

    public CategoryDto(String code, String name) {
        this(code, name, false);
    }

    public CategoryDto(String code, String name, boolean service) {
        this.code = code;
        this.name = name;
        this.service = service;
    }

    public CategoryDto(String code, String name, boolean service, CategoryDto parent) {
        this.code = code;
        this.name = name;
        this.service = service;
        this.parent = parent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isService() {
        return service;
    }

    public void setService(Boolean service) {
        this.service = service;
    }

    public CategoryDto getParent() {
        return parent;
    }

    public void setParent(CategoryDto parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", service=" + service +
                ", parent=" + parent +
                '}';
    }
}
