package AutomationChapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyElementIsSelectedOrNot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement penCheckBox = driver.findElement(By.xpath("//input[@value=\"Pen\" and @name=\"accessories\"]"));
		WebElement bookCheckBox = driver.findElement(By.xpath("//input[@value=\"Book\"]"));
		
		System.out.println(penCheckBox.isSelected()?
				"pen check box is selected" : "pen check box is not selected");
		
		System.out.println(bookCheckBox.isSelected()?
				"book check bos is selected" : "book  check bos is not selected");
	}

}
