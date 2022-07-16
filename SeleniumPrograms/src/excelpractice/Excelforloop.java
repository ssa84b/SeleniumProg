package excelpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelforloop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
 
		FileInputStream excel=new FileInputStream("C:/Users/hp/Desktop/excel/projectdetails.xlsx");
		
	Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
		 
		int rowno=a.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowno;i++) 
		{
			int cellno=a.getRow(i).getPhysicalNumberOfCells();
			  
			   for(int j=0;j<cellno;j++)
			   {
				   String b=a.getRow(i).getCell(j).getStringCellValue();
				   System.out.print(" "+b);
			   }
			System.out.println();   
		}
	}

}
