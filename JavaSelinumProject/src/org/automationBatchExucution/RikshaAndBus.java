package org.automationBatchExucution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RikshaAndBus {
	@Test
	public void LaunchingBus(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://msrtc.maharashtra.gov.in/GeneralPages/Home.aspx");
		Reporter.log("LaunchingHardey", true);
	}
	
	@Test
	public void LaunchingRiksha(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/three-wheelers/re");
		Reporter.log("LaunchingRiksha", true);
	}
}
