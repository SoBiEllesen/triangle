package com.ixtens.triangle;

import com.ixtens.triangle.dto.TriangleRequestDto;
import com.ixtens.triangle.model.Side;
import com.ixtens.triangle.model.Triangle;

public class TriangleTestUtils {

    private static TriangleRequestDto createTriangleDto(Integer lengthA, Integer lengthB, Integer lengthC){
        return new TriangleRequestDto(lengthA, lengthB, lengthC);
    }

    public static TriangleRequestDto createTriangleDto(){
        return createTriangleDto(1,2,3);
    }

    public static Triangle createTriangleEquilateral(){
        return Triangle.builder()
                .sideA(new Side(5))
                .sideB(new Side(5))
                .sideC(new Side(5))
                .build();
    }

    public static Triangle createTriangleIsoscales(){
        return Triangle.builder()
                .sideA(new Side(5))
                .sideB(new Side(5))
                .sideC(new Side(7))
                .build();
    }

    public static Triangle createTriangleScalene(){
        return Triangle.builder()
                .sideA(new Side(5))
                .sideB(new Side(6))
                .sideC(new Side(7))
                .build();
    }

    public static Triangle createImpossibleTriangle(){
        return Triangle.builder()
                .sideA(new Side(1000))
                .sideB(new Side(5))
                .sideC(new Side(5))
                .build();
    }

    public static TriangleRequestDto createRightTriandleDto(){
        return new TriangleRequestDto(10, 10,10);
    }

    public static TriangleRequestDto createWrongTriandleDto(){
        return new TriangleRequestDto(-10, 10,10);
    }

}
