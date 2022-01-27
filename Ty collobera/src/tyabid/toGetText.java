package tyabid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toGetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/");
		    String TogetText1 = driver.findElement(By.id("headerContainer")).getText();
		    
		  
	

	}

}
