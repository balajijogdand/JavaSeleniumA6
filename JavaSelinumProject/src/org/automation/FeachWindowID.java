package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeachWindowID {
public static void main(String[] args) throws InterruptedException 
{
		
		// target the url.
	    WebDriver Driver = new ChromeDriver();
     	Driver.get("https://www.flipkart.com/");
     	Thread.sleep(2000);
     	
		//String windoid = Driver.getWindowHandle();
		//System.out.println(windoid);
     	Driver.get("https://www.mercedes-benz.co.in/");
     	Thread.sleep(2000);
     	
     	// to navigate back to the flipkart.
     	Driver.navigate().back();
      	Thread.sleep(2000);
      	
     // to navigate forward to the flipkart.
      	Driver.navigate().forward();
      	Thread.sleep(2000);

    	Driver.navigate().refresh();
}

}
