package com.newtonica.cucu.stepdef;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	private ChromeDriver driver;

	@Given("I am on duckduckgo home page")
	public void i_am_on_duckduckgo_home_page() {
		driver = new ChromeDriver();
		driver.get("https://duckduckgo.com");

	}

	@Given("I am on google home page")
	public void i_am_on_google_home_page() {
		driver = new ChromeDriver();
		driver.get("https://google.com");

	}

	@When("I search for {string}")
	public void i_search_for(String string) {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(string);
		searchBox.sendKeys(Keys.ENTER);
	}

	@Then("title should start with {string}")
	public void title_should_start_with(String string) {
		String actualTitle = driver.getTitle();
		assertTrue(actualTitle.startsWith(string));
		driver.quit();
	}

}
