package stepdefinations;

import io.cucumber.java.en.*;


public class Login {
	
	@Given("user Navigates to Login page")
	public void user_navigates_to_login_page() {
	    System.out.println(">>> User got Navigated to Login Page");
	}

//	@When("User enters the Valid email Address {string}")
//	public void user_enters_the_email_address(String emailAddressText) {
//	    System.out.println(">>> User Enter the valid Email Id Address "+emailAddressText);
//	}

//	@And("Enter the valid Password {string}")
//	public void enter_the_valid_password(String PasswordText) {
//	   System.out.println(">>> User Enters the Valid password"+PasswordText);
//	}

	@And("Click on Login Button")
	public void click_on_login_button() {
	   System.out.println("user Clicks on Login button");
	}

	@Then("User Should Login Successfully")
	public void user_should_login_successfully() {
	   System.out.println("User has been Logged successfully ");
	}
	@When("User enters the Invalid email Address {string}")
	public void user_enters_the_invalid_email_address(String InValidEmailAddress) {
	    System.out.println("User has entered Invalid Email address"+InValidEmailAddress);
	}

	@When("Enter the Invalid Password {string}")
	public void enter_the_invalid_password(String InValidPassword) {
	    System.out.println("user has Entered Invalid Password:"+ InValidPassword);
	}

	@Then("User Should get the warning message")
	public void user_should_not_be_login_successfully() {
	   System.out.println("User Getting the warning message ");
	}

//	@When("User enters the valid email Address {string}")
//	public void user_enters_the_valid_email_address(String ValidEmailText) {
//	    System.out.println("User has Entered valid Email Address :"+ValidEmailText);
//	}

	@When("User Dont enters any Credentials")
	public void user_dont_enters_any_credentials() {
	   System.out.println("User not able to Login ");
	}


	@When("^User enters the valid email Address (.+)$")
	public void user_enters_the_valid_email_address1(String email) {
	   System.out.println("User has Enter the Valid Email address :"+email);
	}

	@And("Enter the valid Password (.+)$")
	public void enter_the_valid_password1 (String password ) {
	    System.out.println("user has entered the Valid Paasword :"+ password);
	}
}
