package testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.TestConfig;
import pageobject.LogIn;
import util.ExcelReader;

public class LoginTest extends TestConfig {

	@Test
	public void logIn() throws IOException {
		if (!ExcelReader.isTestExecutable("logIn")) {
			throw new SkipException("logIn not executable");
		}
		LogIn logIn = PageFactory.initElements(driver, LogIn.class);
		logIn.logIn();

		String actualtitle = driver.getTitle();
		String expectedTitle = "Welcome to Vroozi";

		Assert.assertEquals(actualtitle, expectedTitle);
		System.out.println("After assert");

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(actualtitle.equals(expectedTitle));

		System.out.println("After verify / softassert");
		softAssert.assertTrue(actualtitle.equals(expectedTitle));
		softAssert.assertAll();
	}

	@Test
	public void printTest() throws IOException {
		if (!ExcelReader.isTestExecutable("printTest")) {
			throw new SkipException("printTest not executable");
		}
		System.out.println("printing this test");
	}
	/*
	 * @Test public void testSnapDeal() throws InterruptedException {
	 * driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 * driver.get("http://Snapdeal.com");
	 * 
	 * Actions action = new Actions(driver);
	 * action.moveToElement(driver.findElement(By.className("accountInner"))).
	 * perform();
	 * 
	 * Thread.sleep(3000);
	 * driver.findElement(By.cssSelector(".accountBtn.btn.rippleWhite")).click();
	 * 
	 * driver.switchTo().frame("loginIframe");
	 * driver.findElement(By.id("googleUserLogin")).click();
	 * 
	 * Set<String> windows = driver.getWindowHandles(); Iterator<String> it =
	 * windows.iterator();
	 * 
	 * String currentWindowHandle = driver.getWindowHandle();
	 * 
	 * String tempHandle = ""; while (it.hasNext()) { tempHandle = it.next(); if
	 * (!tempHandle.equals(currentWindowHandle)) {
	 * driver.switchTo().window(tempHandle); break; } }
	 * 
	 * System.out.println(driver.getTitle()); driver.close();
	 * driver.switchTo().window(currentWindowHandle);
	 * System.out.println(driver.getTitle());
	 * 
	 * driver.quit(); }
	 * 
	 * @AfterMethod public void afterTest(ITestResult iTestResult) throws Exception
	 * { if (iTestResult.getStatus() == ITestResult.FAILURE) { TakesScreenShot
	 * takesScreenShot = (TakesScreenshot) driver; File file =
	 * takesScreenShot.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(file,
	 * new File("D//Screenshot.png")); } }
	 */

}
