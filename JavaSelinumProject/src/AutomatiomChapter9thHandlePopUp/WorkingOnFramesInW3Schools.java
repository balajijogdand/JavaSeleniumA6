package AutomatiomChapter9thHandlePopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnFramesInW3Schools {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_event_onclick");
		driver.switchTo().frame("");
		driver.findElement(By.xpath("//button[text()='The time is?']")).click();
	}
}
