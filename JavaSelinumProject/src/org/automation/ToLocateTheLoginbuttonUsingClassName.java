//package org.automation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ToLocateTheLoginbuttonUsingClassName {
//	public static void main(String[] args) {
//	   WebDriver driver = new ChromeDriver();
//	   driver.manage().window().maximize();
//	   driver.get("https://demowebshop.tricentis.com/");
//	   driver.findElement(By.className("Log in")).click();
//	   driver.findElement(By.id("Email")).sendKeys("Balajijogdand@gmail.com");
//	   driver.findElement(By.id("Password")).sendKeys("Balaji2611@");
//	   driver.findElement(By.className("login-button")).click();
//			   
//	}
//
//}


package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheLoginbuttonUsingClassName {
	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.findElement(By.className("Log in")).click();
	   driver.findElement(By.id("Email")).sendKeys("Balajijogdand@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("Balaji2611@");
	   driver.findElement(By.className("login-button")).click(); 
	}

}
