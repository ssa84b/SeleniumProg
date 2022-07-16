package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.google.co.in/");
		 Thread.sleep(2000);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.tagName("input")).sendKeys("pooja");
	}

}
