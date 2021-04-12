package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public static WebDriver driver;
	public static Properties props = new Properties();
//	public JavascriptExecutor jse;

	public Select select;

	public void selectItemWithIndex(WebElement menuItem, int index) {
		select = new Select(menuItem);
		select.selectByIndex(index);
	}

	protected static void moveToElement(WebElement elementToMoveTo) {
		Actions generateReportHoverAction = new Actions(driver);
		generateReportHoverAction.moveToElement(elementToMoveTo).perform();
	}

	public void mouseHover(WebElement elementToHoverOn) {
		Actions hoverAction = new Actions(driver);
		hoverAction.moveToElement(elementToHoverOn).perform();
	}

	protected static void clickButton(WebElement button) {
		button.click();
	}

	protected static void setTextElementText(WebElement textElement, String value) {
		textElement.sendKeys(value);
	}

}