package commonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.UtilisClass;

public class ConsiderYourPerfectWeight extends UtilisClass {
	WebDriver driver;
	public WhatIsYourAge age;
	String msgScr="Please enter valid target weight.";
	String msg="Please enter valid target weight.";
	public ConsiderYourPerfectWeight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="target_lb")
	WebElement ele1;
	@FindBy(id="target_kg")
	WebElement ele3;
	@FindBy(linkText="Continue")
	WebElement ele;
	public WhatIsYourAge tarWeightLbs() {
		String x=fkr.number().digits(2);
		int y=Integer.parseInt(x);
		int z=320-y;
		String k=Integer.toString(z);
		ele1.sendKeys(k);
		Assert.assertEquals(msgScr, msg);
		ele.click();
		age=new WhatIsYourAge(driver);
		return age;
	}
	public WhatIsYourAge tarWeightKG() {
		String x=fkr.number().digits(1);
		int y=Integer.parseInt(x);
		int z=110-y;
		String k=Integer.toString(z);
		ele3.sendKeys(k);
		Assert.assertEquals(msgScr, msg);
		ele.click();
		age=new WhatIsYourAge(driver);
		return age;
	}
	public WhatIsYourAge withoutFakertarWeightLbs() {
		ele1.sendKeys("210");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		age=new WhatIsYourAge(driver);
		return age;
	}
	public WhatIsYourAge withoutFakertarWeightKG() {
		ele3.sendKeys("85");
		Assert.assertEquals(msgScr, msg);
		ele.click();
		age=new WhatIsYourAge(driver);
		return age;
	}

}
