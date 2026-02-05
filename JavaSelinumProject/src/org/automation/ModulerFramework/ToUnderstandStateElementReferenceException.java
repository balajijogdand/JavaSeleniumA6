package org.automation.ModulerFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStateElementReferenceException {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Enter the url
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		// click on login link
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		Thread.sleep(2000);
		
		// click on email text box and enter email
		WebElement emailTB = driver.findElement(By.id("Email"));
		emailTB.sendKeys("balajijogdand720@gmail.com");
		Thread.sleep(2000);
		
		// click on password text box and enter  password
		WebElement passwordTB = driver.findElement(By.id("Password"));
		passwordTB.sendKeys("Balaji2611@");
		Thread.sleep(2000);
		
		// refresh the browser
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		// click on login button
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
	}
}
