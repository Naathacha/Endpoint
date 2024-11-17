package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {

	@GetMapping("/tasks")
	public List<Task> getAllTasks() {
	    return taskService.getAllTasks();
	}

}
