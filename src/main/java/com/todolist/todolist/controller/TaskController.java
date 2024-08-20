package com.todolist.todolist.controller;

import com.todolist.todolist.model.Task;
import com.todolist.todolist.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String viewHomepage(Model model){
        List<Task> listTasks = taskService.getAllTasks();
        model.addAttribute("listTasks", listTasks);
        
        return "index";
    }


    @GetMapping("/add")
    public String showAddTaskForm(Model model){
        Task task = new Task();
        model.addAttribute("task", task);

        return "add_task";
    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute("task") Task task){
        taskService.saveTask(task);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditTaskForm(@PathVariable("id") Long id, Model model){
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);

        return "edittask";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable("id") Long id){
        taskService.deleteTask(id);

        return "redirect:/";
    }
    
}
