package com.app.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private static int todosCount = 0;
	
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(++todosCount, "Charit", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "Charit", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "Charit", "Learn Full Stack Development", LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todosCount, "Charit", "Learn Spring Boot", LocalDate.now().plusYears(4), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String usernameString, String descriptionString, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, usernameString, descriptionString, targetDate, done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		
		//todo.getId() == id
		// todo -> todo.getId() == id
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
	

	public Todo findById(int id) {
		// TODO Auto-generated method stub
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//		Todo todo = todos.stream().filter(predicate).findFirst().get();
		Todo todo = null;
		for(Todo t : todos) {
			if(t.getId() == id) {
				todo = t;
				break;
			}
		}
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteById(todo.getId());
		todos.add(todo);
		
	}
}
