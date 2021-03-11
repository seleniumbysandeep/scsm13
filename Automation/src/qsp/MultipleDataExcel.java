package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class MultipleDataExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("CreateCustomer").getLastRowNum();	
		for(int i=1;i<=rowcount;i++) {
			String un = wb.getSheet("CreateCustomer").getRow(i).getCell(0).toString();
			String pw = wb.getSheet("CreateCustomer").getRow(i).getCell(1).toString();
			System.out.println(un +"\t"+ pw);
		}
	}
}
