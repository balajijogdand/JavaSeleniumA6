package PracticeAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformActionsOnUsingActionsMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("motrola phones g5",Keys.ENTER);
		WebElement logineButton = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(logineButton).click().perform();
	}
}
