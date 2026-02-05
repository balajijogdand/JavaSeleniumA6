package org.automationChapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAProducetInFlipkartUsingXpathByConatains {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("motrola edge 60");
		driver.findElement(By.xpath
		("//button[contains(@title,'Search')]")).click();
		driver.findElement(By.xpath
	    ("//div[contains(text().'60 Pro (Pantone Sparking Grafe, 256 GB)')]")).click();
		
		
 	}

}
