package com.nseit.SpringBootTodoJpa.controller;

import com.nseit.SpringBootTodoJpa.model.Todo;
import com.nseit.SpringBootTodoJpa.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public void add(Todo todo) {
        todoService.add(todo);
    }

    @PutMapping
    public void update(Todo todo) {
        todoService.update(todo);

    }

    @GetMapping("/all")
    public List<Todo> view() {
      return todoService.view();
    }

    @DeleteMapping({"id"})
    public void delete(int id) {
        todoService.delete(id);

    }

}
