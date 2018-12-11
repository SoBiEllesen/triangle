package com.ixtens.triangle.service;

import com.ixtens.triangle.TriangleTestUtils;
import com.ixtens.triangle.exception.IllegalTriangleException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TriangleValidationServiceTest {

    @Autowired
    private TriangleValidationService triangleValidationService;

    @Test
    public void trianglePossibleTest() {
        triangleValidationService.validateTriangleExist(TriangleTestUtils.createRightTriangleDto());
    }

    @Test(expected = IllegalTriangleException.class)
    public void triangleImpossibleTest() {
        triangleValidationService.validateTriangleExist(TriangleTestUtils.createImpossibleDtoTriangle());
    }
}