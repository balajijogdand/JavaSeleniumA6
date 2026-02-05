package org.automationGroupExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShahidKapoor {
	@Test(groups = {"PanIndia", "Bollywood"})
	public void LaunchingShahid(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Shahid_Kapoor");
		driver.quit();
  }
}
