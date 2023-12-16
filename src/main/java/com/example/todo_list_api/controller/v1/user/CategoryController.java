package com.example.todo_list_api.controller.v1.user;

import com.example.todo_list_api.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CategoryController {
    private final CategoryService service ;
}
