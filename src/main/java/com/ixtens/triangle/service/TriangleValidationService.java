package com.ixtens.triangle.service;

import com.ixtens.triangle.dto.TriangleRequestDto;

public interface TriangleValidationService {

    void validateTriangleExist(TriangleRequestDto triangle);
}
