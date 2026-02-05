package AutomatiomChapter9thHandlePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandllingPromptAlertInDemoQA {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		WebElement promptbutton = driver.findElement(By.id("promtButton"));
		Actions action = new Actions(driver);
		action.scrollToElement(promptbutton).scrollByAmount(0, 300).perform();
		promptbutton.click();
		Alert alert = driver.switchTo().alert();
	    System.out.println("Alert message"+alert.getText());
		alert.sendKeys("Balaji");
		alert.accept();
	}
}
