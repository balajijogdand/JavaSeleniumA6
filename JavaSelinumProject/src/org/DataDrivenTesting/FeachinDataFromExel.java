package org.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class FeachinDataFromExel {

    public static void main(String[] args) throws Exception  {

        File f = new File("C:\\DataSheet1.xlsx");
        FileInputStream fis = new FileInputStream(f);

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("DataSheet1"); // ONLY ONCE

        Row row = sheet.getRow(1);
        Cell cell = row.getCell(3);

        String data = cell.toString();
        
        System.out.println(data);
        System.out.println(sheet);
        System.out.println(row);
        System.out.println(cell);
    }
}