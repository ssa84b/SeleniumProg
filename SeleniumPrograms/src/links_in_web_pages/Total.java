package links_in_web_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 List<WebElement> abc=driver.findElements(By.tagName("a"));
		 
		 int num= abc.size();
		 System.out.println(num);
		 
		 for(int i=0;i<=num-1;i++) {
			 
			 String c= abc.get(i).getText();
			 System.out.println(c);
		 }

	}

}
