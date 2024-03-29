package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class OtherFoodItems extends UtilisClass {
	WebDriver driver;
	public  HowActiveAreYou activeAre;
	public OtherFoodItems(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Egg']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='Nuts']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='Chesse']")
	WebElement ele3;
	@FindBy(xpath="//span[text()='Coconut']")
	WebElement ele4;
	@FindBy(xpath="//span[text()='Olives']")
	WebElement ele5;
	@FindBy(xpath="//span[text()='Strawberry']")
	WebElement ele6;
	@FindBy(linkText="Continue")
	WebElement ele;
	public HowActiveAreYou non_veg() {
		ele1.click();
		ele2.click();
		actionClass(driver,0,800);
		ele5.click();
		ele.click();
		activeAre=new  HowActiveAreYou(driver);
		return activeAre;
	}
	public HowActiveAreYou veget() throws InterruptedException {
		ele2.click();
		Thread.sleep(2000);
		actionClass(driver,0,800);
		ele4.click();
		ele5.click();
		ele.click();
		activeAre=new  HowActiveAreYou(driver);
		return activeAre;
	}
	public HowActiveAreYou vega() throws InterruptedException {
		Thread.sleep(2000);
		actionClass(driver,0,800);
		ele4.click();
		ele5.click();
		ele6.click();
		ele.click();
		activeAre=new  HowActiveAreYou(driver);
		return activeAre;
	}

}
