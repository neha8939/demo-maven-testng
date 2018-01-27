package testcases;

import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common.TestConfig;
import pageobject.NaukriHome;

public class NaukriHandlesTest extends TestConfig {
	@Test
	public void windowsHandle() {
		NaukriHome home = PageFactory.initElements(driver, NaukriHome.class);
		home.clickIT();
		
		/*String currentWindow = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());

		home.clickCompanies();

		Set<String> windows = driver.getWindowHandles();
		for (String temp : windows) {
			if (!temp.equals(currentWindow)) {
				driver.switchTo().window(temp);
				break;
			}

		}

		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.switchTo().window(currentWindow);
		
		System.out.println(driver.getCurrentUrl());
*/
	}

}
