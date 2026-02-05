package org.automationParelelExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MohammadShami {
		@Test
		public void LaunchingShami(){
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://en.wikipedia.org/wiki/Mohammed_Shami");
		}
}
