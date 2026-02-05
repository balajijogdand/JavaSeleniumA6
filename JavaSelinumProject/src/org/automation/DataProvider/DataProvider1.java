package org.automation.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class DataProvider1 {
	@org.testng.annotations.DataProvider(name="credentails")
	public String [][] DataProviderMethod(){
		String [][] data = {
				   	{"qspiders123@gmail.com" , "Qspider123"},
				   	{"jspiders456@gmail.com" , "Jspider456"},
				   	{"pYspiders789@gmail.com" , "pYspider789"}
		};
		return  data;
	}
			
	@Test(dataProvider = "credentails", dataProviderClass = org.automation.DataProvider.DataProvider1.class)
	public void DWSLoginTC(String email , String password) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys(email);
	Thread.sleep(2000);
	driver.findElement(By.id("Password")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
  }
}
