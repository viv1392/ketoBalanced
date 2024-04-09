package userRegistrationTest;

import org.testng.annotations.Test;

import baseComponent.BaseClass;
import commonPages.BackToPlans;
import commonPages.BodyTypeYouWant;
import commonPages.ChooseBodyType;
import commonPages.ChoosePlan;
import commonPages.ChooseYourTargetZones;
import commonPages.ConsiderYourPerfectWeight;
import commonPages.ContinuePage;
import commonPages.DiseaseClass;
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

public class UserReWomenTest extends BaseClass {
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
	DiseaseClass disease;
	HowTallAreYou tall;
	WhatIsYourCurrentWeight currentWt;
	ConsiderYourPerfectWeight targetWeight;
	WhatIsYourAge age;
	SummaryOfYourOverallWellness wellness;
	SpecialOccasions occasions;
	EventDateSelection date;
	OneAndOnlyPlan plan;
	Your4WeekKetoDietingPlan week;
	YourKetoDietPlanIsReady planReady;
	BackToPlans backPlans;
	GotIt gotit;
	ChoosePlan chooseplan;

	 @Test(priority = 14)
		public void userRegistrationWoMenNonVeg() throws Throwable {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantBulk();
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
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 15)
		public void userRegistrationWoMenVeg() throws Throwable {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeVol();
			achieve = desiredBody.bodytypeYouWantCut();
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
			disease = extraWeight.justWant();
			tall=disease.noDisease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.wedding();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 16)
		public void userRegistrationWoMenVegan() throws Throwable {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantFit();
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
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date=occasions.sportingEvent();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 17)
		public void heightInFtNonVegWomen() throws InterruptedException {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeVol();
			achieve = desiredBody.bodytypeYouWantBulk();
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
			disease = extraWeight.justWant();
			tall=disease.noDisease();
			currentWt = tall.heightFeet();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.sportingEvent();
			plan = date.dateSelection();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();

		}

		@Test(priority = 18)
		public void heightInFtVegetWomen() throws InterruptedException {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantCut();
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
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.heightFeet();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.Other();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.sixMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 19)
		public void heightInFeetveganWomen() throws InterruptedException {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeVol();
			achieve = desiredBody.bodytypeYouWantFit();
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
			disease = extraWeight.justWant();
			tall=disease.noDisease();
			currentWt = tall.heightFeet();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			plan = occasions.No();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();

		}

		@Test(priority = 20)
		public void weightInLbsNonVegWomen() throws InterruptedException {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantBulk();
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
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.Other();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 21)
		public void weightLbsVegetWomen() throws InterruptedException {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeVol();
			achieve = desiredBody.bodytypeYouWantCut();
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
			disease = extraWeight.justWant();
			tall=disease.noDisease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.dateSelection();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();

		}

		@Test(priority = 22)
		public void weightLbsVeganWomen() throws InterruptedException {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantFit();
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
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 23)
		public void userWithBlankdEmaiIdWomen() throws InterruptedException {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeVol();
			achieve = desiredBody.bodytypeYouWantBulk();
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
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.wedding();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.threeMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}
		@Test(priority = 24)
		public void withoutFakeruserRegistrationMenNonVegWomen() throws Throwable {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantCut();
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
			disease = extraWeight.justWant();
			tall=disease.noDisease();
			currentWt = tall.withoutFakerheightCm();
			targetWeight = currentWt.withoutFakerweightLbs();
			age = targetWeight.withoutFakertarWeightLbs();
			wellness = age.withoutFakeryourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 25)
		public void userRegistrationWoMenVegwitoutFaker() throws Throwable {
			gender = page.landingPage();
			type= gender.genderWomen();
			desiredBody = type.choosebodyTypeVol();
			achieve = desiredBody.bodytypeYouWantFit();
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
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.withoutFakerheightCm();
			targetWeight = currentWt.withoutFakeeweightKG();
			age = targetWeight.withoutFakertarWeightKG();
			wellness = age.withoutFakeryourAge();
			occasions = wellness.overallWellness();
			date = occasions.wedding();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.blankEmail();
			backPlans = planReady.sixMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 26)
		public void witoutFakeruserRegistrationWoMenVegan() throws Throwable {
			gender = page.landingPage();
			type=gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantBulk();
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
			disease = extraWeight.justWant();
			tall=disease.noDisease();
			currentWt = tall.withoutFakerheightFeet();
			targetWeight = currentWt.withoutFakerweightLbs();
			age = targetWeight.tarWeightLbs();
			wellness = age.withoutFakeryourAge();
			occasions = wellness.overallWellness();
			date=occasions.sportingEvent();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}
		@Test(priority=2601)
		public void userRegistrationWomenNonVegEatAll() throws Throwable {
			gender = page.landingPage();
			type = gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantBulk();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.eatAllMeat();
			foodItems = veggies.eatAllVeggies();
			activeAre = foodItems.eatAll();
			yourDay = activeAre.almostNoPhysicalActivity();
			answers = yourDay.atWorkplace();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.quitEatingSweets();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.vacation();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}
		@Test(priority = 2602)
		public void userRegistrationWomenVegEatAll() throws Throwable {
			gender = page.landingPage();
			type = gender.genderWomen();
			desiredBody = type.choosebodyTypeVol();
			achieve = desiredBody.bodytypeYouWantCut();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegetarian();
			foodItems = veggies.eatAllVeggies();
			activeAre = foodItems.eatAll();
			yourDay = activeAre.iOftenGoForWalk();
			answers = yourDay.iSpendPrettyMuchTimeOnFoot();
			answers.qualitySleep();
			answers.atNight();
			answers.saltIntakeIsMore();
			answers.softDrinks();
			extraWeight = answers.continueButton();
			disease = extraWeight.justWant();
			tall=disease.noDisease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date = occasions.wedding();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}

		@Test(priority = 2603)
		public void userRegistrationWomenVeganEatAll() throws Throwable {
			gender = page.landingPage();
			type = gender.genderWomen();
			desiredBody = type.choosebodyTypeAv();
			achieve = desiredBody.bodytypeYouWantFit();
			conti = achieve.wantToAchieve();
			zone = conti.continuePage();
			happy = zone.yourTargetZone();
			mealpreparation = happy.lastHappyWithYourWeight();
			meat = mealpreparation.mealPreparationEachDay();
			veggies = meat.vegan();
			foodItems = veggies.eatAllVeggies();
			activeAre = foodItems.eatAll();
			yourDay = activeAre.iExerciseTimesWeek();
			answers = yourDay.atWorkplace();
			extraWeight = answers.noneOfTheAbove();
			disease = extraWeight.justWant();
			tall=disease.disease();
			currentWt = tall.heightCm();
			targetWeight = currentWt.weightKG();
			age = targetWeight.tarWeightKG();
			wellness = age.yourAge();
			occasions = wellness.overallWellness();
			date=occasions.sportingEvent();
			plan = date.skipThisQuestion();
			week = plan.oneAndOnlyPlan();
			week = plan.oneAndOnlyPlan();
			planReady = week.validEmail();
			backPlans = planReady.oneMonthPlan();
			gotit = backPlans.backToPlan();
			chooseplan = gotit.goIt();
			chooseplan.choosePlan();
		}
}
