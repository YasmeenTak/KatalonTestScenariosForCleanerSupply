package validations

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

public class FooterValidations {
	/***
	 * Verify thanks message appears
	 * @author Yasmeen
	 */
	public static void verifySuccessMessageAppears() {
		TestObject successMessage = findTestObject("Object Repository/Footer/span_SuccessMessage");
		assert WebUI.verifyElementPresent(successMessage, 2)
	}
	/***
	 * Verify Choosing Region in footer
	 * @author Yasmeen
	 */
	public static void verifyCanadaRegioIsSelected() {
		TestObject regionSelectList = findTestObject("Object Repository/Footer/select_regionList");
		WebUI.selectOptionByLabel(regionSelectList, 'Canada', false)
		assert WebUI.verifyOptionSelectedByLabel(regionSelectList, 'Canada', false, 0)
	}

	/***
	 * Verify the feedback modal appear
	 * @author Yasmeen
	 */
	public static void VerifyFeedbackModalAppear() {
		TestObject feedbackModal = findTestObject("Object Repository/Footer/div_feedbackModal");
		assert WebUI.verifyElementVisible(feedbackModal)
		TestObject closeFormBtn = findTestObject("Object Repository/Footer/button_closeForm");
		WebUI.click(closeFormBtn)
	}

	/***
	 * Verify the text ads contain CANADIAN 
	 * @author Yasmeen
	 */
	public static void verifyTextAdsContainCANADIAN(String word) {
		TestObject allTextAds = findTestObject("Object Repository/Footer/span_TextAds");
		String textAds = WebUI.getText(allTextAds);
		assert textAds.contains(word);
	}
	/***
	 * verify Hovering Over Links
	 * @author Yasmeen
	 */
	public static verifyHoveringOnManageMyAccountLink() {
		TestObject myAccountLink = findTestObject("Object Repository/Footer/a_MyAccountLink");
		WebUI.mouseOver(myAccountLink)
		assert WebUI.getCSSValue(myAccountLink, "text-decoration").contains("underline")
	}
}
