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
public class Sample11 {

	public static void main(String[] args) throws  IOException
	{
	//create object of fileInputStream class with excel sheet path as input in constructor
	FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Book1.xlsx");
	
	//to open excel sheet use static method create () from WorkbookFactory class
	Workbook book= WorkbookFactory.create(file);
	
	//to open specific sheet in excel used getSheet() method ie.Sheet1,Sheet2,Sheet3 ..
	// and his return type is Sheet
	Sheet sh=book.getSheet("Sheet1");
	
	// to identify the desired row use getRow() method
	   Row rw=sh.getRow(0);
	  
	   
	 // To identify the desired cell use getCell() Method
	  Cell C1 = rw.getCell(0);   // (row,column) particular address
	  
	  // get value or data from that cell use getStringCellValue() method
	    String  Value= C1.getStringCellValue();
	    
	    System.out.println(Value);
	
 
	}

}
