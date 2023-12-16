package com.example.todo_list_api.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorResponse {

    private String status ;
    private String message ;
}
