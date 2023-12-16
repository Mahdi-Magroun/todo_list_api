package com.example.todo_list_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "item")
@Setter
@Getter
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "uuid",nullable = false)
    private UUID uuid;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "body",columnDefinition = "TEXT")
    private String body;
    @Column(name = "is_done",nullable = false)
    private boolean isDone;
    @Column(name = "done_at")
    private Date doneAt;
    @Column(name = "updated_at")
    private Date updatedAt;
    @Column(name = "created_at",nullable = false)
    private Date createdAt ;

    @ManyToOne()
    @JoinColumn(name = "category_id",nullable = false)
    private Category category;

}
