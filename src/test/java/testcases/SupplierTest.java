package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelReader;

public class SupplierTest {

	/*
	 * @BeforeClass public void applicableForRun() throws Exception {
	 * if(ExcelReader.isTestExecutable("SupplierTest")) { throw new
	 * SkipException("skipping the test"); } }
	 */

	@DataProvider(name = "supplier")
	public Object[][] supplierData() {
		Object[][] value = null;

		try {
			value = ExcelReader.readXLSXFile("supplierdetails.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	@Test(dataProvider = "supplier", groups = { "supplierdetails" })
	public void printData(String Sname, String Cname) {
		System.out.println("Sname :" + " " + Sname);
		System.out.println("Cname:" + " " + Cname);
	}

}
