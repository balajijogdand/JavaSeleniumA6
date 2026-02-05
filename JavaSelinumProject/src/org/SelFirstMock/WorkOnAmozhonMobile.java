package org.SelFirstMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkOnAmozhonMobile {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// open the url
		driver.get("https://www.amazon.in/");
		
		// serch on product
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 17",Keys.ENTER);
		
		// click on product
        driver.findElement(By.linkText("iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with Promotion up to 120Hz, A19 Pro Chip,"
		+ " Breakthrough Battery Life, Pro Fusion Camera System with Center Stage Front Camera; Cosmic Orange")).click();
        
        // feach price of the product
		String price = driver.findElement(By.xpath("//span[@id='productTitle']/../../../..//span[@class='a-price-whole']")).getText();	     
	    System.out.println("the price of the mobile"+price);
	}
}
