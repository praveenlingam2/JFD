package com.nseit.SpringBootTodo;

import com.nseit.SpringBootTodo.Model.Todo;
import com.nseit.SpringBootTodo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTodoApplication implements CommandLineRunner {
    @Autowired
     TodoService todoService;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootTodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Todo todoOne= new Todo(1,"asd",false);
        Todo todoTwo= new Todo(2,"qwe",false);
        Todo todoThree= new Todo(3,"zxc",false);

        todoService.addTodo(todoOne);
        todoService.addTodo(todoTwo);
        todoService.addTodo(todoThree);

        todoService.viewTodo();
        todoService.updateTodo(1);
        todoService.removeTodo(3);

    }
}
