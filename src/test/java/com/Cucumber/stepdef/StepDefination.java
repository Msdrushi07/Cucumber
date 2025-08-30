package com.Cucumber.stepdef;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

import com.Cucumber.service.NumberChecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

//@CucumberContextConfiguration
//@SpringBootTest
public class StepDefination {

	NumberChecker check = null;
	String actual = null;

	@Given("I want to test my number check method")
	public void i_want_to_test_my_number_check_method() {
		check = new NumberChecker();
	}

	@When("I will pass {int}")
	public void i_will_pass(Integer int1) {
		actual = check.checkEvenOrOdd(int1);
	}

	@Then("output should be even")
	public void output_should_be_even() {
		assertEquals("even", actual);

	}

	@Then("output should be odd")
	public void output_should_be_odd() {
		assertEquals("odd", actual);
	}

}
