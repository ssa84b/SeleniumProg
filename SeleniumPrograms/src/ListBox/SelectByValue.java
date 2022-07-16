package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		 
		WebDriver driver= new ChromeDriver();
		 driver.get("https://techcanvass.com/Examples/multi-select.html");
		 
		 WebElement a= driver.findElement(By.xpath("/html/body/div/form/fieldset/select"));
		 
		 Select s= new Select(a);
		 
		 //select by value
		 s.selectByValue("suzuki");
		  
		 Thread.sleep(3000);
		 // deselect by value
		 
		 s.deselectByValue("suzuki");

	}

}
