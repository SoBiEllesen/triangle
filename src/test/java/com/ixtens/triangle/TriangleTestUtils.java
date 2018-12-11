package com.ixtens.triangle;

import com.ixtens.triangle.dto.TriangleRequestDto;

public class TriangleTestUtils {

    private static TriangleRequestDto createTriangleDto(Integer lengthA, Integer lengthB, Integer lengthC) {
        return new TriangleRequestDto(lengthA, lengthB, lengthC);
    }

    public static TriangleRequestDto createTriangleDto() {
        return createTriangleDto(1, 2, 3);
    }

    public static TriangleRequestDto createTriangleDtoEquilateral() {
        return createTriangleDto(5, 5, 5);
    }

    public static TriangleRequestDto createTriangleDtoIsoscales() {
        return createTriangleDto(5, 5, 7);
    }

    public static TriangleRequestDto createTriangleDtoScalene() {
        return createTriangleDto(5, 6, 7);
    }

    public static TriangleRequestDto createImpossibleDtoTriangle() {
        return createTriangleDto(1, 1, 100);
    }

    public static TriangleRequestDto createRightTriangleDto() {
        return new TriangleRequestDto(10, 10, 10);
    }

    public static TriangleRequestDto createWrongTriangleDto() {
        return new TriangleRequestDto(-10, 10, 10);
    }
}
