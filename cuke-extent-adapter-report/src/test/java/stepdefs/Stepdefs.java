package stepdefs;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class Stepdefs {

	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(250);
	}

	@Given("Write a {string} step with precondition in {string}")
	@When("Complete action in {string} step in {string}")
	@Then("Validate the outcome in {string} step in {string}")
	public void step(String step, String scenario) {
		System.out.format("%s step from %s.\n", step.toUpperCase(),	scenario.toUpperCase());
	}
}