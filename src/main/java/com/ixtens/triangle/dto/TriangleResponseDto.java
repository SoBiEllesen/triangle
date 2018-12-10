package com.ixtens.triangle.dto;

import com.ixtens.triangle.model.TriangleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TriangleResponseDto extends ResponseDto{

    private TriangleType triangleType;

}
