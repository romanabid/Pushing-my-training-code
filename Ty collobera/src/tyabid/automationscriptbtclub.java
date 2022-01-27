package tyabid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automationscriptbtclub {

	public static void main(String[] args) {
		String testUrl = "https://www.thebtclub.com/";
		String username = "mdabidn001@gmail.com";
		String password = "9014243736";
		String expectpageTitle = "header_customer_login";
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		System.out.println("Browser launched successfuly");
		driver.manage().window().maximize();
		System.out.println("Browser maximize sucessfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver,10);
		driver.get(testUrl);
		String actualpageTitle = driver.getTitle();
		if(actualpageTitle.equals(expectpageTitle)) {
			System.out.println("login page is sucessfully");
		}else {
			System.out.println("login page os not sucessfull");
		}
		
		driver.findElement(By.xpath("//a[text()='My account ']")).click();
		WebElement emailTextField = driver.findElement(By.id("login-customer[email]"));
		emailTextField.clear();
		emailTextField.sendKeys(username);
		String actualemailTextFieldEntered = emailTextField.getAttribute("value");
		if(actualemailTextFieldEntered.equals(username)) {
			System.out.println("username is entered sucessfully");
		}else {
			System.out.println("username is not entered sucessfully");
		}
		
		WebElement passwordTextField = driver.findElement(By.id("login-customer[password]"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualpasswordTextFieldEntered = passwordTextField.getAttribute("value");
		if(actualpasswordTextFieldEntered.equals(password)) {
			System.out.println("password is sucessfully entered");
		}else {
			System.out.println("password is not entered sucessfully");
		}
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String actualPageTitle = driver.getTitle();	
		if(actualPageTitle.equals(expectpageTitle)) {
			System.out.println("home page is sucessfully displayed");
		}else {
			System.out.println("home page is not displayed sucessfully");
		}
		


	}

}
