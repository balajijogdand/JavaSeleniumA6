package org.automationChapter3;

import java.awt.geom.Ellipse2D;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAllAddToCartButtonInAmozon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trending lighter");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> addToCartButton = driver.findElements(By.xpath("//button[@name='submit.addToCart']"));
		System.out.println("addToCartButton");
		
		for(WebElement x : addToCartButton) {
			Thread.sleep(2000);
			x.click();
		}
	}

}
