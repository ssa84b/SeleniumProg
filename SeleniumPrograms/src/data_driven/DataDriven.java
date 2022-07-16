package data_driven;


import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/soft/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 FileInputStream excel= new  FileInputStream("C:/Users/hp/Desktop/excel/projectdetails.xlsx");
		 
		Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
		
		String b=a.getRow(0).getCell(0).getStringCellValue();
		String c=a.getRow(0).getCell(1).getStringCellValue();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys(b);
		driver.findElement(By.name("pass")).sendKeys(c);
		
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
//		driver.navigate().back();

	}

}
