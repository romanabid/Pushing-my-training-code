package tyabid;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarpopups {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusMonths(6);
		String month = ldt.getMonth().name();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		System.out.println("Browser launched successfuly");
		driver.manage().window().maximize();
		System.out.println("Browser maximize sucessfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
		driver.get("https://www.vrbo.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");
		driver.findElement(By.xpath("//div[@class='form-group position-relative form-combined__input1']")).click();
		driver.findElement(By.id("SVG_CHEVRON_RIGHT__16")).click();
		driver.findElement(By.xpath("aria-label=\"May 1, 2022\"")).click();
					

	}

}
