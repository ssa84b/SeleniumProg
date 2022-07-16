package file_upload_download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		Thread.sleep(3000);
		
		WebElement uploadfile =driver.findElement(By.name("uploadfile_0"));
		
		uploadfile.sendKeys("C:/Users/hp/Documents/dss notes/SOFTWARE TESTING UPDATED DATA/2.Selenium/1.Selenium Theory/1.Automation Introduction.docx");

		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
	}

}
