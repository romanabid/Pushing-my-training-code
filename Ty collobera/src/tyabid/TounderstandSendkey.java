package tyabid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TounderstandSendkey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement usernameTextField = driver.findElement(By.id("email"));
		usernameTextField.clear();
		usernameTextField.sendKeys("abid",Keys.CONTROL+"a");
		usernameTextField.sendKeys(Keys.CONTROL+"c");
		
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(Keys.CONTROL+"v");
		
		
		
		 
		
		

	}

}
