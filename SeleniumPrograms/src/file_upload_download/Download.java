package file_upload_download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Download {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=98.0.4758.48/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("chromedriver_win32.zip")).click();
		
	}

}
