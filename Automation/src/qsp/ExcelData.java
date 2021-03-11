package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get java representative object of the physical file
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		//open the excel in read mode or create workbook
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet
		Sheet sheet = wb.getSheet("CreateCustomer");
		//get control of the row
		Row row = sheet.getRow(1);
		//get control of the cell
		Cell cell = row.getCell(4);
		//Read the String data
		  double value = cell.getNumericCellValue();
		//print it on the console
		System.out.println(value); 
		//close the workbook
		wb.close();
	}
}
