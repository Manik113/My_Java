package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetColumnSize1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// To reach upto Excel file
	 FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Excel File\\Book1.xlsx");
	 
	  int CellSize=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	  
	  
	  System.out.println("Cell Size is :" +CellSize);
	  
	  
	}

}
