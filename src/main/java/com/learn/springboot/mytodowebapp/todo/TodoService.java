package com.learn.springboot.mytodowebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
    
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    //This is static so whenever server restarts all the additional todos will be vanished
    static {
        todos.add(new Todo(++todosCount, "learnSpringBoot", "Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "learnSpringBoot", "Learn DevOps",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "learnSpringBoot", "Learn Full Stack Development",
                LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todosCount,username, description, targetDate, done );
        todos.add(todo);
    }

    public void deleteById(int id){
        // todo.getId == id
        // simplest way to define predicate is by using lamda function
        // todo -> todo.getId() == id 

        Predicate<? super Todo> predicate = todo -> todo.getId() == id ;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id ;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
       
    }

    
}
