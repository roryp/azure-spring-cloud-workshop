package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostConstruct
    public void init() {
        todoRepository.saveAll(Arrays.asList(
                new Todo("1", "First item", true),
                new Todo("2", "Second item", true),
                new Todo("3", "Third item", false)));
    }

    @GetMapping("/")
    public @ResponseBody
    List<Todo> showAllTodos() {
        return todoRepository.findAll();
    }
}