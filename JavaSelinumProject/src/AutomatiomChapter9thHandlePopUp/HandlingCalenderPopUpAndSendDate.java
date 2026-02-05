package AutomatiomChapter9thHandlePopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderPopUpAndSendDate {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.com/");
		// exact date set
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//div[text()='December']/../..//span[text()='26']")).click();
		driver.findElement(By.id("r-date")).click();
		driver.findElement(By.xpath("//div[text()='January']/../..//span[text()='19']")).click();
		
		
	}

}
