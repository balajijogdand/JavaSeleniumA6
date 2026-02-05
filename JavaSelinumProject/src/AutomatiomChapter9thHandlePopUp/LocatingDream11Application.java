package AutomatiomChapter9thHandlePopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingDream11Application {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/fantasy-sports");
		/// if iframe is one
		// driver.switchTo().frame(0); 
		
		///using frame (String NameOrid)
		// driver.switchTo().frame("send-sms-iframe"); 
		
		/// using frame (WebElement framElement)
		WebElement frameElement = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("9730746027");
		driver.findElement(By.linkText("GET APP LINK")).click();
		
		// defaultContent() used to give back the controler to the main page or default content.		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Industry Overview")).click();
	}
}
