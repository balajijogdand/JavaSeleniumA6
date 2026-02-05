package org.automation.genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadTestData {
	public static String readDataFromProperties(String key) {
	File f = new File("C:.\\TestData\\DWS.properties");
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(f);
	}
	catch(FileNotFoundException e) {
	}
	Properties prop = new Properties();
	try {
		prop.load(fis);
	}
	catch(IOException e) {
		
	}
	return prop.getProperty(key);
	
	}
}
