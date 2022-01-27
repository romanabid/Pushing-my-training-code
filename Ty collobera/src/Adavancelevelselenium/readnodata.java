package Adavancelevelselenium;
import java.sql.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Adavancelevelselenium.readexceldata.ExcelLib;

public class readnodata {

	public static void main(String[] args) throws InvalidFormatException {
		double testUrl = ExcelLib.readNumberData("Sheet1", 1, 0);
		System.out.println(testUrl);
		boolean username = ExcelLib.readBooleanData("Sheet1", 1, 1);
		System.out.println(username);
		Date password = ExcelLib.readDateData("Sheet1", 1, 2);
		System.out.println(password);

	}

}
