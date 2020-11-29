import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Opensite {

	WebDriver driver;
	 
	 public Opensite()
	 {

	    System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	  
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	    driver.get("https://www.snapdeal.com");
	    

	    driver.findElement(By.id("inputValEnter")).sendKeys("forever 21 tops");
	    driver.findElement(By.xpath("//button[@onclick=\"submitSearchForm('go_header');\"]")).click();
	   
	    driver.findElement(By.linkText("Gift Cards")).click();
	    driver.findElement(By.linkText("Help Center")).click();
	    driver.findElement(By.id("faq_search_text")).sendKeys("I want to track my order");
	    driver.findElement(By.id("faq_search_button")).click();  
	   driver.get("https://www.snapdeal.com");
	 }

	 public static void main(String[] args) {
		 
		 new Opensite();
		 
	 }

	
}
