package locatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("genelia");
	 
	 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	  driver.navigate().back();
	  driver.close();
	}

}
