package org.genericLibrary;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements FrameWorkConstants{
	public static WebDriver driver;
	@BeforeClass
	public void browserSetup(){
	String BrowserValue = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"chrome");
	String url = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"url");
	
	if(BrowserValue.equalsIgnoreCase("chrome")) {
	driver=new FirefoxDriver();
	}
	
	else if(BrowserValue.equalsIgnoreCase("firefox")) {
	driver= new EdgeDriver();
	}
	
	else if(BrowserValue.equalsIgnoreCase("edge")) {
	driver= new EdgeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	System.out.println(url);
	}
	
	@BeforeMethod
	public void logIn() {
		String email = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"email");
		String password = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"password");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logOut() {
		driver.findElement(By.id("Log Out")).click();
	}
	
	@AfterClass
	public void browserThreDown() {
		driver.quit();
		}
}
