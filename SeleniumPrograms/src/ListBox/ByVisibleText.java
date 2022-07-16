package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
	WebElement a= driver.findElement(By.xpath("//select[@id='multiselect']"));
	
	Select s=new Select(a);
	
	s.selectByVisibleText("Volvo");
	
	
Thread.sleep(4000);

// deselect by visible text function

s.deselectByVisibleText("Volvo");
Thread.sleep(3000);

driver.close();

	}

}
