package datadriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Toreaddatafrompropertyfile {

	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./Testresources/testData.properties");
	
	Properties properties = new Properties();
	properties.load(fis);
	System.out.println(properties.getProperty("username"));

	}

}
