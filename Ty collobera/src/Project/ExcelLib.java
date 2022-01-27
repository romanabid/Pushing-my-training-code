package Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	static String excelpath  = "./Testresources/project data.xlsx";
	
	public static String readStringdata(String  sheetname, int rowNum, int cellNum) {
		Workbook workbook = null;
		
		try {
			File absPath = new File(excelpath);
			FileInputStream fis = new FileInputStream(excelpath);
			workbook  = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (EncryptedDocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}

	}

