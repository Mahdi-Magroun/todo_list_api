package com.example.todo_list_api.exception;

public class InternalServerError extends RuntimeException  {
    public InternalServerError(String message){
        super(message);
    }
}
