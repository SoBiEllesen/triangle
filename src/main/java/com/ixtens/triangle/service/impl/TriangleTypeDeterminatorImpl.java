package com.ixtens.triangle.service.impl;

import com.ixtens.triangle.model.Triangle;
import com.ixtens.triangle.model.TriangleType;
import com.ixtens.triangle.service.TriangleTypeDeterminator;
import org.springframework.stereotype.Service;

@Service
public class TriangleTypeDeterminatorImpl implements TriangleTypeDeterminator {

    @Override
    public TriangleType getTypeOfTriangle(Triangle triangle) {
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
