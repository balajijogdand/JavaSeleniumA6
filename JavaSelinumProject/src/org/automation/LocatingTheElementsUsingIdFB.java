package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTheElementsUsingIdFB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("Balaji");
		Thread.sleep(2000);
		emailTextBox.sendKeys("@gmail.com");
		
		WebElement emailTextBox1 = driver.findElement(By.id("pass"));
		emailTextBox1.sendKeys("Balaji@123");
		driver.findElement(By.id("login")).click();	
	}
}
