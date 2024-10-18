package org.example.spring_login.controller;

import org.example.spring_login.entity.Task;
import org.example.spring_login.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/tasks")
    public Task saveTask(@RequestBody @Validated Task task) {
        return taskService.saveTask(task);
    }

    @GetMapping("/tasks")
    public List<Task> fetchTaskList() {
        return taskService.fetchTaskList();
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTaskById(@PathVariable("id") Long taskId)  {
        taskService.deleteTaskById(taskId);
        return "Deleted Successfully";
    }
}
