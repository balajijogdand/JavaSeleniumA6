package AutomationChapter5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingTheScreenShotOfAWebPage {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		// step 1
		TakesScreenshot ts = (TakesScreenshot)driver;
		// step 2
		File src = ts.getScreenshotAs(OutputType.FILE);
		// step 3
		File dest = new File("C:\\Users\\balaj\\Desktop\\balaji\\ScreeShot.png");
		FileHandler.copy(src, dest);
	}
}