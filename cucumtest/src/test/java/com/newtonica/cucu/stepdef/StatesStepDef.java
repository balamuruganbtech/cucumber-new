package com.newtonica.cucu.stepdef;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StatesStepDef {

	private int data = 0;

	@Given("I have a context with data {int}")
	public void i_have_a_context_with_data(Integer data) {
		this.data = data;
	}
	
	@Given("I want to use that data here")
	public void i_want_to_use_that_data_here() {
		this.data++;
		assertEquals(data,11);
	}
	
	@Given("I want to use it further")
	public void i_want_to_use_it_furthre() {
		this.data++;
		assertEquals(data,12);
	}
	
	@When("I complete action on")
	public void i_complete_action() {
		this.data++;
		System.out.println("I complete action with "+this.data);
	}
	
	@Then("validate the outcomes")
	public void validate_the_outcomes() {
		assertEquals(data,13);
	}
}
