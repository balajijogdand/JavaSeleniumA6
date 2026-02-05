//package PracticeAutomation;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class datePicker {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://jqueryui.com/datepicker/");
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//		String yearText = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//		String monthText = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//		
//		while(true) {
//			if(yearText="2026" && monthText="january") {
//				
//			}
//		}
//	}
//}
