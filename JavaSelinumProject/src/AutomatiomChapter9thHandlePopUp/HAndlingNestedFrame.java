package AutomatiomChapter9thHandlePopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HAndlingNestedFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");
		// Swiching to the parent frame from main page.
		driver.switchTo().frame("frame1");
		String text1 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text1);
		// SWiching to the chile frame from parent frame
		driver.switchTo().frame(0);
		String text2 = driver.findElement(By.tagName("p")).getText();
		System.out.println(text2);
		
		driver.switchTo().frame("frame1");
		String text3 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text3);
 	}

}
