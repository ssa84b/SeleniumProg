package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.name("cusid")).sendKeys("pooja");
			
			Thread.sleep(2000);
			 
			driver.findElement(By.name("submit")).click();
			
			Alert alt=driver.switchTo().alert();
			 alt.accept();
//			alt.dismiss();
			
			String b=alt.getText();
			System.out.println(b);
			
			
			
		}
	}

