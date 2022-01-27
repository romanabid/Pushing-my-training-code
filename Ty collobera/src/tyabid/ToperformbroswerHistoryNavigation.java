package tyabid;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToperformbroswerHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.get("https://www.linkedin.com/");
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("https://www.skillrary.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		

	}

}
