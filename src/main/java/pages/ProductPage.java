package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "group_1")
	WebElement productSize;

	@FindBy(id = "color_8")
	WebElement productColor;

	@FindBy(name = "Submit")
	WebElement addToCartBtn;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	WebElement proceedToCheckoutBtn;

	public void selectcolorAndSizeProductFun(int sizeIndex) {
		selectItemWithIndex(productSize, sizeIndex);
		productColor.click();
	}

	public void checkoutProcedure() {
		addToCartBtn.click();
		proceedToCheckoutBtn.click();
	}
}