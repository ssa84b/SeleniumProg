package action_class;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_nd_Drop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("http://www.uitestpractice.com/Students/Actions");
		 
		 WebElement source= driver.findElement(By.id("draggable"));
		 WebElement destination= driver.findElement(By.id("droppable"));
		 
		 Actions a= new Actions(driver);
		  a.dragAndDrop(source, destination).build().perform();;

	}

}
