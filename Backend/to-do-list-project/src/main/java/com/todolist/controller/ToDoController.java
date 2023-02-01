package com.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.entity.ToDoEntity;
import com.todolist.services.ToDoService;

@CrossOrigin(origins = "*")
@RestController
//@Controller
//@RestController
public class ToDoController {
	
	@Autowired
	private ToDoService toDoService;

	@GetMapping("/getalltodo")
	public List<ToDoEntity> getAllToDoEntity() {
		return toDoService.getAllToDo();
	}
	
	@PostMapping("/savetodo")
	public ToDoEntity saveToDoEntity(@RequestBody ToDoEntity toDoEntity) {
		return toDoService.saveTodo(toDoEntity);
	}
	
	@PutMapping("/edittodo/{id}")
	public ToDoEntity editToDoEntity(@RequestBody ToDoEntity toDoEntity,@PathVariable int id) {
		return toDoService.editTodo(toDoEntity, id);
	}
	
	@DeleteMapping("/deletetodo/{id}")
	public String deleteToDoEntity(@PathVariable int id) {
		return toDoService.deleteTodo(id);
	}
	
	@GetMapping("/gettodobyid/{id}")
	public ToDoEntity getToDoEntityById(@PathVariable int id) {
		return toDoService.getToDoById(id);
	}
}
