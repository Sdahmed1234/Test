package TEST1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {
	
	
	@Given("I want to write a step with precondition")
	public void ahmed() {
	   System.out.println("methode 1 executé");
	}

	@When("I complete action")
	public void ahmed2() {
		System.out.println("methode 2 executé");
	}

	@Then("I validate the outcomes")
	public void ahmed3() {
		System.out.println("methode 3 executé");
	}

}
