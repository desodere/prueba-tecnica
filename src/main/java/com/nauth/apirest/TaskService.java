package com.nauth.apirest;

import com.nauth.apirest.model.Task;
import com.nauth.apirest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
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

    public Task updateTask(Long id, Task task){
        Task taskDb = taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Task not found with id " + id));

        if (Objects.nonNull(task.getState()) && !"".equalsIgnoreCase(task.getState())) {
            taskDb.setState(task.getState());
        }

        return taskRepository.save(taskDb);
    }
}
