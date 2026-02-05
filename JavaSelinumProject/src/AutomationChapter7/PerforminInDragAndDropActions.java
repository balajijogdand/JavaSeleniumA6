package AutomationChapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerforminInDragAndDropActions {
	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/dropable");
//		WebElement dragable = driver.findElement(By.xpath("//div[text()='Drag me']"));
//		WebElement dropable = driver.findElement(By.xpath("droppable"));
//		Thread.sleep(5000);
//		Actions action = new Actions(driver);
//		action.dragAndDrop(dragable, dropable).perform();
		
		//// harsha sir application
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("file:///C:/Users/balaj/Downloads/DragDrop.html");
//		WebElement madridBox = driver.findElement(By.id("box7"));
//		WebElement italyBox = driver.findElement(By.id("box106"));
//		
//		WebElement osalBox = driver.findElement(By.id("box1"));
//		WebElement Spain = driver.findElement(By.id("box107"));
//		
//		WebElement RomeBox = driver.findElement(By.xpath("//div[text()='Rome']"));
//		WebElement Denmark = driver.findElement(By.xpath("//div[text()='United States']"));
//		
//		// WebElement madridBox = driver.findElement(By.id("box7"));
//		// WebElement italyBox = driver.findElement(By.id("box106"));
//		
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		action.dragAndDrop(osalBox, Spain).perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(madridBox, italyBox).perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(RomeBox, Denmark).perform();
//		
	
		
		//// using for loop
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("file:///C:/Users/balaj/Downloads/DragDrop.html");
//		Actions action = new Actions(driver);
//		for(int i=1; i<=7; i++) {
//			WebElement capital = driver.findElement(By.id("box"+i));
//			WebElement country = driver.findElement(By.id("box10"+i));
//			action.dragAndDrop(capital, country).perform();
//		}
		
		
		//// using release() method
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/balaj/Downloads/DragDrop.html");
		WebElement capital = driver.findElement(By.xpath("//div[text()='Washington']"));
		WebElement country = driver.findElement(By.xpath("//div[text()='United States']"));
		Actions action = new Actions(driver);
		action.clickAndHold(capital).release().perform();		
	}

}
