package org.SelFirstMock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichingCusrser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/balaj/Downloads/Assign.html");
		driver.findElement(By.className("button")).click();
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
//		WebElement locatedElement = driver.findElement(By.xpath("www.swiggy.com"));
//		driver.switchTo().frame(locatedElement);
//		driver.manage().window().maximize();
		Set<String> childid = driver.getWindowHandles();
		System.out.println(childid);
		 String title = driver.getTitle();
		 System.out.println();
	}
}
