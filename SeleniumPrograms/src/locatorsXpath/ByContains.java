package locatorsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByContains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.findElement( By.xpath("//a[contains(text(),'Im')]")).click();
		

	}

}
