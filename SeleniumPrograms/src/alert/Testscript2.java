package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Testscript2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
	     driver.navigate().to("https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver");
	     
	    String d="https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29";
	  
		driver.findElement(By.id("pt-createaccount")).click();
		
		String a= driver.getCurrentUrl();
		
		Assert.assertEquals(d, a);
		
		 driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@href='https://selenium.dev/'][1]")).click();
		
		String b =driver.getCurrentUrl();
		
		String c="https://www.selenium.dev/";
		
		Assert.assertEquals(c,b);
		
		System.out.println(a);
		System.out.println(b);
		Thread.sleep(3000);
		driver.close();

	}

}

//Test Case 1: Verify Internal and External Links in wikipedia.org
//Test Steps:
//1. Launch the Browser
//2. Navigate to https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver selenium page
//3. Click the “Create account” link
//4. Capture the URL
//5. Navigate back to Selenium Page
//6. Click the “selenium.dev” link
//7. Capture the URL
//8. Close the Browser
//
//Verification Point/s:
//1. Verify if the 1st URL is an Internal link
//2. Verify if the 2nd URL is an External link
//
//Input Data/Test Data:
//NA
//
//Expected Result/URL:
//1. https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29
//2. http://www.seleniumhq.org