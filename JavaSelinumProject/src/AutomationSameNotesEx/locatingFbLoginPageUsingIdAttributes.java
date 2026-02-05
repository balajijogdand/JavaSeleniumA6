package AutomationSameNotesEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingFbLoginPageUsingIdAttributes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// use id attributes
		driver.findElement(By.id("email")).sendKeys("Balajijogdand729@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Balaji2611@");
		driver.findElement(By.name("login")).click();
		
	}

}
