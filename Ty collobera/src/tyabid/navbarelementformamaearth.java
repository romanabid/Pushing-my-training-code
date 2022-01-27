package tyabid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navbarelementformamaearth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://mamaearth.in/");
  		List<WebElement> navele = driver.findElements(By.xpath("//a[text()='Home']"));
  		for(WebElement ele : navele) {
  			System.out.println(ele.getText());
  		}

	}

}
