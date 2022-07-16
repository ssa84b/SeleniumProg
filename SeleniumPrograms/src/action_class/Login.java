package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.className("nav-a  ")).click();
	    
	    
	}

}
