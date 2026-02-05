package AutomationSameNotesEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingFbLoginPageUsingClassAttributes {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("Balajijogdand729@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Balaji2611@");
			// using name attrinutes
			driver.findElement(By.name("login")).click();	
		}
	}
