package com.example.todo_list_api.service;

import com.example.todo_list_api.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
}
