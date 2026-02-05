package AutomationChapter8Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PassingDataInOpreneHRM {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://orangehrm.com/en/contact-sales");
		WebElement FirstName = driver.findElement(By.xpath("//input[@name=\'FullName\']"));
		WebElement EmailBox = driver.findElement(By.xpath("//input[@name=\'Email\']"));
		Actions actions = new Actions(driver);
		//// first approach
		actions.sendKeys(FirstName, "Balaji")
		.sendKeys(EmailBox, "Balajijogdabd720@gmail.com")
		.keyDown(Keys.ENTER).perform();
		
		//// second aproach
//		actions.moveToElement(EmailBox).sendKeys("Balaji")
		//.moveToElement(EmailBox).click()
//		.sendKeys("balajijogdand720@gmail.com").perform();
	}
}
