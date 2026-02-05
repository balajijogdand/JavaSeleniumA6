package org.automationGroupExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MageshBabu {
	@Test(groups = {"Tamil","Panindia"})
	public void LaunchingMaheshBabu(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu");
		driver.quit();
	}
}
