package com.nseit.SpringBootTodoJpa.service;

import com.nseit.SpringBootTodoJpa.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nseit.SpringBootTodoJpa.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    public TodoRepository todoRepository;

    public void add(Todo todo) {
        todoRepository.save(todo);
    }

    public void update(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> view() {
        return todoRepository.findAll();
    }

    public void delete(int id) {
        for (Todo todo : todoRepository.findAll()) {
            if (id == todo.getId()) {
                todoRepository.delete(todo);
            }
        }
    }
}
