package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenderSel {
	WebDriver driver;
	public ChooseBodyType bodyType;
	public GenderSel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Men']")
	WebElement men;
	@FindBy(xpath="//p[text()='Women']")
	WebElement women;
	public ChooseBodyType genderMen() {
		men.click();
	    bodyType=new ChooseBodyType(driver);
	    return bodyType;
	}
	public ChooseBodyType genderWomen() {
		women.click();
		 bodyType=new ChooseBodyType(driver);
		    return bodyType;
		
	}
}
