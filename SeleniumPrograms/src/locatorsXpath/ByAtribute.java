package locatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ByAtribute {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("hrithik roshan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(3000);
		 
		driver.navigate().back();
		 Thread.sleep(3000);
		 
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 
		String d = driver.getCurrentUrl();
		System.out.println(d);
		
		Thread.sleep(3000);
		
  	String fd= driver.getPageSource();
		System.out.println(fd);
//		
	
		

	}

}
