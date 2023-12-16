package com.example.todo_list_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Table(name = "my_app_user")
@Entity
@Getter
@Setter
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id ;
    @Column(name = "uuid",nullable = false)
    private UUID uuid;
    @Column(name = "first_name",length = 70,nullable = false)
    private String firstName;
    @Column(name = "last_name" , length = 70,nullable = false)
    private String lastName;
    @Column(name = "email" , length = 200 ,unique = true ,nullable = false)
    private String email ;

    @OneToMany(mappedBy = "user")
    private List<Category> categories;
    //@Column(columnDefinition = "TEXT")
}
