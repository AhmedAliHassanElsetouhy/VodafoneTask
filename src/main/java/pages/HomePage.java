package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	@FindBy(className = "logout")
	public WebElement logoutLnk;
	
	@FindBy(partialLinkText ="Sign in")
	WebElement signInLnk;
	
	@FindBy(xpath = "//a[@title=\"Women\"]")
	WebElement womenCategoryLnk;
	
	@FindBy(xpath = "//a[@title=\"Blouses\"]")
	WebElement blusesWomenCategoryLnk;
		
	public void openAuthenticationPageFun() {
		clickButton(signInLnk);
	}
	
	public void openWomenCategoryFun() {
		mouseHover(womenCategoryLnk);
		moveToElement(blusesWomenCategoryLnk);
	}
}
