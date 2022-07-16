package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		//Alert popup
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("pooja");
		
		Thread.sleep(2000);
		 
		driver.findElement(By.name("submit")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
//		driver.switchTo().alert().dismiss();

	}

}
