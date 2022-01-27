package tyabid;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementUsingTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		

	}

}
