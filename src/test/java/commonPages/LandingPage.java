package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage {
	
	public WebDriver driver;
	public GenderSel gender;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Take the Quiz")
	WebElement ele;
	
    public GenderSel landingPage() throws InterruptedException {
    	Thread.sleep(2000);
    	ele.click();
    	gender=new  GenderSel(driver);
    	return gender;
    	 
    }
}
