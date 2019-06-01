package stepdefs;

import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(250);
	}

	@Given("Write a {string} step with precondition in {string}")
	@When("Complete action in {string} step in {string}")
	@Then("Validate the outcome in {string} step in {string}")
	public void step(String step, String scenario) {
		System.out.format("Thread ID - %2d %s step from %s.\n", Thread.currentThread().getId(), step.toUpperCase(),
				scenario.toUpperCase());
	}
}