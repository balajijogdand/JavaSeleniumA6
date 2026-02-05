package org.automationGroupExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SalmanKhan {
	@Test(groups = {"PanIndia", "Bollywood"})
	public void LaunchingSalman(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Salman_Khan");
		driver.quit();
  }
}
