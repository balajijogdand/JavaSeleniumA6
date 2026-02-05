package AutomationChapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickActiopns {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		WebElement button = driver.findElement(By.xpath("//button[@class='No thanks'"));
		button.click(); // click() from WenElement
		Actions actions = new Actions(driver);
		actions.click(button);
		actions.moveToElement(button).click().pause(2000).perform();
	}

}
