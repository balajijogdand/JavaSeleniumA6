package org.automationGroupExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SRK {
	@Test(groups = {"PanIndia", "Bollywood"})
	public void LaunchingSRK(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Shah_Rukh_Khan");
		driver.quit();
  }
}