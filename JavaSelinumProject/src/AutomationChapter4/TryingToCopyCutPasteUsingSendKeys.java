package AutomationChapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryingToCopyCutPasteUsingSendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		email.sendKeys("balajijogdand@gmail.com",Keys.CONTROL+ "a");
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+ "c");
		Thread.sleep(2000);
		email.sendKeys(Keys.TAB,Keys.CONTROL+ "v");
		Thread.sleep(2000);
		
		
	}

}
