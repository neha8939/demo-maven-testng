package testcases;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelReader;

public class UserRegisterTest {

	private static Logger LOGGER = LogManager.getLogger(UserRegisterTest.class);

	@DataProvider(name = "usercreation")
	public static Object[][] readUserData() {
		
		BasicConfigurator.configure();

		LOGGER.fatal("I am fatal");
		LOGGER.error("I am error");
		LOGGER.warn("I am warn");
		LOGGER.info("I am info ");
		LOGGER.debug("I am debug");

		Object[][] read = null;
		try {
			read = ExcelReader.readXLSXFile("NewUser.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return read;
	}

	@Test(dataProvider = "usercreation", groups = { "runNewUser" })
	public void read(String username, String Firstname, String Lastname, String emailid, String phoneno) {
		System.out.println("username" + username);
		System.out.println("firstname" + Firstname);
		System.out.println("lastname" + Lastname);
		System.out.println("emalid" + emailid);
		System.out.println("phoneno" + phoneno);

	}

}
