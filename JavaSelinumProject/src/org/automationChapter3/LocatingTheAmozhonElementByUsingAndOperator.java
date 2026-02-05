package org.automationChapter3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTheAmozhonElementByUsingAndOperator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 16 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath
		("// span[contains(text(),'iPhone 17 Pro Max 1 ') and contains(text(),'Silver')]")).click();
		//driver.findElement(By.id("proceedToRetailCheckoutS")).click();
		//driver.findElement(By.id("proceed-to-checkout-action")).click();
		//driver.findElement(By.id("ap_email_login")).sendKeys("9730746027");
	}
}
