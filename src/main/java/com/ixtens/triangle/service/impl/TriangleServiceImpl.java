package com.ixtens.triangle.service.impl;

import com.ixtens.triangle.dto.TriangleRequestDto;
import com.ixtens.triangle.mapper.TriangleDtoToTriangleConverter;
import com.ixtens.triangle.model.Triangle;
import com.ixtens.triangle.model.TriangleType;
import com.ixtens.triangle.service.TriangleService;
import com.ixtens.triangle.service.TriangleTypeDeterminator;
import com.ixtens.triangle.service.TriangleValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TriangleServiceImpl implements TriangleService {

    private final TriangleValidationService triangleValidationService;
    private final TriangleTypeDeterminator triangleTypeDeterminator;

    @Autowired
    public TriangleServiceImpl(TriangleValidationService triangleValidationService, TriangleTypeDeterminator triangleTypeDeterminator) {
        this.triangleValidationService = triangleValidationService;
        this.triangleTypeDeterminator = triangleTypeDeterminator;
    }

    @Override
    public TriangleType getTypeOfTriangle(TriangleRequestDto triangleDto) {
        triangleValidationService.validateTriangleExist(triangleDto);
        Triangle triangle = TriangleDtoToTriangleConverter.convertTriangleFromDto(triangleDto);
        return triangleTypeDeterminator.getTypeOfTriangle(triangle);
    }
}
