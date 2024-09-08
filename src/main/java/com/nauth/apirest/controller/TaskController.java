package com.nauth.apirest.controller;

import com.nauth.apirest.TaskService;
import com.nauth.apirest.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @GetMapping
    public List<Task> getAllTask(){
        return taskService.getAllTask();
    }

    @GetMapping("{id}")
    public Task searchTaskById(@PathVariable("id") Long id){
        return taskService.getTaskById(id);
    }

    @DeleteMapping("{id}")
    public void deleteTaskById(@PathVariable("id") Long id){
        taskService.deleteTask(id);
    }

    @PutMapping("{id}")
    public Task createTask(@PathVariable("id") Long id, @RequestBody Task task){
        return taskService.updateTask(id, task);
    }

}
