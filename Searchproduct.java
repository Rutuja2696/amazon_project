package projectfiles;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Searchproduct {
	public class searchfunction extends signin {
		  @Test(priority=2)
		  public void searchproduct() {
			  
			 
			        // Perform search on Amazon
			       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung TV");
			  
			       //click on searchicon button
			      driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
			  
			  
		  }
		}
}
