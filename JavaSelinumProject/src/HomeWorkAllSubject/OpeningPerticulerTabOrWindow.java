package HomeWorkAllSubject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningPerticulerTabOrWindow {
	public static void main(String[] args) {
		
		String expectedTitle = "https://www.amazon.in/";
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.swiggy.com/");
		String actualTitle = driver.getCurrentUrl();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.jawayezdimotorcycles.com/");
		
		Set<String> allWindowID = driver.getWindowHandles();
		
		for( String windowid : allWindowID ) {
			driver.manage().window();
			
			String actualTitle1 = driver.getCurrentUrl();
			if(actualTitle.equals(expectedTitle)) {
				break;
			}
	}
		System.out.println(actualTitle);
  }
}
