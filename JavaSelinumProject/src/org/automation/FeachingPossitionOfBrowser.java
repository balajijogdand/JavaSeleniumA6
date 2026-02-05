package org.automation;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeachingPossitionOfBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    Point possition = driver.manage().window().getPosition();
		System.out.println(possition);
		System.out.println("x : "+possition.getX());
		System.out.println("y : "+possition.getY());
		
		// new po\sition
		
		Point targetpossition = new Point(-200, 300);
		driver.manage().window().setPosition(targetpossition);
	}

}
