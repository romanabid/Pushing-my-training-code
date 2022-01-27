package tyabid;

import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchingFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91901\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

	}

}
