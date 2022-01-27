package tyabid;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToClosedAllChildwindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String parentwindowId =  driver.getWindowHandle();
		Set<String> allwindowsIds = driver.getWindowHandles();
		allwindowsIds.remove(parentwindowId);
		for(String windowId : allwindowsIds) {
			driver.switchTo().window(windowId);
			driver.close();
		}
		
		
		
				

	}

}
