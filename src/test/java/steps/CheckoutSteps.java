package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuthenticationPage;
import pages.BasePage;
import pages.CategoryPage;
import pages.HomePage;
import pages.OrderPage;
import pages.ProductPage;
import pages.RegistrationPage;

public class CheckoutSteps extends BasePage {

	AuthenticationPage authenticationPage;
	RegistrationPage registrationPage;

	HomePage homePage;
	CategoryPage categoryPage;
	ProductPage productPage;
	OrderPage orderPage;
 
	
	@Given("Select “Blouses” Subcategory in “Women” Category")
	public void select_blouses_subcategory_in_women_category() {
		homePage = new HomePage();
		homePage.openWomenCategoryFun();
	}

	@Given("Select resulted product")
	public void select_resulted_product() {
		categoryPage = new CategoryPage();
		categoryPage.openProductFun();
	}
 
	@Given("Select “White” colour and {int} size")
	public void select_white_colour_and_m_size(int sizeIndex) {
		productPage = new ProductPage();
		productPage.selectcolorAndSizeProductFun(sizeIndex);
	}

	@Given("Follow checkout procedure")
	public void follow_checkout_procedure() {
		productPage = new ProductPage();
		productPage.checkoutProcedure();
	}

	@When("Confirm order by selecting bank wire option")
	public void confirm_order_by_selecting_bank_wire_option() {
		// Write code here that turns the phrase above into concrete actions
		orderPage = new OrderPage();
		orderPage.proceedToCheckoutFun();
		orderPage.processAddressFun();
		orderPage.completeShoppingFun();
		orderPage.bankWireFun();
		orderPage.confirmMyOrderFun();
	}

	@Then("Validate order was placed from order history page.")
	public void validate_order_was_placed_from_order_history_page() {
		orderPage = new OrderPage();
		assertTrue(orderPage.orderCompletedMsg.getText().contains("complete"));
	}
}