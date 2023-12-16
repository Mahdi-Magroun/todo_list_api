package com.example.todo_list_api.exception;

//404
public class NotFound extends RuntimeException {
    public NotFound(String message){
        super(message);
    }
}
