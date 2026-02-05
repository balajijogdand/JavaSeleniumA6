package PracticeAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class TC_Instagram_Login {

    public static void main(String[] args) throws InterruptedException {
    	
    	String userName = "BalajiJogdand720@gmail.com";
    	String password = "Balaji2611@";
    
    	// lounching the browser
        WebDriver driver = new ChromeDriver();

        // Maximize window
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Instagram
        driver.get("https://www.instagram.com/");

        // Locate username field
        WebElement userNameTB = driver.findElement(By.name(userName));
        userNameTB.sendKeys("your_username");

        // Locate password field
        WebElement passwordTB = driver.findElement(By.name(password));
        passwordTB.sendKeys("your_password");

        // Click login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();

        // Wait to observe result
        Thread.sleep(5000);

        // Validation (basic)
        if (driver.getCurrentUrl().contains("instagram.com")) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }

        // Close browser
        driver.quit();
    }
}
