package AutomationChapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollingUsingScrollByOrigin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.get("https://www.naukri.com/");
        WebElement targer = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		Thread.sleep(200);
		Actions act = new Actions(driver);
		Thread.sleep(200);
		ScrollOrigin scroll = ScrollOrigin.fromElement(targer);
		Thread.sleep(200);
		act.scrollFromOrigin(scroll, 0, 350).perform();
		Thread.sleep(200);
		targer.click();
	}

}
