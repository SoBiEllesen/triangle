package com.ixtens.triangle.service;

import com.ixtens.triangle.TriangleTestUtils;
import com.ixtens.triangle.mapper.TriangleDtoToTriangleConverter;
import com.ixtens.triangle.model.TriangleType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TriangleTypeDeterminatorTest {

    @Autowired
    private TriangleTypeDeterminator triangleTypeDeterminator;

    @Test
    public void testTriangleEquilateral() {
        TriangleType typeOfTriangle = triangleTypeDeterminator.getTypeOfTriangle(
                TriangleDtoToTriangleConverter.convertTriangleFromDto(TriangleTestUtils.createTriangleDtoEquilateral()));
        Assert.assertEquals(typeOfTriangle, TriangleType.EQUILATERAL);
    }

    @Test
    public void testTriangleIsosceles() {
        TriangleType typeOfTriangle = triangleTypeDeterminator.getTypeOfTriangle(
                TriangleDtoToTriangleConverter.convertTriangleFromDto(TriangleTestUtils.createTriangleDtoIsoscales()));
        Assert.assertEquals(typeOfTriangle, TriangleType.ISOSCELES);
    }

    @Test
    public void testTriangleScalene() {
        TriangleType typeOfTriangle = triangleTypeDeterminator.getTypeOfTriangle(
                TriangleDtoToTriangleConverter.convertTriangleFromDto(TriangleTestUtils.createTriangleDtoScalene()));
        Assert.assertEquals(typeOfTriangle, TriangleType.SCALENE);
    }
}