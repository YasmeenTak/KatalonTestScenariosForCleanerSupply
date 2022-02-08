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

public class HeaderActions {

	/***
	 * clicking on Tags and forms button
	 * @author Norhan salman
	 */
	public static void clickOnTagsAndFormsButton() {
		TestObject tagsAndFormsButtonElm = findTestObject("Object Repository/Header/a_tagAndFormsMenuItem")
		WebUI.click(tagsAndFormsButtonElm)
	}

	/***
	 * hovering on Tags and forms button
	 * @author Norhan salman
	 */
	public static void hoverOnTagsAndFormsButton() {
		TestObject tagsAndFormsButtonElm = findTestObject("Object Repository/Header/a_tagAndFormsMenuItem")
		WebUI.mouseOver(tagsAndFormsButtonElm)
	}

	/***
	 * clicking on Counter and CheckIN button
	 * @author Norhan salman
	 */
	public static void clickOnCounterAndCheckInMenuItem() {
		TestObject counterAndCheckInElm = findTestObject("Object Repository/Header/a_counterAndCheckInMenuItem")
		WebUI.click(counterAndCheckInElm)
	}

	/***
	 * hovering on Counter and CheckIN button
	 * @author Norhan salman
	 */
	public static void hoverOnCounterAndCheckInMenuItem() {
		TestObject counterAndCheckInElm = findTestObject("Object Repository/Header/a_counterAndCheckInMenuItem")
		WebUI.mouseOver(counterAndCheckInElm)
	}

	/***
	 * clicking on Bags button
	 * @author Norhan salman
	 */
	public static void clickOnBagsMenuItem() {
		TestObject bagsElm = findTestObject("Object Repository/Header/a_bags")
		WebUI.click(bagsElm)
	}

	/***
	 * hovering on Bags button
	 * @author Norhan salman
	 */
	public static void hoverOnBagsMenuItem() {
		TestObject bagsElm = findTestObject("Object Repository/Header/a_bags")
		WebUI.mouseOver(bagsElm)
	}

	/***
	 * clicking on Spotting and Pressing
	 * @author Norhan salman
	 */
	public static void clickOnPressingAndSpottingMenuItem() {
		TestObject pressingAndSpottingElm = findTestObject("Object Repository/Header/a_pressingAndSpottingMenuItem")
		WebUI.click(pressingAndSpottingElm)
	}

	/***
	 * hovering on Spotting and Pressing
	 * @author Norhan salman
	 */
	public static void hoverOnPressingAndSpottingMenuItem() {
		TestObject pressingAndSpottingElm = findTestObject("Object Repository/Header/a_pressingAndSpottingMenuItem")
		WebUI.mouseOver(pressingAndSpottingElm)
	}

	/***
	 * clicking on packaging
	 * @author Norhan salman
	 */
	public static void clickingOnPackagingMenuItem() {
		TestObject packagingElm = findTestObject("Object Repository/Header/a_packaging")
		WebUI.click(packagingElm)
	}

	/***
	 * hovering on packaging
	 * @author Norhan salman
	 */
	public static void hoveringOnPackagingMenuItem() {
		TestObject packagingElm = findTestObject("Object Repository/Header/a_packaging")
		WebUI.mouseOver(packagingElm)
	}

	/***
	 * clicking on racks
	 * @author Norhan salman
	 */
	public static void clickingOnRacksMenuItem() {
		TestObject racksElm = findTestObject("Object Repository/Header/a_racks")
		WebUI.click(racksElm)
	}

	/***
	 * hovering on racks
	 * @author Norhan salman
	 */
	public static void hoveringOnRacksMenuItem() {
		TestObject racksElm = findTestObject("Object Repository/Header/a_racks")
		WebUI.mouseOver(racksElm)
	}


	/***
	 * clicking on racks
	 * @author Norhan salman
	 */
	public static void clickingOnTailoringMenuItem() {
		TestObject tailoringElm = findTestObject("Object Repository/Header/a_tailoring")
		WebUI.click(tailoringElm)
	}

	/***
	 * hovering on racks
	 * @author Norhan salman
	 */
	public static void hoveringOnTailoringMenuItem() {
		TestObject tailoringElm = findTestObject("Object Repository/Header/a_tailoring")
		WebUI.mouseOver(tailoringElm)
	}

	/***
	 * clicking on laundromat
	 * @author Norhan salman
	 */
	public static void clickingLaundromatMenuItem() {
		TestObject laundromatElm = findTestObject("Object Repository/Header/a_laundromat")
		WebUI.click(laundromatElm)
	}

	/***
	 * hovering on laundromat
	 * @author Norhan salman
	 */
	public static void hoveringLaundromatMenuItem() {
		TestObject laundromatElm = findTestObject("Object Repository/Header/a_laundromat")
		WebUI.mouseOver(laundromatElm)
	}

	/***
	 * clicking on quickOrder
	 * @author Norhan salman
	 */
	public static void clickingQuickOrderMenuItem() {
		TestObject quickOrderElm = findTestObject("Object Repository/Header/a_quickOrderMenuItem")
		WebUI.click(quickOrderElm)
	}

	/***
	 * hovering on quick order menu item
	 * @author Norhan salman
	 */
	public static void hoveringOnQuickOrderMenuItem() {
		TestObject quickOrderElm = findTestObject("Object Repository/Header/a_quickOrderMenuItem")
		WebUI.mouseOver(quickOrderElm)
	}

	/***
	 * clicking on reorder
	 * @author Norhan salman
	 */
	public static void clickingOnReorderMenuItem() {
		TestObject reorderElm = findTestObject("Object Repository/Header/a_reorder")
		WebUI.click(reorderElm)
	}

	/***
	 * hovering on reorder menu item
	 * @author Norhan salman
	 */
	public static void hoveringOnReorderMenuItem() {
		TestObject reorderElm = findTestObject("Object Repository/Header/a_reorder")
		WebUI.mouseOver(reorderElm)
	}

	/***
	 * clicking on my account menu item
	 * @author Norhan salman
	 */
	public static void clickingOnMyAccountMenuItem() {
		TestObject myAccountElm = findTestObject("Object Repository/Header/button_myAccountButton")
		WebUI.click(myAccountElm)
	}

	/***
	 * hovering on My Account menu item
	 * @author Norhan salman
	 */
	public static void hoveringOnMyAccountMenuItem() {
		TestObject myAccountElm = findTestObject("Object Repository/Header/button_myAccountButton")
		WebUI.mouseOver(myAccountElm)
	}

	/***
	 * clicking on Cart menu item
	 * @author Norhan salman
	 */
	public static void clickingCartMenuItem() {
		TestObject cartElm = findTestObject("Object Repository/Header/a_cart")
		WebUI.click(cartElm)
	}

	/***
	 * hovering on Cart menu item
	 * @author Norhan salman
	 */
	public static void hoveringOnCartMenuItem() {
		TestObject cartElm = findTestObject("Object Repository/Header/a_cart")
		WebUI.mouseOver(cartElm)
	}

	/***
	 * clicking on Details link
	 * @author Norhan salman
	 */
	public static void clickingOnDetailsLink() {
		TestObject detailsLinkElm = findTestObject("Object Repository/Header/a_details")
		WebUI.click(detailsLinkElm)
	}

	/***
	 * hovering on Details Link
	 * @author Norhan salman
	 */
	public static void hoveringOnDetailsLink() {
		TestObject detailsLinkElm = findTestObject("Object Repository/Header/a_details")
		WebUI.mouseOver(detailsLinkElm)
	}

	/***
	 * clicking on Customer Service link
	 * @author Norhan salman
	 */
	public static void clickingOnCustomerServiceLink() {
		TestObject CustomerServiceElm = findTestObject("Object Repository/Header/a_customerService")
		WebUI.click(CustomerServiceElm)
	}

	/***
	 * hovering on Customer Service Link
	 * @author Norhan salman
	 */
	public static void hoveringOnCustomerServiceLink() {
		TestObject CustomerServiceElm = findTestObject("Object Repository/Header/a_customerService")
		WebUI.mouseOver(CustomerServiceElm)
	}
}
