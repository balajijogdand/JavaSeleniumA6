package org.automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichinToAPerticulerTab {
	public static void main(String[] args) throws InterruptedException {
		// open chrome browser.
		WebDriver driver = new ChromeDriver();
		
		// maximize the  screen.
		driver.manage().window().maximize();
		// by default open new window.
		driver.get("https://chokola.in/");
		
		//to open a new tab.
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://cococart.in/");
		
		//to open a new window.
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.chocolateworld.com/");
		
		//to open a new tab but its open on previous window tab.
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.britannica.com/topic/chocolate");
		// ----------------------------------------------------------
		
		String Expectedurl = "https://www.chocolateworld.com/";
		Set<String> allwindowid = driver.getWindowHandles();
		for(String windowid : allwindowid) {
			driver.switchTo().window(windowid);
			Thread.sleep(2000);
			String actualurl = driver.getCurrentUrl();
			if(Expectedurl.equals(actualurl)) {
				break;
			}
		}
	}

}
