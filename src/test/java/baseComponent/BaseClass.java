package baseComponent;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import commonPages.GenderSel;
import commonPages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfigFile;

public class BaseClass extends ReadConfigFile {
   public WebDriver driver;
	public LandingPage page;
	
	
	public WebDriver browserInitilize() throws IOException {
		String browser = fileReading();
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			//options.addArguments("--headless");
			options.addArguments("--enable-notifications");
			driver = new ChromeDriver(options);
		}
		if (browser.equalsIgnoreCase("edge")) {
			// code here
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	@BeforeMethod(alwaysRun=true)
	public LandingPage landingPageUrl() throws Throwable {
		String Url = Url();
		driver = browserInitilize();
		driver.get(Url);
		page = new LandingPage(driver);
		return page;
	}

	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.manage().deleteAllCookies();
	    driver.quit();
	}
}
