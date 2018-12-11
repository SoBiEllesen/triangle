package com.ixtens.triangle;

import com.ixtens.triangle.dto.TriangleResponseDto;
import com.ixtens.triangle.model.TriangleType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TriangleControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private final static String MAIN_URL = "http://localhost:";
    private final static String METHOD_URL = MAIN_URL + "%d" + "/api/triangle/getTypeOfTriangle";

    @Test
    public void testCorrectTriangle() {
        String url = String.format(METHOD_URL, port);
        ResponseEntity<TriangleResponseDto> triangleTypeResponseEntity =
                restTemplate.postForEntity(url, TriangleTestUtils.createRightTriangleDto(), TriangleResponseDto.class);
        Assert.assertEquals(triangleTypeResponseEntity.getStatusCode(), HttpStatus.OK);
        Assert.assertEquals(Objects.requireNonNull(triangleTypeResponseEntity.getBody()).getTriangleType(), TriangleType.EQUILATERAL);
    }

    @Test
    public void testIncorrectTriangle() {
        String url = String.format(METHOD_URL, port);
        ResponseEntity<TriangleResponseDto> triangleTypeResponseEntity =
                restTemplate.postForEntity(url, TriangleTestUtils.createWrongTriangleDto(), TriangleResponseDto.class);
        Assert.assertEquals(triangleTypeResponseEntity.getStatusCode(), HttpStatus.BAD_REQUEST);
    }
}
