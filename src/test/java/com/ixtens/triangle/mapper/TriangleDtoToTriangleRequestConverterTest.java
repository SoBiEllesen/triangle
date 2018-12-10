package com.ixtens.triangle.mapper;

import com.ixtens.triangle.TriangleTestUtils;
import com.ixtens.triangle.dto.TriangleRequestDto;
import com.ixtens.triangle.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleDtoToTriangleRequestConverterTest {

    @Test
    public void testConvert(){
        TriangleRequestDto triangleRequestDto = TriangleTestUtils.createTriangleDto();
        Triangle triangle = TriangleDtoToTriangleConverter.convertTriangleFromDto(triangleRequestDto);
        Assert.assertEquals(triangle.getSideA().getLength(), triangleRequestDto.getLengthA());
        Assert.assertEquals(triangle.getSideB().getLength(), triangleRequestDto.getLengthB());
        Assert.assertEquals(triangle.getSideC().getLength(), triangleRequestDto.getLengthC());
    }

}