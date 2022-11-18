package com.app.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValiedUser = username.equalsIgnoreCase("charit");
		boolean isValidPassword = password.equalsIgnoreCase("patel");
		
		return isValiedUser & isValidPassword;
	}
}
