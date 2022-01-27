package tyabid;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mamaearth.in/");

		File tempFile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile );
		File des =new File("./errorshot/scr1.png");
//		tempFile.renameTo(des);
		FileUtils.copyFile(tempFile, des);
		
		
		

	}

}
