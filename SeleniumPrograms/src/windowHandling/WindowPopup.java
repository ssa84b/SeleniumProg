package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe/");
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://demo.guru99.com/popup.php ");
	
	driver.manage().window().maximize();
	 Thread.sleep(3000);
//	 String d= driver.getTitle();
//	 System.out.println(d);
	 
	 
	 driver.findElement(By.linkText("Click Here")).click();
	 Thread.sleep(3000);
	 
	 Set<String> s= driver.getWindowHandles(); // jhghdjhfwe65465   dgedujhfgwdcf65654
	  
	 Iterator<String> it= s.iterator();
	 
//	 String wnds1= it.next();
	 String wnds2=it.next();

	 
	 driver.switchTo().window(wnds2);
	   
	 Thread.sleep(3000);
//	 String c=driver.getTitle();
//	 System.out.println(c);
//	 
	 driver.findElement(By.name("emailid")).sendKeys("hitesg@gmail.com");
	 Thread.sleep(3000);
	  

	 driver.findElement(By.name("btnLogin")).click();
	 Thread.sleep(3000);
	  driver.findElement(By.linkText("Click Here")).click();
	  Thread.sleep(3000);
//	  driver.close();
//	  Thread.sleep(2000);
//	  driver.switchTo().window(wnds1);
//	  driver.close(); 
//	  driver.quit();
	}

}
