package com.todolist.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.todolist.entity.ToDoEntity;

@Component
public interface ToDoService {

	public List<ToDoEntity> getAllToDo();
	
	public ToDoEntity saveTodo(ToDoEntity toDoEntity);
	
	public ToDoEntity editTodo(ToDoEntity toDoEntity,int id);
	
	public String deleteTodo(int id);

	public ToDoEntity getToDoById(int id);


}
