package org.automationChapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProductFlipkartUsingIndex {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("best phone under 5000",Keys.ENTER);
		WebElement priceElement = driver.findElement(By.xpath
		("(//div[contains(text(),'Nokia 2660 Flip 4G Volte Blue keypad Mobile"
				+ " with Dual Sim & Screen, MP3 Player')]/../.."
				+ "//div[contains(text(),'₹')])[1]"));
		String price = priceElement.getText();
		System.out.println("price : "+price);
	}

}
