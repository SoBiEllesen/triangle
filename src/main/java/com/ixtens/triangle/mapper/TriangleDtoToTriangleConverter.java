package com.ixtens.triangle.mapper;

import com.ixtens.triangle.dto.TriangleRequestDto;
import com.ixtens.triangle.model.Side;
import com.ixtens.triangle.model.Triangle;

public class TriangleDtoToTriangleConverter {

    public static Triangle convertTriangleFromDto(TriangleRequestDto triangleRequestDto) {
        return Triangle.builder()
                .sideA(new Side(triangleRequestDto.getLengthA()))
                .sideB(new Side(triangleRequestDto.getLengthB()))
                .sideC(new Side(triangleRequestDto.getLengthC()))
                .build();
    }
}
