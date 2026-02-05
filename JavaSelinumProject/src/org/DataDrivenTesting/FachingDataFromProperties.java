package org.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FachingDataFromProperties {
	public static void main(String[] args) throws IOException {
		// step 1
		File f = new File("C:\\Users\\balaj\\eclipse-workspace\\JavaSelinumProject\\TestData\\DWS.properties");
		FileInputStream fis = new FileInputStream(f);
		// step 2
		Properties prop = new Properties();
		// step 3
		prop.load(fis);
		// step 4
		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println("email is"+email);
		System.out.println("browser name is"+password);
	}
}
