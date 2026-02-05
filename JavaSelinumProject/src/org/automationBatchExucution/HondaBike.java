package org.automationBatchExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HondaBike {
   @Test
public void LaunchingBike() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.honda2wheelersindia.com/");
	Reporter.log("LaunchingBike", true);
}
}
