package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadTest {
	@Test
	public void testFileUpload() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://image.online-convert.com/convert-to-jpg");

		Thread.sleep(1000);

		
		 driver.findElement(By.id("file")).click();
		 
		  StringSelection ss = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		  Thread.sleep(3000); // native key strokes for CTRL, V and ENTER keys Robot
		 Robot robot = new Robot();
		  
		  robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 

		//List<WebElement> list = driver.findElements(By.tagName("a"));
		//System.out.println("Size ======== "+list.size());

	}
}
