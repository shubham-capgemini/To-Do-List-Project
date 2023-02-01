package com.todolist.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.entity.ToDoEntity;
import com.todolist.repository.ToDoRepository;
import com.todolist.services.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	ToDoRepository toDoRepository;
	
	@Override
	public List<ToDoEntity> getAllToDo() {
		// TODO Auto-generated method stub
		return toDoRepository.findAll();
	}

	@Override
	public ToDoEntity saveTodo(ToDoEntity toDoEntity) {
		// TODO Auto-generated method stub
		return toDoRepository.save(toDoEntity);
	}

	@Override
	public ToDoEntity editTodo(ToDoEntity toDoEntity, int id) {
		// TODO Auto-generated method stub
		ToDoEntity newToDo=toDoRepository.findById(id).get();
		newToDo.setGroupName(toDoEntity.getGroupName());
		newToDo.setUserName(toDoEntity.getUserName());
		newToDo.setDescription(toDoEntity.getDescription());
		newToDo.setTargetDate(toDoEntity.getTargetDate());
		newToDo.setCompleted(toDoEntity.isCompleted());
		return toDoRepository.save(newToDo);
	}

	@Override
	public String deleteTodo(int id) {
		// TODO Auto-generated method stub
		toDoRepository.deleteById(id);
		return "User With id "+id+" has been successfully deleted";
	}

	@Override
	public ToDoEntity getToDoById(int id) {
		// TODO Auto-generated method stub
		return toDoRepository.findById(id).get();
	}

}
