package com.newtonica.cucu.stepdef;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagStepDefinitions {

	Logger logger = LoggerFactory.getLogger(TagStepDefinitions.class);

	@Given("I want to  write a step with {}")
	public void i_want_to_write_a_step_with_test4(String name) {
		logger.info(() -> name);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		logger.info(() -> int1.toString());
	}

	@Then("I verify the {} in step")
	public void i_verify_the_success_in_step(String status) {
		logger.info(() -> status);
	}
}
