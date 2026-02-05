package AutomatiomChapter9thHandlePopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandllingChildWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		//feaching parrent window id
		String parentWindoID = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username/Login Password")).click();
		// feaching all the window id
		Set<String> allWindowID = driver.getWindowHandles();
		// removing parrent window id from all window is
		// so, only child window is avalable in the page.
		allWindowID.remove(allWindowID);
		for(String childWindowID : allWindowID ) {
			driver.switchTo().window(parentWindoID);
		}
		driver.findElement(By.id("nextStep")).click();
	}
}
