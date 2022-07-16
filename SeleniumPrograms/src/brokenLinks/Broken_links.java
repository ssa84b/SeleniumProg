package brokenLinks;




import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("total number of links are " +links.size());
		
		
		for (int i=0;i<=links.size()-1;i++) {
			
			WebElement ele=links.get(i);
			
			String url =ele.getAttribute("href");
			verifylinkactive(url);
		}
		

	}

	private static void verifylinkactive(String linkurl) {
		try {
			URL url =new URL(linkurl);
			HttpURLConnection httpurlconnect= (HttpURLConnection)url.openConnection();
			httpurlconnect.setConnectTimeout(2000);
			httpurlconnect.connect();
			if(httpurlconnect.getResponseCode()==200) {
				System.out.println(linkurl+ "-"+ httpurlconnect.getResponseMessage());
				
			}
			if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkurl+"-"+ httpurlconnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch(Exception e) {
			
		}
		
	}

}
