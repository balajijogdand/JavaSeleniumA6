package AutomationChapter4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FeachingNameFromProductInAmozon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()=\"Continue shopping\"]"));
		driver.findElement(By.id("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("trending lighter");
		driver.findElement(By.id("id=\"nav-search-submit-button\"")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Trending New Alloy Double Fire Lighter Metal Blue Flame Crocodile Dragon Tiger Creative Windproof Open Fire Conversion Lighter Men Gift (Pack of 1)')]")).click();
	}
}