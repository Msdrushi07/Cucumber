package com.Cucumber.stepdef;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Cucumber.service.NumberChecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	
	
	NumberChecker service;
	String response;
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		service  = new NumberChecker();   
	}

	@When("user try to login with username {string} and password {string}")
	public void user_try_to_login_with_username_and_password(String string, String string2) {
		response = service.userLogin(string, string2);
	}
	

	@Then("display as logged in successfully")
	public void display_as_logged_in_successfully() {
	  assertEquals("user logged in successfully",response);
	}

	@Then("display as invalid credentials")
	public void display_as_invalid_credentials() {
	   assertEquals("invalid credentials",response);
	}

}
