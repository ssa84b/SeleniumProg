package scrollbar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(0,1500)");
		
		Thread.sleep(5000);
		
		j.executeScript("window.scrollBy(0,-1000)");

	}

}
