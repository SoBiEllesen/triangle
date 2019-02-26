package com.ixtens.triangle.asdf.v1.buyer;

import com.ixtens.triangle.dto.PageableParamsDto;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SortableParamsDto extends PageableParamsDto {

    @ApiModelProperty(value = "Sort order (single value or comma delimited string), minus for descending")
    private List<String> sort;

    public List<String> getSort() {
        return sort;
    }

    public void setSort(List<String> sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "CommonSearchParamsDto{" +
                ", sort=" + sort +
                "," + super.toString() +
                '}';
    }
}
