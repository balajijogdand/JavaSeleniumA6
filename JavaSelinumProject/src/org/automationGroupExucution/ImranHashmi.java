package org.automationGroupExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImranHashmi {
	@Test(groups = {"PanIndia", "Bollywood"})
	public void LaunchingAlluArjun(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Emraan_Hashmi");
		driver.quit();
  }
}
