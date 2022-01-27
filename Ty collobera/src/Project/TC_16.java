package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Adavancelevelselenium.readexceldata.ExcelLib;

public class TC_16 {
	
	@Test
	public void copyingshippingAddress() {
		String testurl = ExcelLib.readStringData("sheet1", 0, 0);
		String username = ExcelLib.readStringData("sheet1", 0, 1);
		String password = ExcelLib.readStringData("sheet1", 0, 2);
		String expectedLoginPageTitle = ExcelLib.readStringData("sheet1", 1, 0);
		String expectedHomePageTitle = ExcelLib.readStringData("sheet1", 1, 1);
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(testurl);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login page displayed sucessfully");
		}
		Login_page loginpage = new Login_page(driver);
		loginpage.getUsernameTextField().sendKeys(username);
		loginpage.getPasswordTextField().sendKeys(password);
		loginpage.getLoginButton().click();
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("login is sucessfull");
		}
		
		
		
		
	
	}

	
		
	}


