package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingTodecathlogWeb {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.decathlon.in/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("create-account")).click();
		driver.findElement(By.className("textfield vtmn-text-input textfield-input")).sendKeys("9730746027");
		driver.findElement(By.id("lookup-btn-signup")).click();
	}

}
