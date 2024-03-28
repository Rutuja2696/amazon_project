package projectfiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signin {
	WebDriver driver;

	  @BeforeClass 
	    public void setUp() {
	   	driver=new ChromeDriver();
	    }
	  
	@SuppressWarnings("deprecation")
	@BeforeMethod
		public void url() {
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			  // Set implicit wait time
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
@Test(priority=1)
public void sign_in() throws InterruptedException  {
	  // Click on "Hello, Sign in" button
driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

// Enter email/phone number
driver.findElement(By.id("ap_email")).sendKeys("9637635321");

// Click Continue button
driver.findElement(By.id("continue")).click();

// Enter password
driver.findElement(By.id("ap_password")).sendKeys("Rutuja26");

// Click Sign-In button
driver.findElement(By.id("signInSubmit")).click();
Thread.sleep(20000);
//Thread.sleep(5000);

Wait<WebDriver> wait =
	        new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(2))
	            .pollingEvery(Duration.ofMillis(300))
	            .ignoring(ElementNotInteractableException.class);
	

	
}
	
}

