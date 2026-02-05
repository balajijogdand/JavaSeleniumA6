package org.LoginTestCaseOnDWS;

import java.time.Duration;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTC {
	public static void main(String[] args) {
    String url = Flib.getPropertyValue("url");
    String sheetname = "register";
    String gender = Flib.getPropertyValue("lastName");
    String FrinstName = Flib.getWorkbookCellValue(sheetname, 1, 1);
    String lastName = Flib.getWorkbookCellValue(sheetname, 1, 2);
    String emailid = Flib.getWorkbookCellValue(sheetname, 1, 3);
    String password = Flib.getWorkbookCellValue(sheetname, 1, 4);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	driver.findElement(By.linkText("Register")).click();
	if(gender.equals("mail")) {
		driver.findElement(By.id("gender-male")).click();
	}
	else {
		driver.findElement(By.id("gender-female")).click();
	}
	driver.findElement(By.id("FirstName")).sendKeys(FrinstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("Email")).sendKeys(emailid);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
	driver.findElement(By.id("register-button")).click();
	System.out.println(url);
	System.out.println(lastName);
	System.out.println(password);
	System.out.println(emailid);
	System.out.println(FrinstName);
	
	}
}
