package com.todolist;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.todolist.entity.ToDoEntity;
import com.todolist.repository.ToDoRepository;

@SpringBootTest
class ToDoListProjectApplicationTests {
	
	@Autowired
	ToDoRepository toDoRepository;

	@Test
	void contextLoads() {
	}
	@Test
	@Order(1)
	public void testCreate () {
		ToDoEntity todo = new ToDoEntity();
		todo.setId(1);
		todo.setGroupName("Avtar");
		todo.setUserName("Shubham Barsagade");
		todo.setDescription("Task 2 week 2 by Dhivya ");
		todo.setTargetDate(null);
		todo.setCompleted(true);
		toDoRepository.save(todo);
		assertNotNull(toDoRepository.findById(1).get());
	}
//		
//	@Test
//	@Order(2)
//	public void testReadAll () {
//		List list = pRepo.findAll();
//		assertThat(list).size().isGreaterThan(0);
//	}
//		
//	@Test
//	@Order(3)
//	public void testRead () {
//		Product product = pRepo.findById(1L).get();
//		assertEquals("iPhone XR", product.getName());
//	}
//
//
//	
////	@Test
////	public void testReadAll () {
////		List<ToDoEntity> list = toDoRepository.findAll();
////		for (ToDoEntity toDoEntity : list) {
////			System.out.println(toDoEntity);
////		}
////	}
//	
//	@Test
//	public void testRead () {
//		ToDoEntity toDoEntity = toDoRepository.findById(1).get();
//		assertEquals("Avtar", toDoEntity.getGroupName());
//	}
}
