package tyabid;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		
		driver.findElement(By.name("q")).sendKeys("amazfit smartwatch",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
		Thread.sleep(2000);
		
	}
//	public static void addtocart(WebDriver driver,String expectedpagetitle) {
//	    String parentwindowId = driver.getWindowHandle();
//		Set<String> allwindowIds = driver.getWindowHandles();
//		allwindowIds.remove(parentwindowId);
//		
//		for(String windowId : allwindowIds) {
//			driver.switchTo().window(windowId);
//			String actualpagetitle = driver.getTitle();
//			if(actualpagetitle.equals(expectedpagetitle)) {
//				System.out.println("driver switch to control rightpage");
//			}
//		}
//		driver.findElement(By.xpath("//svg[text( )='ADD TO CART']")).click();
//		driver.switchTo().window(parentwindowId);
		
	

 }

