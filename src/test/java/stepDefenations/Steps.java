package stepDefenations;

import baseComponent.BaseTest;
import commonPages.BodyTypeYouWant;
import commonPages.ChooseBodyType;
import commonPages.GenderSel;
import commonPages.LandingPage;
import commonPages.WantToAchieve;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseTest {
	
	LandingPage page;
	GenderSel gender;
	ChooseBodyType type;
	BodyTypeYouWant bodyType;
	WantToAchieve achieve;
	
    @Given(value = "User launch the browser with web address")
	public void  User_launch_the_browser_with_web_address() throws Throwable {
    	System.out.println("Browser launched");
        page=landingPageUrl();
	}
    @And(value = "Landing page")
    public void Landing_Page() {
    	gender=page.landingPage();
    }
    @Then(value="User navigated to gender page and select men")
    public void userMen() {
    	type=gender.genderMen();
    }
    @Then(value="User choose current body type")
    public void userCurrentbodytype() {
     bodyType=type.choosebodyTypeVol();
    
    }
    @Then(value="User choose body type he want")
    public void desiredbodytype() {
    	achieve=bodyType.bodytypeYouWantBulk();
    }

}
