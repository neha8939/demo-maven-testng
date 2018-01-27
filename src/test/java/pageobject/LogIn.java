package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.TestConfig;
import util.PropertyReader;

public class LogIn extends TestConfig {

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'LOG IN')]")
	WebElement submit;

	public void logIn() {
		String userValue = PropertyReader.readProperty("data.properties", "username");
		String passValue = PropertyReader.readProperty("data.properties", "password");

		username.sendKeys(userValue);
		password.sendKeys(passValue);
		submit.click();

	}

}
