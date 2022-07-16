package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturingscreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		
		 File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File d=new File("C:/Users/hp/Desktop/New folder/vv.bmp");
		
		 FileUtils.copyFile(s,d);
	}
}
