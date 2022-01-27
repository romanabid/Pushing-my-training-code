package tyabid;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		
		Select select = new Select(dayListBox);
		System.out.println(select.isMultiple());
		List<WebElement>dayListBoxOptions = select.getOptions();
		for(WebElement ele : dayListBoxOptions) {
			System.out.println(ele.getText());
		}
		Select monthselect = new Select(monthListBox);
		System.out.println(monthselect.isMultiple());
		List<WebElement> monthListBoxOptions = monthselect.getOptions();
		for(WebElement ele : monthListBoxOptions) {
			System.out.println(ele.getText());
		}
		Select yearselect = new Select(yearListBox);
		System.out.println(yearselect.isMultiple());
		List<WebElement> yearListBoxOptions = yearselect.getOptions();
		for(WebElement ele : yearListBoxOptions) {
			System.out.println(ele.getText());
		}
		
		

	}

}
