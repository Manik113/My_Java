package Parametarization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3 {

	public static void main(String[] args) throws IOException
	{
		// To fetch numeric type data
		
		// To reach upto Excel file
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Book1.xlsx");
		
	double	Value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue();
	
	  System.out.println(Value);

	}

}
