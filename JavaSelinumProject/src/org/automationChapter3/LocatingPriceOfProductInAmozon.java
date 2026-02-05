package org.automationChapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProductInAmozon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.className("nav-search-submit nav-sprite")).click();
		driver.findElement(By.xpath
		("//span[contains(text(),'iPhone 17 Pro Max 2 TB: 17.42 cm "
				+ "(6.9″) Display with Promotion, A19 Pro Chip,"
				+ " Best Battery Life in Any iPhone Ever, Pro Fusion Camera System,"
				+ " Center Stage Front Camera; Deep Blu')]/../../../.."
				+ "span[@class=\"a-price-whole\"]"));
		
	}

}
