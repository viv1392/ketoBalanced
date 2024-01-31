package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class HowYouSpendYourDay extends UtilisClass {
   WebDriver driver;
   public ItIsPossibleToSelectMultipleAnswers answers;
   public HowYouSpendYourDay(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//span[text()='At workplace']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='I spend pretty much time on foot']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='I stay at home very often']")
	WebElement ele3;
	public ItIsPossibleToSelectMultipleAnswers atWorkplace() {
		ele1.click();
		answers= new ItIsPossibleToSelectMultipleAnswers(driver);
		return answers;
	}
	public ItIsPossibleToSelectMultipleAnswers iSpendPrettyMuchTimeOnFoot() {
		ele2.click();
		answers= new ItIsPossibleToSelectMultipleAnswers(driver);
		return answers;
	}
	public ItIsPossibleToSelectMultipleAnswers iStayAtHomeVeryOften() {
		actionClass(driver,0,800);
		ele3.click();
		answers= new ItIsPossibleToSelectMultipleAnswers(driver);
		return answers;
	}
}
