package com.ixtens.triangle.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel("AggregationValue")
public class AggregatedDataDto {

    @ApiModelProperty(value = "Field value", required = true)
    private String id;

    @ApiModelProperty("Display value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @ApiModelProperty(value = "Count info", required = true)
    private long count;

    @ApiModelProperty(value = "Values", required = true)
    private List<AggregatedDataDto> data = new ArrayList<>();

    public AggregatedDataDto() {
    }

    public AggregatedDataDto(String id, String name, long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<AggregatedDataDto> getData() {
        return data;
    }

    public void setData(List<AggregatedDataDto> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AggregatedDataDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

}
