package org.automationGroupExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Puneeth {
	@Test(groups = {"Tamil","PanIndia"})
	public void LaunchingPuneethRajkumar(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Puneeth_Rajkumar");
		driver.quit();
   }
}
