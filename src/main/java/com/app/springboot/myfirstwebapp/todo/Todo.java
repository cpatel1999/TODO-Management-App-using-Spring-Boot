package com.app.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

//Database(MySQL)
//Static list of todos => Database(H2, MySQL)

@Entity()
public class Todo {

	@Id
	@GeneratedValue
	private int id;
	
//	@Column(name = "name")
	private String usernameString;
	
	@Size(min = 10, message = "Enter atleast 10 characters")
	private String descriptionString;
	private LocalDate targetDate;
	private boolean done;

	public Todo() {}
	
	public Todo(int id, String usernameString, String descriptionString, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.usernameString = usernameString;
		this.descriptionString = descriptionString;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsernameString() {
		return usernameString;
	}

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public String getDescriptionString() {
		return descriptionString;
	}

	public void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", usernameString=" + usernameString + ", descriptionString=" + descriptionString
				+ ", targetDate=" + targetDate + ", done=" + done + "]";
	}

}
