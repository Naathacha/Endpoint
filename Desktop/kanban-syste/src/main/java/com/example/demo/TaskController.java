package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    // Injeção de dependência do TaskService
    @Autowired
    private TaskService taskService;

    // Endpoint para retornar todas as tarefas
    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        // Corrigido para chamar o método findAll() do TaskService
        return taskService.findAll();
    }
}
