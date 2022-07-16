package FunctionsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://techcanvass.com/Examples/multi-select.html");
		
		WebElement a=driver.findElement(By.xpath("/html/body/div/form/fieldset/select"));
		
		Select s= new Select(a);
//		s.selectByIndex(0);
//		s.selectByIndex(1);
//		s.selectByIndex(2);
		
		boolean sm=s.isMultiple();
		System.out.println(sm);
	}

}
