package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//open the file in read mode
		Workbook wb = WorkbookFactory.create(fis);
		//open the file and write the data
		wb.getSheet("CreateCustomer").getRow(1).getCell(3).setCellValue("fail");
       //open the excel in write mode
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		//save the file in write mode (actual writing happens here)
		wb.write(fos);
		//close the file
		wb.close();
	}

}
