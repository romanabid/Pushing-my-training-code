package tyabid;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheHeightAndWidthofTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com");
		
//		Dimension dimension = driver.manage().window().getSize();
//		int height = dimension.getHeight();
//		int width = dimension.getWidth();
//		 System.out.println("Height: "+ height +" and width; "+width);
		Thread.sleep(2000);
		Dimension dimension = new Dimension(1217,1208);
		driver.manage().window().setSize(dimension);

	}

}
