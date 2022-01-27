package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class money {
	public class loans {
		@Test(priority = 1)
		public void flipkart() {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			driver.quit();
		}
		@Test(priority = -2,invocationCount = 2,threadPoolSize = 0)
		public void lenskart() {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.lenskart.com/");
			driver.quit();
		}
		@Test(priority = 2,invocationCount = 6,threadPoolSize = 2)
		public void amazon() {
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.quit();
		}

	}


}
