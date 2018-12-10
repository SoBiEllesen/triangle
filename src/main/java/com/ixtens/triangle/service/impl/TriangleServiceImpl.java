package com.ixtens.triangle.service.impl;

import com.ixtens.triangle.model.Triangle;
import com.ixtens.triangle.model.TriangleType;
import com.ixtens.triangle.service.TriangleService;
import com.ixtens.triangle.service.TriangleValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TriangleServiceImpl implements TriangleService {

    private final TriangleValidationService triangleValidationService;

    @Autowired
    public TriangleServiceImpl(TriangleValidationService triangleValidationService) {
        this.triangleValidationService = triangleValidationService;
    }

    @Override
    public TriangleType getTypeOfTriangle(Triangle triangle) {
        triangleValidationService.validateTriangleExist(triangle);
        if (triangle.getSideA().getLength().equals(triangle.getSideB().getLength())
            && triangle.getSideA().getLength().equals(triangle.getSideC().getLength())) {
            return TriangleType.EQUILATERAL;
        } else if (triangle.getSideA().getLength().equals(triangle.getSideB().getLength()) ||
                   triangle.getSideA().getLength().equals(triangle.getSideC().getLength()) ||
                   triangle.getSideB().getLength().equals(triangle.getSideC().getLength())) {
            return TriangleType.ISOSCELES;
        }

        return TriangleType.SCALENE;
    }
}
