package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class Search {
	
	@BeforeStep("@smoke")
	public void BeforeEveryStep()
	{
		System.out.println("Running before Every Step");
	}

	@AfterStep("@smoke")
	public void AfterEveryStep()
	{
		System.out.println("Running After Every Step");
	}
	
	
//	@Before("@register")
//	public void setUp()
//	{
//		System.out.println("Opening the Browser");
//	}
//	
//	@After("@register")
//	public void teardown()
//	{
//		System.out.println("Browser got Closed ");
//	}
	@Given("Search for a valid Product")
	public void search_for_a_valid_product() {
	    System.out.println("User Has search the valid Product");
	}

	@When("User Opens The Application")
	public void user_open_thhe_application() {
	   System.out.println(">> User has Opened the Application");
	}

	@When("User Entered The Valid Product Into Search field")
	public void user_entered_the_valid_product_into_search_field() {
	   
	   System.out.println(">> User Has Entered the Valid product name");
	}

	@When("User Clicked on Search button")
	public void user_clicked_on_search_button1() {
	    System.out.println(">> User has Clikc on Search Button");
	}

	@Then("Valid Product Should Get Displayed")
	public void valid_product_should_get_displayed() {
	    System.out.println(">> Valid Product is displayed");
	}

	@Then("Proper Text Informming to User that is no Product maching should be display")
	public void proper_text_informming_to_user_that_is_no_product_maching_should_be_display() {
	   System.out.println(">> Proper Text informing to the user there is not Search Result"); 
	}

	@Given("User Open the Application")
	public void user_open_the_application() {
	   System.out.println(">> User has Opened the Application");
	}

	@When("User Dont Enter Any Product Name")
	public void user_dont_enter_any_product_name() {
	    System.out.println(">> User left the Field Empty");
	}

	@When("User Clicked on Search Button")
	public void user_clicked_on_search_button() {
	    System.out.println(">> User Clicked on Search button");
	}

}
