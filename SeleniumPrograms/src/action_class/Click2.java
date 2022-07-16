package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/soft/Drivers/chromedriver.exe" );
		
		
		WebDriver driver =  new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(" Hritvik roshan");
		
	}
}
