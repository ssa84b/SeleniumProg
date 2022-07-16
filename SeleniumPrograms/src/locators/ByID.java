package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//		 driver.findElement(By.id("email")).sendKeys("hello");
		 
          driver.findElement(By.id("email")).click();
          
       
          boolean ab= driver.findElement(By.id("email")).isEnabled();
          System.out.println(ab);
          
          
	}

}
