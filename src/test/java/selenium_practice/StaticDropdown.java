
package selenium_practice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	public static void main(String[] args) throws IOException {

		try {
			String dbClass = "com.mysql.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/user";
			String user = "root";
			String pass = "root";
			Class.forName(dbClass).newInstance();
			// Get connection to DB
			Connection con = DriverManager.getConnection(dbUrl, user, pass);
			// Statement object to send the SQL statement to the Database
			Statement stmt = con.createStatement();
			printAllUser(stmt);
			insertRecords(stmt);
			printAllUser(stmt);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void printAllUser(Statement stmt) throws SQLException {
		String query = "select * from user_details";
		
		ResultSet res = stmt.executeQuery(query);

		while (res.next()) {
			int Id = res.getInt("id");
			String Name = res.getString("name");
			int Age = res.getInt("age");
			System.out.println(Id + "\t" + Name + "\t" + Age);
		}
	}

	public static void insertRecords(Statement stmt) throws SQLException {
		String query= "insert into user_details(name,age) values(\"jaishankar\",55)";
		stmt.executeUpdate(query);
		
		
	}
	
	
	public static void testDropDown() {
		WebDriver driver = new ChromeDriver();
		Select select = new Select(driver.findElement(By.tagName("select")));
		select.selectByValue("India");
		
		List<WebElement> optionList = select.getOptions();
		
		String actualText = "India";
		
		for (int i = 0; i < optionList.size(); i++) {
			if() {
				
			}
			
		}
		
	}
}
