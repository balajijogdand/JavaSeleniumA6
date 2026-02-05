package AutomationChapter4;

import java.awt.geom.Ellipse2D;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheElementIsEnableOrNot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement TextBox1 = driver.findElement(By.id("textbox1"));
		System.out.println(TextBox1.isEnabled()? "textbox1 is enable" : "textbox1 is disable");
		WebElement textbox2 = driver.findElement(By.id("tb2"));
		System.out.println(textbox2.isEnabled()? "textbox2 is enable" : "textbox2 is disable");
	}

}
