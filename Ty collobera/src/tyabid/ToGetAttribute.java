package tyabid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.instagram.com/");
		String username = "abid";
		
		
		WebElement usernametextfield = driver.findElement(By.name("username"));
		usernametextfield.clear();
		usernametextfield.sendKeys(username);
		String actualDataEntered = usernametextfield.getAttribute("value");
		System.out.println("actualDataEntered");
	
		if(actualDataEntered.equals(username)) {
			System.out.println("Username is entered properly");
		}

	}

}
