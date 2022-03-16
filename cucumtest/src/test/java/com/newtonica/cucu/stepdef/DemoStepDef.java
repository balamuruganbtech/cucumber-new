package com.newtonica.cucu.stepdef;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDef {

	private int numOfCandies = 0;

	@Given("I have this common for scenarios1")
	public void i_have_this_common_for_scenarios1() {
		System.out.println("Common for all scenarios1");
	}
	
	@Given("I have this common for scenarios2")
	public void i_have_this_common_for_scenarios2() {
		System.out.println("Common for all scenarios2");
	}

	@Given("I have this common for {} rule")
	public void i_have_this_common_for_specific_rule(String ruleNumber) {
		System.out.println("	Common for all scenarios under " + ruleNumber + " rule");
	}

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("		I want to write a step with precondition");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("		I complete action");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("		I validate the outcomes");
	}

	@Given("I had {int} candies")
	public void i_had_candies(Integer int1) {
		numOfCandies = int1;
		System.out.println("I had " + int1 + " candies");
	}

	@When("I tasted {int} out of it")
	public void i_tasted_out_of_it(Integer int1) {
		System.out.println("I tasted " + int1 + " out of " + numOfCandies + " candies");
		numOfCandies = numOfCandies - int1;
	}

	@Then("I should have {int} remaining")
	public void i_should_have_remaining(Integer int1) {
		Assertions.assertTrue(int1 == numOfCandies);
		System.out.println("I should have " + numOfCandies + " remaining candies");
	}
}
