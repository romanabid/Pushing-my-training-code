package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTheChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String ParentwindowId = driver.getWindowHandle();
		Set<String>allwindowsIds = driver.getWindowHandles();
		allwindowsIds.remove(ParentwindowId);
		for(String windowId : allwindowsIds) {
		driver.switchTo().window(windowId);
		driver.close();
		 

	}
	
 }

}