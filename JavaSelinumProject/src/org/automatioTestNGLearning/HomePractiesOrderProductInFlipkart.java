package org.automatioTestNGLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePractiesOrderProductInFlipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Motrola phones 5g", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='MOTOROLA Edge 60 Pro (Pantone Shadow, 512 GB)']")).click();
		driver.findElement(By.linkText("GO TO CART")).click();
		
	}

}
