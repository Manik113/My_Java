package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowSize1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// To reach upto Excel file
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Excel File\\Book1.xlsx");
		
		Workbook S=WorkbookFactory.create(file);
		
		Sheet sh =S.getSheet("Sheet1");
		
	   Row A =sh.getRow(0);
	   
	  Cell B=A.getCell(0);
	
	 String Value=B.getStringCellValue();
	 
	 System.out.println(Value);

	}

}
