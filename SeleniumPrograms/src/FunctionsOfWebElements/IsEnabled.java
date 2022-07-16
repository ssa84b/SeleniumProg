package FunctionsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		boolean a=driver.findElement(By.xpath("//input[@aria-label=\'Google Search\']")).isEnabled();
		System.out.println(a);

	}

}
