package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData2 {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream("./data/BOOK.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			int data = wb.getSheet("Sheet1").getLastRowNum();
			short tata = wb.getSheet("Sheet1").getRow(data).getLastCellNum();
			for (int i = 0; i<=data; i++) {
				for (int j = 0; j<tata; j++) {
					String beta = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
					System.out.println(beta);
				}
			}
	}
			

}
