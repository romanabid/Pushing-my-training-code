package tyabid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationscript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernametextfield = driver.findElement(By.id("username"));
		usernametextfield.clear();
		usernametextfield.sendKeys("admin");
		
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		passwordtextfield.clear();
		passwordtextfield.sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
	

	}

}
