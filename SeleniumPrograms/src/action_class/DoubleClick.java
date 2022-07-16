package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/Students/Actions");
		
		driver.manage().window().maximize();
	
		
		WebElement a= driver.findElement(By.name("dblClick"));
		
		Actions b=new Actions(driver);
		b.doubleClick().build().perform();
	
	}

}
