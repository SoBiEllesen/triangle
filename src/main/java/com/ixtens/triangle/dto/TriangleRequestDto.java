package com.ixtens.triangle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TriangleRequestDto {

    @Positive
    @NotNull
    @Max(Integer.MAX_VALUE)
    private Integer lengthA;
    @Positive
    @NotNull
    @Max(Integer.MAX_VALUE)
    private Integer lengthB;
    @Positive
    @NotNull
    @Max(Integer.MAX_VALUE)
    private Integer lengthC;
}
