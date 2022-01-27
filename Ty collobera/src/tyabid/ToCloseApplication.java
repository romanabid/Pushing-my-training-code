package tyabid;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.close();
		

	}

}
