package org.automatioTestNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingDependsOnMethodInTC {
	@Test(priority = -4)
	public void LounchingLalkiFashion() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.kalkifashion.com/");
	}
	
	@Test(dependsOnMethods = {"LounchingFullyFilmy", "LounchingLalkiFashion"})
	public void LounchingPurpall() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/");
	}
	
	@Test(priority = 5)
	public void LounchingFullyFilmy() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fullyfilmy.in/");
	}

}
