package com.nseit.SpringBootTodo.Repository;

import com.nseit.SpringBootTodo.Model.Todo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Repository
public class TodoRepository {
    private ArrayList<Todo> todos=new ArrayList<>();
}
