package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import util.PropertyReader;
import util.WebdriverUtil;

public class TestConfig {

	public static WebDriver driver = null;

	@BeforeClass(alwaysRun = true)
	public void setup() {

		String url = PropertyReader.readProperty("config.properties", "url");
		String browser = PropertyReader.readProperty("config.properties", "browser");

		driver = WebdriverUtil.getWebDriver(browser);

		driver.get(url);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,500);");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

}
