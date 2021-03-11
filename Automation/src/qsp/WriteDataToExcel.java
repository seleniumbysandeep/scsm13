package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//read the data from external resource or get the java object--in read mode
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		//open or go to the workbook and write the data
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("CreateCustomer").getRow(1).getCell(5).setCellValue("fail");
		//open the file in write mode
		FileOutputStream fos=new FileOutputStream("./data/TestScript.xlsx");
		 //save the workbook in the write mode(actual writting happens here)
		wb.write(fos);
		//close the workbook
		wb.close();
	}
}
