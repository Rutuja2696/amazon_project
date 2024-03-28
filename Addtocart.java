package projectfiles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Addtocart extends signin {
	@Test(priority=2)
	  public void productadd()  {
		  
			//searchbox
			WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
			searchbox.sendKeys("headphones");
			
			//searchicon
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
			 //  Scroll down
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("window.scrollBy(0, 250)","");
		     
		     
		  //click on product
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span")).click();

	 ///windowhandling
	Set<String> windowhand=driver.getWindowHandles();//parent and child
	Iterator<String> it =windowhand.iterator();

	String parent =it.next();
	String child=it.next();

	driver.switchTo().window(child);
	JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,250)","");

	  
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();



	  }
}
