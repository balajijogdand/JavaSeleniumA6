package org.automationParameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Parameters("Bname")
	@Test
	public void LounchingAndNaviget(@Optional("Chrome")String browserName) {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase(browserName)) {
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase(browserName)) {
			driver = new EdgeDriver();
		}
		
        else if(browserName.equalsIgnoreCase(browserName)) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}

}
