package com.example.todo_list_api.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Table(name="category")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "uuid",nullable = false)
    private UUID uuid;
    @Column(name = "name",nullable = false)
    private String name;


    @OneToMany(mappedBy = "parentCategory")
    private List<Category>  categories;

    @ManyToOne()
    @JoinColumn(name = "parent_category_id",nullable = true)
    private Category  parentCategory;
    @Column(name = "created_at",nullable = false)
    private Date createdAt ;

    @Column(name = "updated_at")
    private Date updatedAt ;

    @ManyToOne()
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @OneToMany(mappedBy = "category")
    private List<Item> items  ;
}
