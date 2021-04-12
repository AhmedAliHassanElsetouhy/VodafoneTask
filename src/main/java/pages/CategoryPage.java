package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage{

	@FindBy(xpath = "//a[@class='quick-view']")
	WebElement resultedProduct;
	 
	public void openProductFun() {
		resultedProduct.click();
	}
}
