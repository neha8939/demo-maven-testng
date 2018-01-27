package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobject.LogIn;
import util.WebdriverUtil;

public class Smoke2 {

	private WebDriver driver = null;

	@BeforeTest
	@Parameters({ "browser" })
	public void setup(String browser) {
		driver = WebdriverUtil.getWebDriver(browser);
		driver.get("https://devqa8-go.vroozi.com/#/login");
		driver.manage().window().maximize();
	}

	@Test
	public void printDriver1() {
		LogIn logIn = PageFactory.initElements(driver, LogIn.class);
		logIn.logIn();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
