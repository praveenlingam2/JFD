package com.nseit.SpringBootTodoJpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    private Integer id;
    private String item;
    private Boolean isCompleted;
}
