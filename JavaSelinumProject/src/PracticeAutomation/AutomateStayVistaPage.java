package PracticeAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateStayVistaPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Enter the url
		driver.get("https://www.stayvista.com/");
		// clcik on location tab
		driver.findElement(By.id("city-page-autocomplete")).click();
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 300).perform();
		driver.findElement(By.xpath("//span[text()='mumbai']")).click();
		
	   Thread.sleep(2000);
		driver.findElement(By.linkText("30-01-2026")).click();
	}
}
