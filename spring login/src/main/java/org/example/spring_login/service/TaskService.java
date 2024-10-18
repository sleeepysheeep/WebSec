package org.example.spring_login.service;

import org.example.spring_login.entity.Task;
import org.example.spring_login.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TaskService {
    Task saveTask(Task task);

    List<Task> fetchTaskList();

    void deleteTaskById(Long taskId);
}
