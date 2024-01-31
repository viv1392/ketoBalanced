package userRegistrationTest;

import org.testng.annotations.Test;

import baseComponent.BaseTest;
import commonPages.BackToPlans;
import commonPages.BodyTypeYouWant;
import commonPages.ChooseBodyType;
import commonPages.ChoosePlan;
import commonPages.ChooseYourTargetZones;
import commonPages.ConsiderYourPerfectWeight;
import commonPages.ContinuePage;
import commonPages.EnterYourEmail;
import commonPages.EventDateSelection;
import commonPages.GenderSel;
import commonPages.GotIt;
import commonPages.HowActiveAreYou;
import commonPages.HowTallAreYou;
import commonPages.HowYouSpendYourDay;
import commonPages.ItIsPossibleToSelectMultipleAnswers;
import commonPages.LastHappyWithYourWeight;
import commonPages.MealPreparationEachDay;
import commonPages.Meat;
import commonPages.OneAndOnlyPlan;
import commonPages.OtherFoodItems;
import commonPages.ShedSomeExtraWeight;
import commonPages.SpecialOccasions;
import commonPages.SummaryOfYourOverallWellness;
import commonPages.Veggies;
import commonPages.WantToAchieve;
import commonPages.WhatIsYourAge;
import commonPages.WhatIsYourCurrentWeight;
import commonPages.Your4WeekKetoDietingPlan;
import commonPages.YourKetoDietPlanIsReady;

public class UserReWomenTest extends BaseTest {
	GenderSel gender;
	ChooseBodyType type;
	BodyTypeYouWant desiredBody;
	WantToAchieve achieve;
	ContinuePage conti;
	ChooseYourTargetZones zone;
	LastHappyWithYourWeight happy;
	MealPreparationEachDay mealpreparation;
	Meat meat;
	Veggies veggies;
	OtherFoodItems foodItems;
	HowActiveAreYou activeAre;
	HowYouSpendYourDay yourDay;
	ItIsPossibleToSelectMultipleAnswers answers;
	ShedSomeExtraWeight extraWeight;
	HowTallAreYou tall;
	WhatIsYourCurrentWeight currentWt;
	ConsiderYourPerfectWeight targetWeight;
	WhatIsYourAge age;
	SummaryOfYourOverallWellness wellness;
	SpecialOccasions occasions;
	EventDateSelection date;
	OneAndOnlyPlan plan;
	Your4WeekKetoDietingPlan week;
	EnterYourEmail email;
	YourKetoDietPlanIsReady planReady;
	BackToPlans backPlans;
	GotIt gotit;
	ChoosePlan chooseplan;

	 @Test(priority = 14)
		public void userRegistrationMenNonVeg() throws Throwable {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.meat();
			foodItems = veggies.veggies();
			activeAre = foodItems.non_veg();
			yourDay = activeAre.almostNoPhysicalActivity();
			answers = yourDay.atWorkplace();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.quitEatingSweets();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.justWant();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 15)
		public void userRegistrationMenVeg() throws Throwable {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeEx();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegetarian();
			foodItems = veggies.veggies();
			activeAre = foodItems.veget();
			yourDay = activeAre.iOftenGoForWalk();
			answers = yourDay.iSpendPrettyMuchTimeOnFoot();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.iWant();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.wedding();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 16)
		public void userRegistrationMenVegan() throws Throwable {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegan();
			foodItems = veggies.veggies();
			activeAre = foodItems.vega();
			yourDay = activeAre.iExerciseTimesWeek();
			answers = yourDay.atWorkplace();
			extraWeight = answers.noneOfTheAbove();
			tall = extraWeight.asPossible();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date=occasions.sportingEvent();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 17)
		public void heightInFtNonVeg() throws InterruptedException {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeEx();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.meat();
			foodItems = veggies.veggies();
			activeAre = foodItems.non_veg();
			yourDay = activeAre.almostNoPhysicalActivity();
			answers = yourDay.atWorkplace();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.quitEatingSweets();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.iWant();
			currentWt = tall.heightFeet();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.sportingEvent();
			plan = date.dateSelection();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();

		}

		@Test(priority = 18)
		public void heightInFtVeget() throws InterruptedException {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegetarian();
			foodItems = veggies.veggies();
			activeAre = foodItems.veget();
			yourDay = activeAre.iOftenGoForWalk();
			answers = yourDay.iSpendPrettyMuchTimeOnFoot();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.iWant();
			currentWt = tall.heightFeet();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.Other();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 19)
		public void heightInFeetvegan() throws InterruptedException {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeEx();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegan();
			foodItems = veggies.veggies();
			activeAre = foodItems.vega();
			yourDay = activeAre.iExerciseTimesWeek();
			answers = yourDay.atWorkplace();
			extraWeight = answers.noneOfTheAbove();
			tall = extraWeight.iWant();
			currentWt = tall.heightFeet();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			plan = occasions.No();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();

		}

		@Test(priority = 20)
		public void weightInLbsNonVeg() throws InterruptedException {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.meat();
			foodItems = veggies.veggies();
			activeAre = foodItems.non_veg();
			yourDay = activeAre.almostNoPhysicalActivity();
			answers = yourDay.atWorkplace();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.quitEatingSweets();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.asPossible();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.Other();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 21)
		public void weightLbsVeget() throws InterruptedException {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeEx();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegetarian();
			foodItems = veggies.veggies();
			activeAre = foodItems.veget();
			yourDay = activeAre.iOftenGoForWalk();
			answers = yourDay.iSpendPrettyMuchTimeOnFoot();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.iWant();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.dateSelection();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.sixMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();

		}

		@Test(priority = 22)
		public void weightLbsVegan() throws InterruptedException {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegan();
			foodItems = veggies.veggies();
			activeAre = foodItems.vega();
			yourDay = activeAre.iExerciseTimesWeek();
			answers = yourDay.atWorkplace();
			extraWeight = answers.noneOfTheAbove();
			tall = extraWeight.iWant();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 23)
		public void userWithBlankdEmaiId() throws InterruptedException {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeEx();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.meat();
			foodItems = veggies.veggies();
			activeAre = foodItems.non_veg();
			yourDay = activeAre.almostNoPhysicalActivity();
			answers = yourDay.atWorkplace();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.quitEatingSweets();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.asPossible();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.wedding();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.blankEmail();
			backPlans = planReady.threeMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}
		@Test(priority = 24)
		public void withoutFakeruserRegistrationMenNonVeg() throws Throwable {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.meat();
			foodItems = veggies.veggies();
			activeAre = foodItems.non_veg();
			yourDay = activeAre.almostNoPhysicalActivity();
			answers = yourDay.atWorkplace();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.quitEatingSweets();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.justWant();
			currentWt = tall.withoutFakerheightCm();
			targetWeight = currentWt.withoutFakerweightLbs();
			age = targetWeight.withoutFakertarWeightLbs();
			wellness = age.withoutFakeryourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 25)
		public void userRegistrationMenVegwitoutFaker() throws Throwable {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeEx();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegetarian();
			foodItems = veggies.veggies();
			activeAre = foodItems.veget();
			yourDay = activeAre.iOftenGoForWalk();
			answers = yourDay.iSpendPrettyMuchTimeOnFoot();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			tall = extraWeight.iWant();
			currentWt = tall.withoutFakerheightCm();
			targetWeight = currentWt.withoutFakeeweightKG();
			age = targetWeight.withoutFakertarWeightKG();
			wellness = age.withoutFakeryourAge();
			occasions = wellness.overallWellness();
			date = occasions.wedding();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 26)
		public void witoutFakeruserRegistrationMenVegan() throws Throwable {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWant();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegan();
			foodItems = veggies.veggies();
			activeAre = foodItems.vega();
			yourDay = activeAre.iExerciseTimesWeek();
			answers = yourDay.atWorkplace();
			extraWeight = answers.noneOfTheAbove();
			tall = extraWeight.asPossible();
			currentWt = tall.withoutFakerheightFeet();
			targetWeight = currentWt.withoutFakerweightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.withoutFakeryourAge();
			occasions = wellness.overallWellness();
			date=occasions.sportingEvent();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			email = week.your4WeekKetoDietingPlan();
			planReady = email.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

}