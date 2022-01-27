package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.get("https://company.naukri.com/popups/icici/23072021/index.html");
		Thread.sleep(2000);
		driver.get("https://company.naukri.com/popups/techmahindra/9dec2021/index.html");
		Thread.sleep(2000);
		driver.get("https://company.naukri.com/popups/techmahindra/13dec2021/index.html");

	}

}
