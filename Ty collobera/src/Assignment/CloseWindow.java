package Assignment;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Set<String> allwindows = driver.getWindowHandles();
		String expectthirdwindowtitle = "ICICI";
		for(String s :allwindows) {
			driver.switchTo().window(s);
			String Actualthirdwindowtitle = driver.getTitle();
			if(expectthirdwindowtitle.equals(Actualthirdwindowtitle )) {
				driver.close();
			}
		}
		

	}

}
