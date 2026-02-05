package AutomationChapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCustomCheckBoxIsDesplayedOrNot {
	public static void main(String[] args) {
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.facebook.com/r.php?locale=en_GB&display=page&entry_point=login");
		WebElement customerGendertextbox = drive.findElement(By.id("custom_gender"));
		if(! customerGendertextbox.isDisplayed()) {
			customerGendertextbox.click();
		}
		else
			drive.findElement(By.xpath("//input[@id=\"custom_gender\"]")).sendKeys("balaji");
	}
}
