package com.ixtens.triangle.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListDto<T> {
    @ApiModelProperty(value = "Total item count", required = true)
    private long total;

    @ApiModelProperty(value = "Item sub-list starting from the requested Offset up to the requested Limit", required = true)
    private List<T> data = new ArrayList<>();

    public AbstractListDto() {
    }

    public AbstractListDto(long total, List<T> data) {
        this.total = total;
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AbstractListDto{" +
                "total=" + total +
                ", data=" + data +
                '}';
    }
}
