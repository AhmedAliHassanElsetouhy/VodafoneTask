package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {
	public OrderPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement viewMyShoppingCart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	WebElement proceedToCheckoutBtn;

	@FindBy(xpath = "//a[@title='Product detail']")
	public WebElement productDetails;

	@FindBy(xpath = "//a[@title='processAddress']")
	WebElement processAddressBtn;

	@FindBy(id = "cgv")
	WebElement agreeCheckBox;

	@FindBy(xpath = "//button[@name='processCarrier']")
	WebElement processCarrierBtn;

	@FindBy(className = "bankwire")
	WebElement bankWire;

	@FindBy(className = "button btn btn-default button-medium")
	WebElement confirmMyOrder;

	@FindBy(className = "dark")
	public WebElement orderCompletedMsg;

	public void openCardFun() {
		mouseHover(viewMyShoppingCart);
	}

	public void proceedToCheckoutFun() {
		proceedToCheckoutBtn.click();
	}

	public void processAddressFun() {
		processAddressBtn.click();
	}

	public void completeShoppingFun() {
		agreeCheckBox.click();
		processCarrierBtn.click();
	}

	public void bankWireFun() {
		bankWire.click();
	}

	public void confirmMyOrderFun() {
		confirmMyOrder.click();
	}

}