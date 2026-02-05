package org.automation.Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
	@Test
	public void LoginMethod() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedWeleComePageTitle = "Demo Web Shop";
		String expectedLoginPageTitle = "Demo Web Shop. Login";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), expectedWeleComePageTitle, "WelCome page is not desplayed");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		
		sa.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login page is not desplayed");
	
		driver.findElement(By.id("Email")).sendKeys("Balajijogdand720@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("Password")).sendKeys("Balajji2611@");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		sa.assertAll();
		driver.quit();
	}
}
