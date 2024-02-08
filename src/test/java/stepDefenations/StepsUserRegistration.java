package stepDefenations;

import baseComponent.BaseTest;
import commonPages.BodyTypeYouWant;
import commonPages.ChooseBodyType;
import commonPages.ChooseYourTargetZones;
import commonPages.ContinuePage;
import commonPages.GenderSel;
import commonPages.HowActiveAreYou;
import commonPages.HowTallAreYou;
import commonPages.HowYouSpendYourDay;
import commonPages.ItIsPossibleToSelectMultipleAnswers;
import commonPages.LandingPage;
import commonPages.LastHappyWithYourWeight;
import commonPages.MealPreparationEachDay;
import commonPages.Meat;
import commonPages.OtherFoodItems;
import commonPages.ShedSomeExtraWeight;
import commonPages.Veggies;
import commonPages.WantToAchieve;
import io.cucumber.java.en.*;

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
	Veggies veggi;
	OtherFoodItems otherFood;
	HowActiveAreYou active;
	HowYouSpendYourDay day;
	ItIsPossibleToSelectMultipleAnswers multi;
	ShedSomeExtraWeight extraWeight;
	HowTallAreYou tall;
	
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
    @Then(value="User navigated to meal preferences and choose meat")
    public void mealPreference() throws InterruptedException {
    	veggi=meat.meat();
    }
    @And(value="User also chooses some veggies")
    public void veggiesPreference() {
    	otherFood=veggi.veggies();
    }
    @And(value="User also prefers some other food items as non veg")
    public void otherFoodItems() {
    active=otherFood.non_veg();
    }
    @Then(value="User select how active he is as no physical activity")
    public void user_select_how_active_he_is_no_physical() {
    	day=active.almostNoPhysicalActivity();
    }
    @And(value="User select his day at workplace")
    public void user_select_his_day_at_workplace() {
       multi=day.atWorkplace();
    }
    @Then(value="User select multiple answer")
    public void User_select_multiple_answer() throws InterruptedException {
    	multi.qualitySleep();
    	multi.quitEatingSweets();
    	multi.saltIntakeIsMore();
    	multi.softDrinks();
    	extraWeight=multi.continueButton();
    }
    @And(value="User  select  Just Want to See how Keto Diet helps in weight loss.")
    public void User_select_Just_Want_to_See_how_Keto_Diet_helps_in_weight_loss() {
    	tall=extraWeight.asPossible();
    }
 }


