package org.automationGroupExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yesh {
	@Test(groups = {"Tamil", "PanIndia"})
	public void LaunchingYesh(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Yash_(actor)");
		driver.quit();
  }
}
