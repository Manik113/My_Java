package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_colData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// To fetch data of single column
		
		// To reach upto Excel file
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Excel File\\Book1.xlsx");
		
		// to get particular sheet 
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		// to get last row index
		int RowIndex=Sh.getLastRowNum();
		System.out.println(RowIndex);
		
		// print all row values by taking for loop
		
		for(int i=0; i<=RowIndex; i++)
		{
			String value=Sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
		
		

	}

}
