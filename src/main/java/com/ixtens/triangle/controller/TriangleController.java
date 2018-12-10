package com.ixtens.triangle.controller;

import com.ixtens.triangle.dto.TriangleRequestDto;
import com.ixtens.triangle.dto.TriangleResponseDto;
import com.ixtens.triangle.mapper.TriangleDtoToTriangleConverter;
import com.ixtens.triangle.model.TriangleType;
import com.ixtens.triangle.service.TriangleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/triangle")
public class TriangleController {

    private final TriangleService triangleService;

    @Autowired
    public TriangleController(TriangleService triangleService) {
        this.triangleService = triangleService;
    }

    @PostMapping("getTypeOfTriangle")
    public TriangleResponseDto getTypeOfTriangle(@RequestBody @Validated TriangleRequestDto triangleRequestDto) {
        TriangleType typeOfTriangle = triangleService.getTypeOfTriangle(
                TriangleDtoToTriangleConverter.convertTriangleFromDto(triangleRequestDto));
        return new TriangleResponseDto(typeOfTriangle);
    }
}
