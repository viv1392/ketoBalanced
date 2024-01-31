package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.UtilisClass;

public class HowTallAreYou extends UtilisClass {
	   WebDriver driver;
	   public  WhatIsYourCurrentWeight currentWt;
	   
	   String popUpAtScr="Please enter valid height.";
	   String msg="Please enter valid height.";
	   int z;
	public HowTallAreYou(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="height_cm_id")
		WebElement ele1;
		@FindBy(xpath="//div[text()='in']")
		WebElement ele2;
		@FindBy(id="height_feet_id")
		WebElement ele3;
		@FindBy(id="height_inch_id")
		WebElement ele4;
		@FindBy(linkText="Continue")
		WebElement ele;
		public WhatIsYourCurrentWeight heightCm() {
			String x=fkr.number().digits(2);
			 int z=Integer.parseInt(x);
			 int k=210-z;
			 String ht=Integer.toString(k);
			ele1.sendKeys(ht);
			Assert.assertEquals(popUpAtScr, msg);
			ele.click();
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
		public WhatIsYourCurrentWeight heightFeet() {
			ele2.click();
			String x=fkr.number().digits(1);
			ele3.sendKeys(x);
			Assert.assertEquals(popUpAtScr, msg);
			ele4.sendKeys(x);
			Assert.assertEquals(popUpAtScr, msg);
			ele.click();
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
		public WhatIsYourCurrentWeight withoutFakerheightCm() {
			ele1.sendKeys("179");
			Assert.assertEquals(popUpAtScr, msg);
			ele.click();
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
		public WhatIsYourCurrentWeight withoutFakerheightFeet() {
			ele2.click();
			ele3.sendKeys("5");
			Assert.assertEquals(popUpAtScr, msg);
			ele4.sendKeys("10");
			Assert.assertEquals(popUpAtScr, msg);
			ele.click();
			currentWt=new WhatIsYourCurrentWeight(driver);
			return currentWt;
		}
		
	
	

}
