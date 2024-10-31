package stepdefinations;

import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Registration {
	
	@When("User Enters Below details")
	public void User_Enters_Below_Details(DataTable dataTable)
	{
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		
		System.out.println("User has Entered the FirstName :"+map.get("FirstName"));
		System.out.println("User has Entered the EmailAddress :"+map.get("LastName"));
		System.out.println("User has Entered the LastName :"+map.get("EmailAddress"));
		System.out.println("User has Entered the :"+map.get("TelephoneNumber"));
		System.out.println("User has Entered the :"+map.get("Password"));
		System.out.println("User has Entered the :"+map.get("ConfirmPassword"));
		
	}
	@Given("User Navigates to the Register account page")
	public void User_Navigates_to_the_Register_account_page()
	{
		System.out.println(">>> User got Navigated to the Register account Page ");
	}
	
	
	@And("Click on Continue Button")
	public void Click_on_Continue_Button()
	{
		System.out.println(">>> User Has Clicked on Continue Button");
	}
	
	@Then("Account should be Successfully Created")
	public void Account_should_be_Successfully_Created()
	{
		System.out.println(">>> Account has be Created Successfully");
	}
	
	@And("Select Yes for NewsLetter")
	public void Select_Yes_for_NewsLetter() {
		System.out.println(">>> User Has Selected Yes for NewsLetter");
	}
	
	@And("User Dont Filled Any Details")
	public void User_Dont_Filled_Any_Details()
	{
		System.out.println("User Has not Enter Any Field Values");
	}
	
	@And("Select the Privacy Policy Field")
	public void Select_the_Privacy_Policy_Field()
	{
		System.out.println("User Has Selected the Privacy Policy Field");
	}
	
	@Then("Warning Message should be displayed Under All the Mandatory Field")
	public void Warning_Message_should_be_displayed_Under_All_the_Mandatory_Field()
	{
		System.out.println("Warning Message should be displayed Under All the Mandatory Field");
	}
	
	@Then("Warning Message Displayed Email Is Already In Use")
	public void Warning_Message_Displayed_Email_Is_Already_In_Use()
	{
		System.out.println("Warning Message Displayed Email Is Already In Use");
	}
}
