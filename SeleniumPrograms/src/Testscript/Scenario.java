package Testscript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://travel.testsigma.com/login");
	
	driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	
	driver.findElement(By.name("name")).sendKeys("admin");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("password")).sendKeys("12345");
	
	 driver.findElement(By.name("action")).click();
	 
	String ab= driver.getCurrentUrl();
	Assert.assertEquals(ab, "https://travel.testsigma.com/?name=admin&password=12345&action=");
	
	driver.findElement(By.xpath("(//div[@class='col-12 p-0']//label)[1]")).click();
	
	driver.findElement(By.className("py-1 px-2 bg-secondary d-flex flex-column position-relative  mr-xl-1 mr-lg-1 mr-md-1 mt-2 mt-sm-2 mt-xl-0 mt-lg-0 mt-md-0 rounded")).click();
	
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@data-day='15']")).click();
	 
	 driver.findElement(By.xpath("//button[text()='Ok']")).click();
	 
	 Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),'Search flights')]")).click();
	   Thread.sleep(2000);
	   
	 
	   WebElement db= driver.findElement(By.xpath("//p[contains(text(),'LD-UK')]"));
	   
	   Assert.assertEquals(db, "LA-US to LD-UK");
	  
	
	}
	

}


//Navigate to Simply Travel website login page: https://travel.testsigma.com/login
//
//Enter username - admin
//
//Enter password - 12345
//
//Click on the Login button
//
//Verify the URL is https://travel.testsigma.com/?name=admin&password=12345&action=
//
//Check the checkbox - Non-Stop
//
//Click on the Departure Date picker
//
//Click on today's date
//Click on OK
//
//Click on Search Flights
//
//Verify the arrival location