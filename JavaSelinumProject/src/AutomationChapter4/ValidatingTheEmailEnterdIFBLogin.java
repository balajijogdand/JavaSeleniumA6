package AutomationChapter4;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheEmailEnterdIFBLogin {
	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		String email = "Balajijogdand720@gmail.com";
//		WebElement emailtextbox = driver.switchTo().activeElement();
//		emailtextbox.clear();
//		System.out.println(emailtextbox.getAttribute("class"));
//		emailtextbox.sendKeys("email");
//		String enterEmail = emailtextbox.getAttribute("value");
//		if(email.equals(enterEmail))
//			System.out.println("Email Has Been Sucessfully Enterd");
//		else
//			System.err.println("Email Has Not Been Entered");
		
		Flib.getPropertyValue("email");
	}
}
