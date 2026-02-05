package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichingControlToAnNewTabOrWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chokola.in/");
		//to open a new tab.
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://cococart.in/");
		//to open a new window.
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.chocolateworld.com/");
		//to open a new tab but its open on previus window tab.
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.britannica.com/topic/chocolate");
	}

}
