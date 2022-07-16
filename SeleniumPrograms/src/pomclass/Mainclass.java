package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();

		 
		 Pomclass1 pom=new Pomclass1(driver);
		 pom.search();
		 pom.gsearch();
		 
//		 Thread.sleep(2000);
//		 Pomclass2 pom2= new Pomclass2(driver);
//		 pom2.gmail();
//		 

	}

}
