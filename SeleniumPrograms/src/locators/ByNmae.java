package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNmae {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("hritvik roshan");
		
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
//	    
		Thread.sleep(2000);

		driver.close();
	}

}
