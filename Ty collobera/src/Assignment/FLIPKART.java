package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FLIPKART {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		
		driver.findElement(By.name("q")).sendKeys("amazfit smartwatch",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
		String value = driver.findElement(By.xpath("//div[@class ='_25b18c']")).getText();
		String price = value.toString();
		String pric = price.replaceAll("[^\\d.,]", "\n");
		short val = Short.parseShort(pric);
		
		if(val<=8000) {
			String parentwindow =driver. getWindowHandle();
			Set<String> allwindow = driver.getWindowHandles();
			allwindow.remove(parentwindow);
			String expectTitle = "Amazfit T Rex Smartwatch";
			
			for(String s : allwindow) {
				driver.switchTo().window(s);
				String actualTitle = driver.getTitle();
				if(expectTitle.equals(actualTitle)) {
					System.out.println("driver switch to the parentwidow");
				}
			}
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			driver.findElement(By.xpath("//span[text()='Cart']")).click();
				
		}else {
			System.out.println("watch prize is more than 8000");
		}

	}

}
