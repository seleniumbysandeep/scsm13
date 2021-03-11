package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		//get count of the last row
		int RowNum = wb.getSheet("InvalidLogin").getLastRowNum();
		//read the all the data one by one using for loop
		for(int i=1;i<=RowNum;i++) {
		String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).toString();
		String pw=wb.getSheet("InvalidLogin").getRow(i).getCell(1).toString();
		System.out.println(un+"   "+pw);
		}

		
	}

}
