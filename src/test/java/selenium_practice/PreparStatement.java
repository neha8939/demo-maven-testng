

package selenium_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparStatement {

	public static void main(String[] args) {
		String dbclass = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/user";
		PreparedStatement prep = null;
		try {
			Class.forName(dbclass).newInstance();
			Connection connection = DriverManager.getConnection(url, "root", "root");
			String query = "insert into user_details(name,age) values(?,?)";
			prep = connection.prepareStatement(query);
			// prep.setInt(1, 5);
			prep.setString(1, "narendra");
			prep.setInt(2, 52);

			int count = prep.executeUpdate();
			System.out.println(count);
			// prep.setInt(1, 6);
			prep.setString(1, "gaurav");
			prep.setInt(2, 49);
			count = prep.executeUpdate();
			System.out.println(count);

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
