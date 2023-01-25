package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/BOOK.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		int data = wb.getSheet("Sheet1").getLastRowNum();
		for (int i = 0; i<=data; i++) {
			String AM = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			String ag =wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(AM+"  "+ag);
			
		}
		
		
	}

}
