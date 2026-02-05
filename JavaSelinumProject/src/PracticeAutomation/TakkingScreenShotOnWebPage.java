//package PracticeAutomation;
//
//import java.io.File;
//import java.time.Duration;
//import java.time.LocalDateTime;
//import java.util.logging.FileHandler;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TakkingScreenShotOnWebPage {
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		// step 1
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		// step 2
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		// step 3
//		File dest = new File("C:\\Users\\balaj\\Desktop\\balaji\\ScreeShot.png");
//		FileHandler.Copy(src, dest);
//   }
//}


