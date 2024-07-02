package com.learn.springboot.mytodowebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class TodoController {

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    private TodoService todoService;

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("learnSpringBoot");

        model.addAttribute("todos", todos);
        return "listTodos";
    }

    // handles GET, POST, ...
    // @RequestMapping("add-todo")
    // public String showNewTodoPage() {
    //     return "todo";
    // }

    // for handling GET
    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage() {
        return "todo";
    }

    // for handling POST
    @RequestMapping(value="add-todo", method = RequestMethod.POST)
    public String addNewTodo() {

        return "redirect:list-todos";
    }
    
}
