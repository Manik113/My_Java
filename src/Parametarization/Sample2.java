package Parametarization;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// To reach upto excel sheet 
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Book1.xlsx");
		
	String	Value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(Value);

	}

}
