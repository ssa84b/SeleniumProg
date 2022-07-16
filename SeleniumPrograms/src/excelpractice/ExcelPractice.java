package excelpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		FileInputStream excel= new FileInputStream("C:/Users/hp/Desktop/excel/projectdetails.xlsx");
		Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
		
		String b= a.getRow(0).getCell(0).getStringCellValue();
		String c=a.getRow(2).getCell(1).getStringCellValue();
		long d= (long) a.getRow(4).getCell(2).getNumericCellValue();
		
		Thread.sleep(3000);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
