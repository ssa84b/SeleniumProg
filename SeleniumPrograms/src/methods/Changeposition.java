package methods;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Changeposition {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/chromedrive/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		Dimension d= new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p =new Point(100,100);
		driver.manage().window().setPosition(p);
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		 driver.close();
		
	}

}
