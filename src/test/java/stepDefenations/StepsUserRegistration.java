package stepDefenations;

import baseComponent.BaseTest;
import commonPages.BodyTypeYouWant;
import commonPages.ChooseBodyType;
import commonPages.ChooseYourTargetZones;
import commonPages.ContinuePage;
import commonPages.GenderSel;
import commonPages.LandingPage;
import commonPages.LastHappyWithYourWeight;
import commonPages.MealPreparationEachDay;
import commonPages.Meat;
import commonPages.WantToAchieve;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepsUserRegistration extends BaseTest {
	
	LandingPage page;
	GenderSel gender;
	ChooseBodyType type;
	BodyTypeYouWant bodyType;
	WantToAchieve achieve;
	ContinuePage contin;
	ChooseYourTargetZones zone;
	LastHappyWithYourWeight happy;
	MealPreparationEachDay mealPrep;
	Meat meat;
	
    @Given(value = "User launch the browser with web address")
	public void  User_launch_the_browser_with_web_address() throws Throwable {
    	System.out.println("Browser launched");
        page=landingPageUrl();
	}
    @And(value = "User goes to Landing page")
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
    	achieve=bodyType.bodytypeYouWantFit();
    }
    @Then(value="User want to achieve")
    public void wantToAchieve() {
     contin=achieve.wantToAchieve();
    }
    @Then(value="User choose target zone")
    	public void targetZone() {
    	zone=contin.continuePage();
        happy=zone.yourTargetZone();
    	}
    @Then(value="User choose when he was last happy with his weight")
    public void lastHappyWithWeight() {
       mealPrep=happy.lastHappyWithYourWeight();
    }
    @Then(value="User choose how much he has time for meal prepartaion")
    public void timeForMealPreparation() {
    	meat=mealPrep.mealPreparationEachDay();
    }
   }


