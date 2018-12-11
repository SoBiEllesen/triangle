package com.ixtens.triangle.service.impl;

import com.ixtens.triangle.dto.TriangleRequestDto;
import com.ixtens.triangle.exception.IllegalTriangleException;
import com.ixtens.triangle.service.TriangleValidationService;
import org.springframework.stereotype.Service;

@Service
public class TriangleValidationServiceImpl implements TriangleValidationService {

    @Override
    public void validateTriangleExist(TriangleRequestDto triangle) {
        if (triangle.getLengthA() + triangle.getLengthB() <= triangle.getLengthC()
            || triangle.getLengthB() + triangle.getLengthC() <= triangle.getLengthA()
            || triangle.getLengthC() + triangle.getLengthA() <= triangle.getLengthB()) {
            throw new IllegalTriangleException(triangle);
        }
    }
}
