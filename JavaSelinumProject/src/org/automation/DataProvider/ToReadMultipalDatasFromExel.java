//package org.automation.DataProvider;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//public class ToReadMultipalDatasFromExel {
//	public static void main(String[] args) throws EncryptedDocumentException , IOException , FileNotFoundException{
//		FileInputStream fis = new FileInputStream("./TestData\\DataSheet1.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet  = wb.getSheet("DataSheet1");
//		int rowCount = sheet.getphysicalOfRows();
//		System.out.println(rowCount);
//		int cellCount = sheet.getRow(1).getphysicalNumberOfCells();
//		System.out.println(cellCount);
//		String[][] creads = new String [rowCount][cellCount];
//		
//		for(int i=1; i<=rowCount; i++) {
//			for(int j=0; j<cellCount; j++) {
//				creads [i-1][j] = sheet.getRow[i].getCell[j].toString();
//			}
//		}	
//		for(String[] arr : creads) {
//			for(String data : arr) {
//				System.out.println(data+" ");
//			}
//			System.out.println();
//		}
//	}
//}
