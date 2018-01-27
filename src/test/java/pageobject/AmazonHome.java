package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.TestConfig;

public class AmazonHome extends TestConfig {
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;

	public void enterItem() {

		searchBox.sendKeys("Shirt");
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
}
