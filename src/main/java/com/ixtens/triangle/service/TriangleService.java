package com.ixtens.triangle.service;

import com.ixtens.triangle.model.Triangle;
import com.ixtens.triangle.model.TriangleType;

public interface TriangleService {

    TriangleType getTypeOfTriangle(Triangle triangle);

}
