package com.Cucumber.service;

public class NumberChecker {

	public String checkEvenOrOdd(int num) {
		if(num %2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
		
	}

	
}
