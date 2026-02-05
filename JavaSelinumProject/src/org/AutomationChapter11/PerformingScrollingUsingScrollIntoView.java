package org.AutomationChapter11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformingScrollingUsingScrollIntoView {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.zomato.com/pune");
	WebElement ele = driver.findElement(By.xpath("//h5[text()='Wakad']"));
	
	}

}
