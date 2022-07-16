package locatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.google.co.in/");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//a[text()='Images']")).click();

	}

}
