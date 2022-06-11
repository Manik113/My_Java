package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_RowData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// To fetch data of Row ie Row Constant Column variable
		
		// To reach upto Excel file
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Excel File\\Book1.xlsx");
				
		// to get particular sheet 
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		// to get Column size or index of cell
		int LastCellIndex=Sh.getRow(0).getLastCellNum()-1;
		
		// print all column values use for loop
		for(int i=0;i<=LastCellIndex; i++)
		{
			String value=Sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
				
				
	}

}
