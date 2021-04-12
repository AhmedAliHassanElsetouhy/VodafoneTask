package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	@FindBy(id = "customer_firstname")
	WebElement fNameTxtField;

	@FindBy(id = "customer_lastname")
	WebElement lNameTxtField;

	@FindBy(id = "passwd")
	WebElement passwdTxtField;

	@FindBy(id = "address1")
	WebElement addressTxtField;

	@FindBy(id = "city")
	WebElement cityTxtField;

	@FindBy(id = "postcode")
	WebElement postCodeTxtField;

	@FindBy(id = "id_state")
	WebElement stateLst;

	@FindBy(id = "submitAccount")
	WebElement registerBtn;

	public void registerFun(String fName, String lName, String passwd, String address, String city, String postCode,
			int statendex) {

		setTextElementText(fNameTxtField, fName);
		setTextElementText(lNameTxtField, lName);
		setTextElementText(passwdTxtField, passwd);
		setTextElementText(addressTxtField, address);
		setTextElementText(cityTxtField, city);
		selectItemWithIndex(stateLst, statendex);
		setTextElementText(postCodeTxtField, postCode);
		registerBtn.click();
	}
}