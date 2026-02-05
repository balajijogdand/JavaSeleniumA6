package AutomationChapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeachingCssPropertiesInFB {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		System.out.println("BG-color = "+ LoginButton.getCssValue("background-color"));
		System.out.println("text-color = "+ LoginButton.getCssValue("color"));
		System.out.println("text-size = "+ LoginButton.getCssValue("font-size"));
	}
}
