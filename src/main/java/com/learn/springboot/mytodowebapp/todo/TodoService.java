package com.learn.springboot.mytodowebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    
    private static List<Todo> todos;

    static {
        todos.add(new Todo(1, "learnSpringBoot", "Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "learnSpringBoot", "Learn DevOps",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(1, "learnSpringBoot", "Learn Full Stack Development",
                LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
