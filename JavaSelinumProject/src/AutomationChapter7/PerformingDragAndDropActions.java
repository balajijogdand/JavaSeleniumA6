package AutomationChapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDropActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[@class=\"No thanks\"]")).click();
		driver.findElement(By.xpath("//input[contains(@placeh  older,'Search') and @aria-label]"));
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//div[@class=\"vue-slider-dot-handle\"]/../../.."));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(slider, 60, 0).perform();
		actions.dragAndDropBy(slider, -30, 0).perform();
	}

}
