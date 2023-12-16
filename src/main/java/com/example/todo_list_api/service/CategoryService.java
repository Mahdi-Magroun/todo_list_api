package com.example.todo_list_api.service;

import com.example.todo_list_api.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
}
