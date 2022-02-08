package helpers

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

import actions.HeaderActions
import internal.GlobalVariable
import validations.HeaderValidations

public class HeadingHelpers {

	public static void hoveringOverNavbarLeftItems() {
		HeaderActions.hoveringLaundromatMenuItem()
		HeaderValidations.verifyHoveringOnLaundromat()

		HeaderActions.hoverOnTagsAndFormsButton()
		HeaderValidations.verifyHoveringOnTagsAndForms()

		HeaderActions.hoveringOnPackagingMenuItem()
		HeaderValidations.verifyHoveringOnPackaging()

		HeaderActions.hoverOnCounterAndCheckInMenuItem()
		HeaderValidations.verifyHoveringOnCounterAndCheckIn()

		HeaderActions.hoveringOnRacksMenuItem()
		HeaderValidations.verifyHoveringOnRacks()

		HeaderActions.hoverOnBagsMenuItem()
		HeaderValidations.verifyHoveringOnBags()

		HeaderActions.hoverOnPressingAndSpottingMenuItem()
		HeaderValidations.verifyHoveringOnPressingAndSpotting()

		HeaderActions.hoveringOnTailoringMenuItem()
		HeaderValidations.verifyHoveringOnTailoring()

		HeaderActions.hoveringOnCartMenuItem()
		HeaderValidations.verifyHoveringOnCart()

		HeaderActions.hoveringOnQuickOrderMenuItem()
		HeaderValidations.verifyHoveringOnQuickOrder()

		HeaderActions.hoveringOnReorderMenuItem()
		HeaderValidations.verifyHoveringOnReorder()

		HeaderActions.hoveringOnMyAccountMenuItem()
		HeaderValidations.verifyHoveringOnMyAccount()
	}

	public static void clickingOverNavbarLeftItems() {
		HeaderActions.clickingLaundromatMenuItem()
		HeaderValidations.verifyClickingOnLaundromat()

		HeaderActions.clickOnTagsAndFormsButton()
		HeaderValidations.verifyClickingOnTagsAndForms()

		HeaderActions.clickingOnPackagingMenuItem()
		HeaderValidations.verifyClickingOnPackaging()

		HeaderActions.clickOnCounterAndCheckInMenuItem()
		HeaderValidations.verifyClickingOnCounterAndCheckIn()

		HeaderActions.clickingOnRacksMenuItem()
		HeaderValidations.verifyClickingOnRacks()

		HeaderActions.clickOnBagsMenuItem()
		HeaderValidations.verifyClickingOnBags()

		HeaderActions.clickOnPressingAndSpottingMenuItem()
		HeaderValidations.verifyClickingOnPressingAndSpotting()

		HeaderActions.clickingOnTailoringMenuItem()
		HeaderValidations.verifyClickingOnTailoring()

		HeaderActions.clickingQuickOrderMenuItem()
		HeaderValidations.verifyClickingOnQuickOrder()

		HeaderActions.clickingOnReorderMenuItem()
		HeaderValidations.verifyClickingOnReorder()

		HeaderActions.clickingCartMenuItem()
		HeaderValidations.verifyClickingOnCart()
	}
}
