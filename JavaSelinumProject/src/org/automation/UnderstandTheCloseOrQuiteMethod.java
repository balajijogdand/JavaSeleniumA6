package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandTheCloseOrQuiteMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		
		// opening a new tag
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		// opening a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		// for observation
		Thread.sleep(2000);
		
		// since control will be in tab which contains indeed application, 
		// that tab will be closed by using close  method.
		driver.close();
		Thread.sleep(2000);
		// closing all the tab
		
	}
}
