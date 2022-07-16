package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://techcanvass.com/Examples/multi-select.html");
		 
		 WebElement a= driver.findElement(By.xpath("/html/body/div/form/fieldset/select"));
		 
		 Select s= new Select(a);
		 
		 // select my index 
		 s.selectByIndex(2);
		 
		
		 Thread.sleep(3000);
		 
		 //deselect by index
		 
		 s.deselectByIndex(2);
		 
		Thread.sleep(4000);
		
		// selecting all by using for loop because selectall fuction is not available
		 
		  for(int i=0;i<=5;i++) {
			  s.selectByIndex(i);
		  }
		 Thread.sleep(3000);
		 
		 // deselecting all
		 
		 s.deselectAll();
	}

}
