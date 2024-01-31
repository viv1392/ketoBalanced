package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Your4WeekKetoDietingPlan {
	WebDriver driver;
	public EnterYourEmail email;
	public Your4WeekKetoDietingPlan(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Continue")
	WebElement ele;
	public EnterYourEmail your4WeekKetoDietingPlan() {
		ele.click();
		email=new EnterYourEmail(driver);
		return email;
	}
}
