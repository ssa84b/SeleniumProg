package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		  driver.manage().window().maximize();
		  
		   driver.findElement(By.partialLinkText("ma")).click();
	}

}
