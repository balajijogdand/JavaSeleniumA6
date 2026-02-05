package AutomationChapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerforingDoubleClickActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mayo.blogspot.com");
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),Double click')]"));
		Actions actions = new Actions(driver);
		// actions.doubleClick(button).perform();
		actions.moveToElement(button).doubleClick().perform();	
	}
}
