package org.automation.ModulerFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * The Class File is mainly used to interact with the file and fetch the Test data needed for Automation application
 * 
 * @author vishal
 * 
 */
public class Flib{private static final String ExelFile_path = null;
private static final String PROPERTIES_PATH = null;


//File libraryy
/**
 * This method accepts the key and it will fetch the value of the respective key in the given properties file
 * 
 * @param key [String]
 * @return  Value [String]
 */

public static String getPropertyValue(String key) 
{
	
	File file =new File(PROPERTIES_PATH);
	//Use Interface name and PROPERTY_PATH
	FileInputStream fis=null;
	try 
	{
		fis = new  FileInputStream(file);
	}
	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
	Properties prop=new Properties();
	try
	{
		prop.load(fis);
	}
	catch (IOException e) 
	{
	   e.printStackTrace();
	}
	
	String value = prop.getProperty(key) ;
	return value;
	}


/**
 * 
 * @param sheetName
 * @param rowIndex
 * @param celllIndex
 * @return value [String]
 */
	public static String getWorkbookCellValue(String sheetName,int rowIndex,int celllIndex)
	{
		File file =new File(ExelFile_path);
		FileInputStream fis=null;	
		Workbook wb=null;
		
		try 
		{
		fis=new FileInputStream(file);
		wb=WorkbookFactory.create(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace(); 
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
		String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(celllIndex).toString();
		return value;
	}
	
	public static String getNameCellValueMethod(int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("ExelFile_path");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("DataSheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		double data1 = cell.getNumericCellValue();
		
		int data = (int)data1;
		String value = String.valueOf(data);
		return value; 	
	}
	
	public int genarateRandomNumber() {
		Random random = new Random();
		int rn = random.nextInt(1000, 9999);
		return rn;
	}

}