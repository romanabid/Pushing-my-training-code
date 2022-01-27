package tyabid;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingFaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91901\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805943%7Ce%7Chttps%20www%20facebook%20com%20sign%20up%7C&placement=&creative=550525805943&keyword=https%20www%20facebook%20com%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-323400156464%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAw9qOBhC-ARIsAG-rdn44jUxejQUE_1ziYS-AKDwFnhap3YAEG0XiB6y1cKwxzF5--IieAqUaAmeGEALw_wcB");
		
		driver.findElement(By.name("firstname")).sendKeys("Abid");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("mohammed");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("abcd@1gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abcd@1gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("5642554@565");
		Thread.sleep(1000);
		driver.findElement(By.id("day")).sendKeys("23");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("november");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1998");
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("u_0_5_iM")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("u_0_6_sS")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("u_0_10_bU")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
