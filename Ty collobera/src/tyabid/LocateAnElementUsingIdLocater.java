package tyabid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingIdLocater {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		
//		driver.findElement(By.name("username")).sendKeys("abid");
//		driver.findElement(By.name("pwd")).sendKeys("5465852");
//		Thread.sleep(2000);
//		driver.findElement(By.id("keepLoggedInLabel")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("loginButton")).click();	
//		Thread.sleep(2000);
//		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("naib");

		driver.findElement(By.cssSelector("//nobr[text() = 'actiTIME 2020 Online']")).click();
		
		
		

	}

}
