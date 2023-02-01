package com.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.entity.ToDoEntity;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer> {

}
