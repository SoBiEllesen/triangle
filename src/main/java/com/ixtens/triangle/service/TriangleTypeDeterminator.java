package com.ixtens.triangle.service;

import com.ixtens.triangle.model.Triangle;
import com.ixtens.triangle.model.TriangleType;

public interface TriangleTypeDeterminator {

    TriangleType getTypeOfTriangle(Triangle triangle);
}
