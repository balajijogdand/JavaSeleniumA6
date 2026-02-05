package org.automatioTestNGLearning;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodUsingPrivorityOnREgisterationAndLoginTCINDWS {
	String url = "https://demowebshop.tricentis.com/";
	String Firstname = "shiva";
	String lastName = "shinde";
	String Email = "shivshinde132gmail.com";
	String Password = "Shiv123@";
	String gender = "male";
	@Test(priority = 0, invocationCount = 5, threadPoolSize = 2)
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		if(gender.equals("male")) {
			driver.findElement(By.id("gender-male")).click();
		}
		else {
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Password);
		driver.findElement(By.id("register-button")).click();
		System.out.println(url);
		
		}
	
	@Test(priority = 1)
	public void login(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();	
	}
	}
	
