package tyabid;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyupandDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
	   List<WebElement>navBarElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions actions = new Actions(driver);
		for(WebElement ele  : navBarElements) {
			actions.keyDown(Keys.CONTROL).click(ele).perform();
			actions.keyUp(Keys.CONTROL).perform();
		}
		Set<String> allwindowIds = driver.getWindowHandles();
		String expectedwindowTitle = "Home Decor - Buy Home Furnishing & Accessories Online - Myntra";
		for(String windowId : allwindowIds) {
			driver.switchTo().window(windowId);
			String actualwindowTitle = driver.getTitle();
			if(expectedwindowTitle.equals(actualwindowTitle)) {
				driver.close();
			}
		}
	
	}

}
