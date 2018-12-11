package com.ixtens.triangle.exception;

import com.ixtens.triangle.dto.TriangleRequestDto;

public class IllegalTriangleException extends IllegalStateException {

    public IllegalTriangleException(TriangleRequestDto triangle) {
        super("Triangle with sides " + triangle.toString() + " cant exist in this universe");
    }
}
