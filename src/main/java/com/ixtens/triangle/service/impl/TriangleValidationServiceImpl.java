package com.ixtens.triangle.service.impl;

import com.ixtens.triangle.exception.IllegalTriangleException;
import com.ixtens.triangle.model.Triangle;
import com.ixtens.triangle.service.TriangleValidationService;
import org.springframework.stereotype.Service;

@Service
public class TriangleValidationServiceImpl implements TriangleValidationService {

    @Override
    public void validateTriangleExist(Triangle triangle) {
        if (triangle.getSideA().getLength() + triangle.getSideB().getLength() <= triangle.getSideC().getLength()
            || triangle.getSideB().getLength() + triangle.getSideC().getLength() <= triangle.getSideA().getLength()
            || triangle.getSideC().getLength() + triangle.getSideA().getLength() <= triangle.getSideB().getLength()) {
                throw new IllegalTriangleException(triangle);
            }
    }
}
