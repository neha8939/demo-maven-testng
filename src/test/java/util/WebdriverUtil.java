package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebdriverUtil {

	public static WebDriver getWebDriver(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
			return new ChromeDriver();
		case "firefox":
			return new FirefoxDriver();
		case "ie":
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//IEDriverServer.exe");
			return new InternetExplorerDriver();
		case "safari":
			return new SafariDriver();
		case "headless":
			return new HtmlUnitDriver();
		default:
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
			return new ChromeDriver();
		}
	}
}
