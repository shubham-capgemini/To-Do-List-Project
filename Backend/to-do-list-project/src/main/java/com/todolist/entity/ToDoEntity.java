package com.todolist.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.asm.Advice.Return;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ToDoEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String groupName;

private String userName;

@Size(min = 10, message = "Enter at least 10 Characters...")
private String description;

private Date targetDate;

private boolean isCompleted=false;

public ToDoEntity(String groupName,String userName, @Size(min = 10, message = "Enter at least 10 Characters...") String description,
		Date targetDate,boolean isCompleted) {
	super();
	this.groupName= groupName;
	this.userName = userName;
	this.description = description;
	this.targetDate = targetDate;
	this.isCompleted= isCompleted;
	
}


}
