package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.TestConfig;

public class NaukriHome extends TestConfig {
	@FindBy(css = "a[href='https://login.naukri.com/nLogin/Login.php']")
	WebElement login;

	@FindBy(css = "a.socialBtn.goog.processed")
	WebElement googleLink;

	@FindBy(xpath = "//a[@title='Jobs Posted By Top Companies']")
	WebElement element;
	
	@FindBy(css ="a[title='View Salaries'] button#cjaMain:nth-child(2)")
		WebElement informationTechnology;
	

	public void click() {
		login.click();
	}

	public void clickGoogleLink() {
		googleLink.click();
	}

	public void clickCompanies() {
		element.click();
	}
	public void clickIT() {
		informationTechnology.click();
	}
}
