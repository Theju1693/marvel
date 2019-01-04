package generic;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

	public class BaseClass {

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}
		
		public WebDriver driver;
		@Parameters({"ip","browser"})
		@BeforeMethod
		public void openBrowser(@Optional("localhost")String ip,@Optional("chrome")String browser) {
			
			driver=Utility.openBrowser(driver, ip, browser);
			driver.get("https://www.urbanladder.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
	}

