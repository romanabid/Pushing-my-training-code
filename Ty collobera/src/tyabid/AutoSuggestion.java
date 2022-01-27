package tyabid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
	    List<WebElement> listofSuggestion = driver.findElements(By.xpath("//li[@role= 'presentation']"));
		List<WebElement> DataofSuggestion = driver.findElements(By.xpath("//li[@role= 'presentation']"));
		System.out.println("the number of auto suggestion are:  "+listofSuggestion.size()) ;
		for(WebElement ele : DataofSuggestion) {
			System.out.println(ele.getText());
		}
	}

}
