package tyabid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		System.out.println("Browser launched successfuly");
		driver.manage().window().maximize();
		System.out.println("Browser maximize sucessfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		driver.get("https://www.rediff.com/");
		System.out.println("url sentered sucessfully");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		System.out.println("sucessfully enter in login page");
		
		WebElement userTextField = driver.findElement(By.id("login1"));
		 userTextField.clear();
		 userTextField.sendKeys("sumanthElfBatch@rediffmail.com");
		 System.out.println("data entered success");
		 
		 WebElement passwordTextFiled = driver.findElement(By.id("password"));
		 passwordTextFiled.clear();
		 passwordTextFiled.sendKeys("Testing@123");
		 System.out.println("password data is entered");
		 
		 driver.findElement(By.name("proceed")).click();
		 System.out.println("signup sucessfull");
		 
		 driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		WebElement enteremailTextField = driver.findElement(By.xpath("//input[@placeholder='Enter name or email' and @class='rd_inp_to as-input']"));
		enteremailTextField.clear();
		enteremailTextField.sendKeys("sumanthElfBatch@rediffmail.com",Keys.ENTER);
			
		System.out.println("enter data in to textfield");
		
		WebElement subjectTextField = driver.findElement(By.xpath("//input[contains(@class,'subject')]"));
		subjectTextField.click();
		subjectTextField.sendKeys("abid");
		System.out.println("enter data in subject textfield");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(frameElement);
		WebElement bodyTextField = driver.findElement(By.xpath("//body[(@contenteditable='true')]"));
		bodyTextField.sendKeys("hi gd night");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		
		 
		 
		

	}
	
}	