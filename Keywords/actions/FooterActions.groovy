package actions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class FooterActions {
	/***
	 * Verify filling email in “Enter your email” field
	 * @author Yasmeen
	 */
	public static void fillingMailInput() {
		TestObject emailInput = findTestObject("Object Repository/Footer/input_Email");
		WebUI.setText(emailInput, GlobalVariable.email)
	}
	/***
	 * Verify Clicking on “SIGN UP” button 
	 * @author Yasmeen
	 */
	public static void  clickingOnSIGNUPBtn() {
		TestObject signUpBtn = findTestObject("Object Repository/Footer/input_Email");
		WebUI.click(signUpBtn)
	}
	/***
	 *  navigate to Facebook page
	 * @author Yasmeen
	 */
	public static void clickingOnFacebookLink() {
		TestObject facebookLink = findTestObject("Object Repository/Footer/a_facebookLink");
		WebUI.click(facebookLink)
	}
	/***
	 *  navigate to youtube page
	 * @author Yasmeen
	 */
	public static void clickingOnYoutubeLink() {
		TestObject youtubeLink = findTestObject("Object Repository/Footer/a_YoutubeLink");
		WebUI.click(youtubeLink)
	}
	/***
	 *  navigate to instagram page
	 * @author Yasmeen
	 */
	public static void clickingOnInstagramLink() {
		TestObject instagramLink = findTestObject("Object Repository/Footer/a_InstagramLink");
		WebUI.click(instagramLink)
	}
	/***
	 *  navigate to linkedin page
	 * @author Yasmeen
	 */
	public static void clickingOnLinkedinLink() {
		TestObject linkedinLink = findTestObject("Object Repository/Footer/a_LinkedinLink");
		WebUI.click(linkedinLink)
	}
	/***
	 *  navigate to Email page
	 * @author Yasmeen
	 */
	public static void clickingOnEmailLink() {
		TestObject emailLink = findTestObject("Object Repository/Footer/a_EmailLink");
		WebUI.click(emailLink)
	}

	/***
	 * Switching to main window
	 * @author Yasmeen
	 */
	public static void switchingToMainWindow() {
		//WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}

	/***
	 *  navigate to MyAccount page
	 * @author Yasmeen
	 */
	public static void clickingOnMyAccountLink() {
		TestObject myAccountLink = findTestObject("Object Repository/Footer/a_MyAccountLink");
		WebUI.click(myAccountLink)
	}

	/***
	 *  navigate to Track My Order page
	 * @author Yasmeen
	 */
	public static void clickingOnTrackMyOrderLink() {
		TestObject trackMyOrderLink = findTestObject("Object Repository/Footer/a_TrackMyOrderLink");
		WebUI.click(trackMyOrderLink)
	}
	/***
	 *  navigate to Our Story page
	 * @author Yasmeen
	 */
	public static void clickingOnOurStoryLink() {
		TestObject ourStory = findTestObject("Object Repository/Footer/a_OurStory");
		WebUI.click(ourStory)
	}
	/***
	 *  navigate to Fast Free Shipping page
	 * @author Yasmeen
	 */
	public static void clickingOnFastFreeShippingLink() {
		TestObject fastFreeShipping = findTestObject("Object Repository/Footer/a_FastFreeShipping");
		WebUI.click(fastFreeShipping)
	}
	/***
	 *  navigate to customer Service page
	 * @author Yasmeen
	 */
	public static void clickingOnCustomerServiceLink() {
		TestObject customerService = findTestObject("Object Repository/Footer/a_customerService");
		WebUI.click(customerService)
	}

	/***
	 *  navigate to news room page
	 * @author Yasmeen
	 */
	public static void clickingOnNewsroomLink() {
		TestObject newsroom = findTestObject("Object Repository/Footer/a_newsroom");
		WebUI.click(newsroom)
	}

	/***
	 *  navigate to Tags Forms page
	 * @author Yasmeen
	 */
	public static void clickingOnTagsFormsLink() {
		TestObject tagsForms = findTestObject("Object Repository/Footer/a_TagsForms");
		WebUI.click(tagsForms)
	}
	/***
	 * navigate to Counter Check In page
	 * @author Yasmeen
	 */
	public static void clickingOnCounterCheckInLink() {
		TestObject counterCheckIn = findTestObject("Object Repository/Footer/a_CounterCheckIn");
		WebUI.click(counterCheckIn)
	}
	/***
	 * navigate to Bags page
	 * @author Yasmeen
	 */
	public static void clickingOnBagsLink() {
		TestObject bags = findTestObject("Object Repository/Footer/a_Bags");
		WebUI.click(bags)
	}

	/***
	 *  navigate to Pressing Spotting page
	 * @author Yasmeen
	 */
	public static void clickingOnPressingSpottingLink() {
		TestObject pressingSpotting = findTestObject("Object Repository/Footer/a_PressingSpotting");
		WebUI.click(pressingSpotting)
	}
	/***
	 * navigate to Racks page
	 * @author Yasmeen
	 */
	public static void clickingOnRacksLink() {
		TestObject racks = findTestObject("Object Repository/Footer/a_Racks");
		WebUI.click(racks)
	}

	/***
	 * navigate to Tailoring page
	 * @author Yasmeen
	 */
	public static void clickingOnTailoringLink() {
		TestObject tailoring = findTestObject("Object Repository/Footer/a_Tailoring");
		WebUI.click(tailoring)
	}
	/***
	 *  navigate to Laundromat page
	 * @author Yasmeen
	 */
	public static void clickingOnLaundromatLink() {
		TestObject laundromat = findTestObject("Object Repository/Footer/a_Laundromat");
		WebUI.click(laundromat)
	}

	/***
	 *  navigate to Favorites page
	 * @author Yasmeen
	 */
	public static void clickingOnFavoritesLink() {
		TestObject favorites = findTestObject("Object Repository/Footer/a_Favorites");
		WebUI.click(favorites)
	}

	/***
	 * navigate to requestCatalog page
	 * @author Yasmeen
	 */
	public static void clickingOnRequestCatalogLink() {
		TestObject requestCatalog = findTestObject("Object Repository/Footer/a_requestCatalog");
		WebUI.click(requestCatalog)
	}
	/***
	 *  navigate to FreeClassifieds page
	 * @author Yasmeen
	 */
	public static void clickingOnFreeClassifiedsLink() {
		TestObject freeClassifieds = findTestObject("Object Repository/Footer/a_FreeClassifieds");
		WebUI.click(freeClassifieds)
	}

	/***
	 *  navigate to ChooseRegion page
	 * @author Yasmeen
	 */
	public static void clickingOnChooseRegionButton() {
		TestObject chooseRegionBtn = findTestObject("Object Repository/Footer/button_ChooseRegion");
		WebUI.click(chooseRegionBtn)
	}
	/***
	 * clicking on leave feedback
	 * @author Yasmeen
	 */
	public static void clickingOnleaveFeedback() {
		TestObject leaveFeedbackLink = findTestObject("Object Repository/Footer/a_leave-feedback-form");
		WebUI.click(leaveFeedbackLink)
	}
}

