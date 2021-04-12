package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends BasePage{

	@FindBy(id = "email_create")
	WebElement SignInEmailTxtField;
	
	@FindBy(id="SubmitCreate")
	WebElement SubmitSignInEmailBtn;
	
	@FindBy(id = "email")
	WebElement loginEmailTxtField;
	
	@FindBy(id = "passwd")
	WebElement loginPasswordTxtField;
	
	@FindBy(id = "SubmitLogin")
	WebElement signInBtn;

	public void createEmailAccountFun(String registeredEmail) {
		SignInEmailTxtField.sendKeys(registeredEmail);
		SubmitSignInEmailBtn.click();
	}
	
	public void signInAccountFun(String registeredEmail, String registeredPassword) {
		loginEmailTxtField.sendKeys(registeredEmail);
		loginEmailTxtField.sendKeys(registeredPassword);
		signInBtn.click();
	}
}
