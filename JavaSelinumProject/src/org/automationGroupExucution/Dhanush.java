package org.automationGroupExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dhanush {
	@Test(groups = {"Tamil", "Bollywood","PanIndia"})
	public void LaunchingDhanush(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Dhanush");
		driver.quit();
  }		
}
