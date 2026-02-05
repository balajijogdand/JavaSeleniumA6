package org.DataDrivenTesting;

import java.time.Duration;

import org.automation.genericUtilities.ReadTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin {
	public static void main(String[] args) throws InterruptedException {
		String url= ReadTestData.readDataFromProperties("url");
		String email = ReadTestData.readDataFromProperties("email");
		String password = ReadTestData.readDataFromProperties("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println(url);
		System.out.println(email);
		System.out.println(password);
	}
}
