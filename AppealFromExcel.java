package com.msd.assign4;

import java.io.FileInputStream;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class AppealFromExcel 
{

	private static final String FILE_PATH = "/Users/mohansharma/Documents/MS-MIS UNO/2 Spring 2017/MSD 8210/Selenius Test/ExcelTestData.xlsx";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(FILE_PATH);
			Workbook workbook = new XSSFWorkbook(fis);
			int numberOfSheets = workbook.getNumberOfSheets();
			
			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);
				Iterator rowIterator = sheet.iterator();
				//iterating over each row
				while (rowIterator.hasNext()) 
				{
					
					Row row = (Row) rowIterator.next();
					
					Iterator cellIterator = row.cellIterator();
					//Iterating over each cell (column wise)  in a particular row.
					while (cellIterator.hasNext()) 
					{
						Cell cell = (Cell) cellIterator.next();
						 switch(cell.getColumnIndex())
						{
						case 0:
							System.out.println(cell.getStringCellValue());
						case 1:
							System.out.println(cell.getDateCellValue());
						case 2:
							System.out.println(cell.getDateCellValue());
						case 3:
							System.out.println(cell.getStringCellValue());
						}   
						
						//The Cell Containing String will is name. 
						
					}
					//end iterating a row, add all the elements of a row in list
			
				}
			}
			fis.close();
			 
		}
		catch(Exception e)
		{
			
		}

	}
}
