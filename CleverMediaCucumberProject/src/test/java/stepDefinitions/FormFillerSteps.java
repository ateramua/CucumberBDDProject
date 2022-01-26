package stepDefinitions;

import cleverMediaPages.FormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testUtility.TestBase;

public class FormFillerSteps extends TestBase {
	
	@Given("user is on clevermedia web form")
	public void user_is_on_clevermedia_web_form() {
	    initialization();
	}



	@When("user enters first name {string}")
	public void user_enters_first_name(String firstname) {
		FormPage formpage = new FormPage(driver);
		formpage.enterFistName(firstname);
	}

	

	@When("user enters last name {string}")
	public void user_enters_last_name(String lastname) {
	    
	}



	@When("user enters zipcode {string}")
	public void user_enters_zipcode(String zipcode) {
	   
	}



	@When("user enters message {string}")
	public void user_enters_message(String message) {
	    
	}



	@When("user clicks on submit")
	public void user_clicks_on_submit() {
	   
	}

	

	@Then("user should be able to submit form successfully")
	public void user_should_be_able_to_submit_form_successfully() {
	    
	}



}
