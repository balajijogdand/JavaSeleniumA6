package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeachSourceCode {
public static void main(String[] args) {
		
		// target the url.
	    WebDriver Driver = new ChromeDriver();
     	Driver.get("https://www.flipkart.com/");
		String sourcecode = Driver.getPageSource();
		System.out.println(sourcecode);

}
}