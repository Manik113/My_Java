package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// To fetch numeric type data
		
	// To reach upto Excel file
	 FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Book1.xlsx");
	 
	 
	boolean Value= WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(0).getBooleanCellValue();
				
	}

}
