package com.ixtens.triangle.service;

import com.ixtens.triangle.TriangleTestUtils;
import com.ixtens.triangle.model.TriangleType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TriangleServiceTest {

    @Autowired
    private TriangleService triangleService;

    @Test
    public void testTriangleEquilateral() {
        TriangleType typeOfTriangle = triangleService.getTypeOfTriangle(TriangleTestUtils.createTriangleDtoEquilateral());
        Assert.assertEquals(typeOfTriangle, TriangleType.EQUILATERAL);
    }

    @Test
    public void testTriangleIsosceles() {
        TriangleType typeOfTriangle = triangleService.getTypeOfTriangle(TriangleTestUtils.createTriangleDtoIsoscales());
        Assert.assertEquals(typeOfTriangle, TriangleType.ISOSCELES);
    }

    @Test
    public void testTriangleScalene() {
        TriangleType typeOfTriangle = triangleService.getTypeOfTriangle(TriangleTestUtils.createTriangleDtoScalene());
        Assert.assertEquals(typeOfTriangle, TriangleType.SCALENE);
    }
}