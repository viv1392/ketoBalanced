package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BodyTypeYouWant {
	WebDriver driver;
	public WantToAchieve achieve;
	public BodyTypeYouWant(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Bulk']")
	WebElement ele;
	public WantToAchieve bodytypeYouWant() {
		ele.click();
		achieve=new WantToAchieve(driver);
		return achieve;
		
	}

}
