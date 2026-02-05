package HomeWorkAllSubject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningAllTheBowserUsingIfElse1_1 {
	public static void main(String[] args) {
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name :");
		String browserName = sc.next();
		// opening chrome browser
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		// opening firefox browser
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		// opening edge browser
		else if(browserName.equalsIgnoreCase("opera")) {
			driver = new EdgeDriver();
		}
		
		else {
			System.err.println("invalid browser name");
		}
	}
}
