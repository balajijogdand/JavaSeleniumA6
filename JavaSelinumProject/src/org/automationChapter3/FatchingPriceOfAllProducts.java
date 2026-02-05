package org.automationChapter3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FatchingPriceOfAllProducts {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("human brain");
		driver.findElement(By.id("nav-search-submit-text")).click();
		List<WebElement> PriceElemenet = driver.findElements(By.className("a-price-whole"));
		for(WebElement PriceElemenets : PriceElemenet) {
			System.err.println(PriceElemenets.getText());
		}
	}

}
