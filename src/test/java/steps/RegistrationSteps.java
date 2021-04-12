package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.RegistrationPage;
import tests.TestBase;

public class RegistrationSteps extends TestBase {

	HomePage homePage;
	AuthenticationPage authenticationPage;
	RegistrationPage registrationPage;

	@Given("I want to create an account")
	public void i_want_to_create_an_account() {
		// Write code here that turns the phrase above into concrete actions
//		lunchBrowser();
		homePage = new HomePage(driver);
		homePage.openAuthenticationPageFun();
	}

	@When("I enter valid {string} and click on create an account button")
	public void i_enter_valid(String email) {
		// Write code here that turns the phrase above into concrete actions
		authenticationPage = new AuthenticationPage(driver);
		authenticationPage.createEmailAccountFun(email);
	}

	@When("Enter {string} {string} {string} {string} {string} {string} {string} {int}")
	public void enter(String fName, String lName, String password, String address, String city, String postCode,
			 String mobilePhone, int stateIndex) {
		registrationPage = new RegistrationPage(driver);
		registrationPage.registerFun(fName, lName, password, address, city, postCode,mobilePhone, stateIndex);
	}

	@Then("Account created successfuly, Home page should open")
	public void account_created_successfuly_home_page_should_open() {
		// Write code here that turns the phrase above into concrete actions
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.logoutLnk.isDisplayed());
	}
}
