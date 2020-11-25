package com.example.demo;

import org.springframework.data.annotation.Id;

public class Todo {

    @Id
    public String id;

    public String description;

    public boolean done;

    public Todo() {
    }

    public Todo(String id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }
}