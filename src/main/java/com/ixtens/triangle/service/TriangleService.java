package com.ixtens.triangle.service;

import com.ixtens.triangle.dto.TriangleRequestDto;
import com.ixtens.triangle.model.TriangleType;

public interface TriangleService {

    TriangleType getTypeOfTriangle(TriangleRequestDto triangleDto);
}
