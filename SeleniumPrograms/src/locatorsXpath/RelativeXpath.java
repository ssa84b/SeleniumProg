package locatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//div[1]//div[1]//div[2]//div[2]//input")).sendKeys("genelia");

		driver.findElement(By.xpath("//div[1]//div[3]//center//input[1]")).click();
	}

}
