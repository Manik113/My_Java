package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class 
{
	public static String getDataFromPF(String key) throws IOException
	{
		//step1- create object of FileInputStream class& pass path of the property file
		
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\eclipse-workspace\\MySelenium\\src\\POM_DDF_TestNG_BaseClass_UtilityClass\\property.properties");
		
		// Step2-create object of properties class
		Properties pro=new Properties();
		
		
		pro.load(file); // To open property file
		
		// to fetch data from property file
		
		String value1=pro.getProperty(key);
		return value1;
		
	}
	  // To fetch data from excel sheet
	public static String getTD(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	{
		// step1-To reach upto excel sheet .. create object of FileInputStream class
		FileInputStream file=new FileInputStream("C:\\Users\\Manik Kohale\\Desktop\\Excel File\\Book1.xlsx");
		
		// Step2- to open excel sheet
		Sheet Sh=WorkbookFactory.create(file).getSheet("Data");
		
		String Value1=Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return Value1;
		
		
		
		
	}

}
