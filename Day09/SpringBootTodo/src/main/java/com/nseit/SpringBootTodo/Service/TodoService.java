package com.nseit.SpringBootTodo.Service;

import com.nseit.SpringBootTodo.Model.Todo;
import com.nseit.SpringBootTodo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {
    @Autowired
     TodoRepository todoRepository;

    public void addTodo(Todo todo) {
        ArrayList<Todo> todos = todoRepository.getTodos();
        todos.add(todo);
    }

    public void viewTodo() {
        for (Todo todo : todoRepository.getTodos()) {
            System.out.println(todo.getId() + "-" + todo.getItemName() +
                    "Complete status-" + (todo.isCompleted() ? "Yes" : "No"));
        }
    }

    public void updateTodo(int id) {
        for (Todo todo : todoRepository.getTodos()) {
            if (id == todo.getId()) {
                todo.setCompleted(true);
                break;
            }
        }
    }
    public void removeTodo(int id) {
        for (Todo todo : todoRepository.getTodos()) {
            if (id == todo.getId()) {
                todoRepository.getTodos().remove(todo);
                break;
            }
        }
    }
}

