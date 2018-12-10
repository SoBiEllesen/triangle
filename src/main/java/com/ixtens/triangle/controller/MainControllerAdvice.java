package com.ixtens.triangle.controller;

import com.ixtens.triangle.dto.ResponseDto;
import com.ixtens.triangle.exception.IllegalTriangleException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Log4j2
public class MainControllerAdvice {

    @ExceptionHandler(IllegalTriangleException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseDto handleIllegalTriangleException(IllegalTriangleException e){
        log.warn(e.getMessage());
        return new ResponseDto(e.getMessage());
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseDto handleArgumentNotValidException(MethodArgumentNotValidException ex) {
        log.error("handleArgumentNotValidException: \"{}\"", ex.getMessage());
        return new ResponseDto(ex.getMessage());
    }
}
