package org.automationParelelExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RishabhPanth {
	@Test
	public void LaunchingRishbh(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Rishabh_Pant");
	}
}
