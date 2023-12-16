package com.example.todo_list_api.controller;

import com.example.todo_list_api.exception.BadRequest;
import com.example.todo_list_api.exception.ErrorResponse;
import com.example.todo_list_api.exception.InternalServerError;
import com.example.todo_list_api.exception.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Advice {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleAll(Exception exep){
        ErrorResponse resp = new ErrorResponse();
        resp.setStatus("Failure");
        resp.setMessage(exep.getMessage());
        return new ResponseEntity<ErrorResponse>(resp, HttpStatusCode.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value())) ;
    }
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleNotFound(NotFound exep){
        ErrorResponse resp = new ErrorResponse();
        resp.setStatus("Failure");
        resp.setMessage(exep.getMessage());
        return new ResponseEntity<ErrorResponse>(resp, HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value())) ;
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleInternalServerError(InternalServerError exep){
        ErrorResponse resp = new ErrorResponse();
        resp.setStatus("Failure");
        resp.setMessage(exep.getMessage());
        return new ResponseEntity<ErrorResponse>(resp, HttpStatusCode.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value())) ;
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleBadRequest(BadRequest exep){
        ErrorResponse resp = new ErrorResponse();
        resp.setStatus("Failure");
        resp.setMessage(exep.getMessage());
        return new ResponseEntity<ErrorResponse>(resp, HttpStatusCode.valueOf(HttpStatus.BAD_REQUEST.value())) ;
    }
}
