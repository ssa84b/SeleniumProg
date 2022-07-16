package locatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIndex {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:/soft/chromedrive/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
		 

	}

}
