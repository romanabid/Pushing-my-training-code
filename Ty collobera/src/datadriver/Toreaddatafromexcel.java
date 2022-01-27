package datadriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Toreaddatafromexcel {

	public static void main(String[]args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./Testresources/project data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet("sheet1").getRow(0).getCell(0).toString();
		String data1 = workbook.getSheet("sheet1").getRow(0).getCell(1).toString();
		System.out.println(data);
		System.out.println(data1);
	}
	
}
