package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;
	public static Properties props = new Properties();
	public JavascriptExecutor jse;

	public BasePage() {

		try {
			File file = new File("src/main/java/properties/config.properties");
			FileInputStream fis = new FileInputStream(file);
			props.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void lunchBrowser() {

		if (props.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (props.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			throw new Error("Browser Not Supported");
		}
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(props.getProperty("url"));

	}
	
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
	
}