package util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	public static String readProperty(String filename, String key) {
		String value = "";
		try {
			Properties properties = new Properties();
			String filepath = System.getProperty("user.dir") + "//src//test//java//properties//" + filename;
			InputStream inStream = new FileInputStream(filepath);
			properties.load(inStream);
			value = properties.getProperty(key);
			
		} catch (Exception e) {

			e.printStackTrace();

		}
		return value;
	}

	
}
