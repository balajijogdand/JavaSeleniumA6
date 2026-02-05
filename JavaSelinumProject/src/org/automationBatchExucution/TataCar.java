package org.automationBatchExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataCar {
	@Test
	public void LaunchingCar(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cars.tatamotors.com/");
		Reporter.log("LaunchingCar", true);
	}
}
