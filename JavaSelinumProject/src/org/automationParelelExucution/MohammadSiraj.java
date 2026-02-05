package org.automationParelelExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MohammadSiraj {
	@Test
	public void LaunchingSiraj(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Mohammed_Siraj");
	}
}
