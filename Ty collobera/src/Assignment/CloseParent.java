package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		driver.close();

	}

}
