package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().frame("packageListFrame");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.chro')]")).click();
		  Thread.sleep(3000);
//		   driver.switchTo().parentFrame();
		   driver.switchTo().defaultContent();
		   
		   Thread.sleep(2000);
		    driver.switchTo().frame("classFrame");
		 
		    driver.findElement(By.xpath("/html/body/main/div[2]/ul/li[1]/table/tbody[2]/tr[4]/th/a")).click();
		    

	}

}
