package org.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingALInkInJawaMotors {
	public static void main(String[] args) {
		// open the browser.
		WebDriver driver = new ChromeDriver();
		// maximize the browser.
		driver.manage().window().maximize();
		// open the application.
		driver.get("https://www.jawayezdimotorcycles.com/");
		// click on service link.
		driver.findElement(By.linkText("Service")).click();
		// click on yezdi motorcycles.
		driver.findElement(By.linkText("Yezdi Motorcycles")).click();
	}

}
