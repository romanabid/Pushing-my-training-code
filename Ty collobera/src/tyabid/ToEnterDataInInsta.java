package tyabid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterDataInInsta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.name("username")).sendKeys("Abid");
//		driver.findElement(By.name("password")).sendKeys("5478899");
		driver.findElement(By.cssSelector("input[aria-label=\"Phone number, username, or email\"]")).sendKeys("abid");
		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("45757856");
	

	}

}
