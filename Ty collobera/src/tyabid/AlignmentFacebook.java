package tyabid;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignmentFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().getSize();
		Dimension d = driver.findElement(By.id("email")).getSize();
		System.out.println(d);
		Dimension d1 = driver.findElement(By.id("passContainer")).getSize();
		System.out.println(d1);
		
				
		
	
		
	

	

}
}