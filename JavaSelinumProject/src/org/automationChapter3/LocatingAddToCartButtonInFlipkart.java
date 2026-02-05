package org.automationChapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAddToCartButtonInFlipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//button[@alt=\"Continue shopping\"]")).click();
	    driver.findElement(By.name("field-keywords")).sendKeys("motro;a mobiles 5g",Keys.ENTER);
	    driver.findElement(By.id("nav-search-submit-button")).click();
	}
}
