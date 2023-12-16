package com.example.todo_list_api.controller.v1.admin;

import com.example.todo_list_api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService service;
}
