package PracticeAutomation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeachingTextToAmozhon {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.amazon.in/");
			WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			searchbox.sendKeys("iPhone 15",Keys.ENTER);
			System.out.println(searchbox.getTagName());
			System.out.println(searchbox.getText());
	}
}
