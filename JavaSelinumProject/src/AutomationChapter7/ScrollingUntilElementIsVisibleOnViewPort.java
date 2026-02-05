package AutomationChapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUntilElementIsVisibleOnViewPort {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/pune");
		WebElement targetedChearis = driver.findElement(By.xpath("//h5[text()='Wakad']"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(targetedChearis).perform();
	}
}
