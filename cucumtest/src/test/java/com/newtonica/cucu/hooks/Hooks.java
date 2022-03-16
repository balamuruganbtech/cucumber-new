package com.newtonica.cucu.hooks;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	private static Logger logger = LoggerFactory.getLogger(Hooks.class);

	@Before("@args6")
	public void doSomethingBefore() {
		logger.info(() -> "do something before");
	}

	@Before(order = 1)
	public void doSomethingFirst() {
		logger.info(() -> "do something first");
	}

	@After(order = 2)
	public void doSomethingLater(Scenario scenario) {
		logger.info(() -> "do something later" + scenario.getName());
	}

	@After(order = 1)
	public void doSomethingLast(Scenario scenario) {
		logger.info(() -> "do something last" + scenario.getName());
	}
	
	@BeforeStep()
	public void doSomethingBeforeSetup() {
		logger.info(() -> "do something before setup");
	}
	

}
