package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class Veggies extends UtilisClass{
	WebDriver driver;
	public OtherFoodItems foodItems;
	public Veggies(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Broccoli']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='Zucchini']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='Avacado']")
	WebElement ele3;
	@FindBy(xpath="//span[text()='Spinach']")
	WebElement ele4;
	@FindBy(linkText="Continue")
	WebElement ele;
	public OtherFoodItems veggies() {
		ele1.click();
		ele2.click();
		actionClass(driver,0,800);
		ele3.click();
		ele4.click();
		ele.click();
		 foodItems=new OtherFoodItems(driver);
		 return foodItems;
		
	}


}
