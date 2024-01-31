package commonPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShedSomeExtraWeight {
	WebDriver driver;
	public  HowTallAreYou tall;
	public ShedSomeExtraWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Just Want to See how Keto Diet helps in weight loss']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='I want to try and lose some weight']")
	WebElement ele2;
	@FindBy(xpath="//div[@class='box']")
	List<WebElement> ele3;
	
	public HowTallAreYou justWant() {
		ele1.click();
		tall=new HowTallAreYou(driver);
		return tall;
	}
	public HowTallAreYou iWant() {
		ele2.click();
		tall=new HowTallAreYou(driver);
		return tall;
	}
	public HowTallAreYou  asPossible() {
		ele3.get(2).click();
		tall=new HowTallAreYou(driver);
		return tall;
	}

}
