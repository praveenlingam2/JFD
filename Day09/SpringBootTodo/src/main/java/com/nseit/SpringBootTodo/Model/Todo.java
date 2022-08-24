package com.nseit.SpringBootTodo.Model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Todo {
    private int id;
    private String itemName;
    boolean isCompleted;
}
