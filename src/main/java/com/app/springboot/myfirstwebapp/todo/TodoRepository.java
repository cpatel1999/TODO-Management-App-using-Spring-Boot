package com.app.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<T, ID> -> Name of the bean/entity, type of the ID field.
public interface TodoRepository extends JpaRepository<Todo, Integer>{
	public List<Todo> findByUsernameString(String usernameString);
}
