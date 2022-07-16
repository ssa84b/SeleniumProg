package action_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logn {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("WebDriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe");
		
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.co.in/");
		 
		Thread.sleep(2000);
		
	driver.get("\"https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=4423684475920205243&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040230&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=CjwKCAjwoMSWBhAdEiwAVJ2ndsP-9YoLk33V0QM_eicJ7ciDgT-V387lYJuNUzIpABU_u4WzX4lo5hoCwWwQAvD_BwE\"");
	
	
	
		
	}

}
