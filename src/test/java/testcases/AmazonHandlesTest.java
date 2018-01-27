package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common.TestConfig;
import pageobject.AmazonHome;

public class AmazonHandlesTest extends TestConfig {
	@Test
	public void searchBox() {
		AmazonHome amazonHome = PageFactory.initElements(driver, AmazonHome.class);
		amazonHome.enterItem();

	}
}
