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

public class Sample1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{   // To reach upto Excel sheet create object FileinputStream  class and
		//pass path in constructor of FileinputStream class 
		
		// To get file format of excel path
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Excel File\\Book1.xlsx");
		
		// To open Excel sheet
		Workbook book=WorkbookFactory.create(file);
		
		// To enter particular sheet
		Sheet Sh=book.getSheet("Sheet1");
		
		// to highlight row of excel sheet
		 Row R=Sh.getRow(0);
		 
		
		 // To get cell/column of excel sheet
	   Cell	C= R.getCell(0);
	   
	   // to fetch/get/print/retrive information
	    String Value =C.getStringCellValue();
	    
	    System.out.println(Value);   // Mumbai
		
		
		

	}
}
