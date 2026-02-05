package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichingControlToAnActiveElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.fecebook.com/");
		driver.switchTo().activeElement().sendKeys("KGF chapter-2");
		driver.switchTo().activeElement().submit();
	
	}

}
