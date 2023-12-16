package com.example.todo_list_api.repository;

import com.example.todo_list_api.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ItemRepository extends JpaRepository<Item,Long> {
}
