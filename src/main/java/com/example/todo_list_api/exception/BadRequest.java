package com.example.todo_list_api.exception;

//400
public class BadRequest  extends RuntimeException {
    public  BadRequest(String message){
        super(message);
    }
}
