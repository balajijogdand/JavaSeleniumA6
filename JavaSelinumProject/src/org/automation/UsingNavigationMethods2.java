package org.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethods2 {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hondacarindia.com/");
		Thread.sleep(2000);
		URL url = new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
	}
}
