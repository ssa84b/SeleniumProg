package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.google.co.in/");
 
	 String title = driver.getTitle();
	 System.out.println(title);
	
	  
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(3000);
	 
	 driver.navigate().to("https://www.flipkart.com/");
	 
	 Thread.sleep(3000);
	 
	 driver.navigate().back();
	 
	 Thread.sleep(3000);
	 
	 driver.navigate().refresh();
	 
	 Thread.sleep(3000);
	 
	 driver.navigate().forward();
	 
	 Thread.sleep(3000);
	
	 String title1 = driver.getTitle();
	 System.out.println(title1);
	 
	 String gg= driver.getCurrentUrl();
	 System.out.println(gg);
	
	 
	 driver.navigate().to("https://www.amazon.in/");

	 Thread.sleep(3000);
	 
	 driver.close();
	 
	}

}

