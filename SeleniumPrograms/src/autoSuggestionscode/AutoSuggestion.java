package autoSuggestionscode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	driver.findElement(By.name("q")).sendKeys("realme");
	Thread.sleep(3000);
	List<WebElement> a = driver.findElements(By.tagName("li"));
	
	int size= a.size();
	 
	 for (int i=0;i<=size-1;i++) {
		 
		 String abc= a.get(i).getText();
		 System.out.println(abc);
		 Thread.sleep(1000);
	 }
	 
	 a.get(2).click();
	}

}
