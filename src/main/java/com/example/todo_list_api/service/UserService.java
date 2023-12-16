package com.example.todo_list_api.service;

import com.example.todo_list_api.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private  final UserRepository userRepository;


}
