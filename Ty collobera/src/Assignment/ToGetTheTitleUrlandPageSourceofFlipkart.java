package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTitleUrlandPageSourceofFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com\\");
		driver.getTitle();
		Thread.sleep(2000);
		String PageSource =driver.getPageSource();
		System.out.println(PageSource);

	}

}
