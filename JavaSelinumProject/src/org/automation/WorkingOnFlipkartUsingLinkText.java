package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFlipkartUsingLinkText {
	public static void main(String[] args) {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		// open the application
		driver.get("https://www.flipkart.com/");
		// locate the search bar using name attributes and enter the mobile name.
		driver.findElement(By.name("q")).sendKeys("Motrola Mobiles",Keys.ENTER);
		// locate the link on the mobile using partial link text.
		driver.findElement(By.linkText("MOTOROLA g05 (Plum Red, 64 GB")).click();
		
	}

}
