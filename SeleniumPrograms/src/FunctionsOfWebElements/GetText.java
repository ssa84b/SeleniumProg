package FunctionsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 Thread.sleep(2000);
		 String abc= driver.findElement(By.tagName("a")).getText();
		 System.out.println(abc);
		 
		 String def=driver.findElement(By.xpath("//a[@class='gb_d']")).getText();
		 System.out.println(def);
	}

}
