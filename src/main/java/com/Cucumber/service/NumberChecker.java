package com.Cucumber.service;

import java.util.HashMap;
import java.util.Map;

public class NumberChecker {
	Map<String,String> users = Map.of("rushi123","password123","rutik123","password123");

	public String checkEvenOrOdd(int num) {
		if(num %2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
		
	}
	
	public String userLogin(String username,String password) {
		if(users.containsKey(username) && users.containsValue(password)) {
			return "user logged in successfully";
		}
		else {
			return "invalid credentials";
		}
		
	}

	
}
