package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDemoWebShopApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Balaji");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Jogdand");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("Balajijogdand@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Balaji2611@");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Balaji2611@");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		
	}

}
