package tyabid;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("");
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedwindowTitle = "Tech Mahindra";
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualwindowTitle = driver.getTitle();
			if(expectedwindowTitle.equals(actualwindowTitle)) {
				driver.manage().window().maximize();
				break;
			}
			
		}
		

	}

}
