package org.automation.Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class ToUnderstandHardAssert {
	@Test
	public void validLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String expectedWelcomePage = "Demo Web Shop";
		String expectedLoginPage = "Demo Web Shop. Login";
		
		
		
	}
}
