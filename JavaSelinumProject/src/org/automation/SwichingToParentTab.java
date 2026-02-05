package org.automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichingToParentTab {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	// capturing the window id or handle of parent or main tab
	
	String parentwindowid = driver.getWindowHandle();
	System.out.println(parentwindowid);
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get("https://www.swiggy.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	
    driver.get("https://www.amazon.in/");
    driver.switchTo().newWindow(WindowType.WINDOW);
    
    // swiching to parent tab using the parent tab wom=ndow id
    
    driver.switchTo().window(parentwindowid);
	}
}
