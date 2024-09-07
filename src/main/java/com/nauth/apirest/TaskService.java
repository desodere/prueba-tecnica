package com.nauth.apirest;

import com.nauth.apirest.model.Task;
import com.nauth.apirest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task getTaskById(Long id){
        Optional<Task> optionalTask = taskRepository.findById(id);
        return optionalTask.get();
    }

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
