package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample5 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		// to read numeric value as a string  // just '124 just ' before the number
		
		
		//To reach excel sheet 
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Book1.xlsx");
		
		
    //  String value=WorkbookFactory.create("file").getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		
	//   System.out.println(value);

	}

}
