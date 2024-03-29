package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilisClass;

public class Meat extends UtilisClass {
	WebDriver driver;
	public Veggies veggies;
	public Meat(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Chicken']")
	WebElement ele1;
	@FindBy(xpath="//span[text()='Pork']")
	WebElement ele2;
	@FindBy(xpath="//span[text()='Beef']")
	WebElement ele3;
	@FindBy(xpath="//span[text()='Fish']")
	WebElement ele4;
	@FindBy(xpath="//span[text()='Seafood']")
	WebElement ele5;
	@FindBy(xpath="//span[text()='Lamb']")
	WebElement ele6;
	@FindBy(xpath="//span[text()='I am Vegetarian']")
	WebElement ele7;
	@FindBy(xpath="//span[text()='I am Vegan']")
	WebElement ele8;
	@FindBy(linkText="Continue")
	WebElement ele;
	
	public Veggies meat() throws InterruptedException {
		ele1.click();
		ele2.click();
		ele3.click();
		actionClass(driver,0,600);
		ele4.click();
		ele5.click();
		ele6.click();
		ele.click();
		veggies= new Veggies(driver);
		return veggies;
	}
	public Veggies vegetarian() throws InterruptedException {
		Thread.sleep(2000);
		actionClass(driver,0,1500);
		ele7.click();
		ele.click();
		veggies= new Veggies(driver);
		return veggies;
	}
	public Veggies vegan() throws InterruptedException {
		Thread.sleep(2000);
		actionClass(driver,0,1500);
		ele8.click();
		ele.click();
		veggies= new Veggies(driver);
		return veggies;
	}

}
