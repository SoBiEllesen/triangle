package com.ixtens.triangle.exception;

import com.ixtens.triangle.model.Triangle;

public class IllegalTriangleException extends IllegalStateException {

    public IllegalTriangleException(Triangle triangle) {
        super("Triangle with sides " + triangle.toString() + " cant exist in this universe");
    }
}
