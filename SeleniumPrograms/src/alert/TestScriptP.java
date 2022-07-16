package alert;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestScriptP {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://travel.testsigma.com/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("name")).sendKeys("admin");
		
		driver.findElement(By.name("password")).sendKeys("12345");
		
	 
		driver.findElement(By.name("action")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String a= driver.getCurrentUrl();
		 
		System.out.println(a);
		
		Assert.assertEquals(a, "https://travel.testsigma.com/?name=admin&password=12345&action=");
		
		driver.findElement(By.className("custom-control-label")).click();
		
		boolean ab=driver.findElement(By.className("custom-control-label")).isSelected();
		System.out.println(ab);
		
		driver.findElement(By.xpath("//input[@id='departure']")).click();
		
		driver.findElement(By.xpath("//button[@data-day='17']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		
		driver.findElement(By.linkText("Search flights\r\n" + 
				"        ")).click();
		
		Assert.assertEquals("LD-UK ", "LD-UK");

	}

}
//Navigate to Simply Travel website login page: https://travel.testsigma.com/login
//
//Enter username - admin
//
//Enter password - 12345
//
//Click on the Login button
//
//Verify the URL is https://travel.testsigma.com/?name=admin&password=12345&action=
//
//Check the checkbox - Non-Stop
//
//Click on the Departure Date picker
//
//Click on today's date
//Click on OK
//
//Click on Search Flights
//
//Verify the arrival location