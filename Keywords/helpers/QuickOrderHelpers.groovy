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

import actions.QuickOrderActions
import internal.GlobalVariable
import validations.QuickOrderValidations

public class QuickOrderHelpers {

	/***
	 * Entering Quick order products
	 * @author Norhan Salman
	 */
	public static void enterQuickOrderProducts() {
		TestObject firstStockInput = QuickOrderActions.fillFirstStockId()
		QuickOrderValidations.verifyFocusingOnStockInput(firstStockInput)
		QuickOrderValidations.verifyPalceholderRemovedAfterFilling(firstStockInput)
		TestObject ProductMenu1 = findTestObject("Object Repository/QuickOrderPage/ul_productMenu1")
		QuickOrderValidations.verifyDropDownMenuIsDisplayed(ProductMenu1)
		QuickOrderActions.chooseProductFromMenuDropDown(ProductMenu1)
		QuickOrderValidations.verifyTheEnterdValueReflectedInStockInput(firstStockInput, GlobalVariable.productId1)


		TestObject secondStockInput = QuickOrderActions.fillSecondStockId()
		QuickOrderValidations.verifyFocusingOnStockInput(secondStockInput)
		QuickOrderValidations.verifyPalceholderRemovedAfterFilling(secondStockInput)
		TestObject ProductMenu2 = findTestObject("Object Repository/QuickOrderPage/ul_productMenu2")
		QuickOrderValidations.verifyDropDownMenuIsDisplayed(ProductMenu2)
		QuickOrderActions.chooseProductFromMenuDropDown(ProductMenu2)
		QuickOrderValidations.verifyTheEnterdValueReflectedInStockInput(secondStockInput, GlobalVariable.productId2)


		TestObject thirdStockInput = QuickOrderActions.fillThirdStockId()
		QuickOrderValidations.verifyFocusingOnStockInput(thirdStockInput)
		QuickOrderValidations.verifyPalceholderRemovedAfterFilling(thirdStockInput)
		TestObject ProductMenu3 = findTestObject("Object Repository/QuickOrderPage/ul_productMenu3")
		QuickOrderValidations.verifyDropDownMenuIsDisplayed(ProductMenu3)
		QuickOrderActions.chooseProductFromMenuDropDown(ProductMenu3)
		QuickOrderValidations.verifyTheEnterdValueReflectedInStockInput(thirdStockInput, GlobalVariable.productId3)


		TestObject fourthStockInput = QuickOrderActions.fillFourthStockId()
		QuickOrderValidations.verifyFocusingOnStockInput(fourthStockInput)
		QuickOrderValidations.verifyPalceholderRemovedAfterFilling(fourthStockInput)
		TestObject ProductMenu4 = findTestObject("Object Repository/QuickOrderPage/ul_productMenu4")
		QuickOrderValidations.verifyDropDownMenuIsDisplayed(ProductMenu4)
		QuickOrderActions.chooseProductFromMenuDropDown(ProductMenu4)
		QuickOrderValidations.verifyTheEnterdValueReflectedInStockInput(fourthStockInput, GlobalVariable.productId4)


		TestObject fifthStockInput = QuickOrderActions.fillFifthStockId()
		QuickOrderValidations.verifyFocusingOnStockInput(fifthStockInput)
		QuickOrderValidations.verifyPalceholderRemovedAfterFilling(fifthStockInput)
		TestObject ProductMenu5 = findTestObject("Object Repository/QuickOrderPage/ul_productMenu5")
		QuickOrderValidations.verifyDropDownMenuIsDisplayed(ProductMenu5)
		QuickOrderActions.chooseProductFromMenuDropDown(ProductMenu5)
		QuickOrderValidations.verifyTheEnterdValueReflectedInStockInput(fifthStockInput, GlobalVariable.productId5)
	}

	/***
	 * Entering Quick order products quantity
	 * @author Norhan Salman
	 */
	public static void enterProductsQuantity() {
		String firstRandomQuantity = getRandomNumber()
		TestObject firstQuantityElm = QuickOrderActions.fillFirstQuantity(firstRandomQuantity)
		QuickOrderValidations.verifyQuantityValueIsReflected(firstQuantityElm, firstRandomQuantity)
		GlobalVariable.productQuantity1 = firstRandomQuantity

		String secondRandomQuantity = getRandomNumber()
		TestObject secondQuantityElm = QuickOrderActions.fillSecondQuantity(secondRandomQuantity)
		QuickOrderValidations.verifyQuantityValueIsReflected(secondQuantityElm, secondRandomQuantity)
		GlobalVariable.productQuantity2 = secondRandomQuantity

		String thirdRandomQuantity = getRandomNumber()
		TestObject thirdQuantityElm = QuickOrderActions.fillThirdQuantity(thirdRandomQuantity)
		QuickOrderValidations.verifyQuantityValueIsReflected(thirdQuantityElm, thirdRandomQuantity)
		GlobalVariable.productQuantity3 = thirdRandomQuantity

		String fourthRandomQuantity = getRandomNumber()
		TestObject fourthQuantityElm = QuickOrderActions.fillFourthQuantity(fourthRandomQuantity)
		QuickOrderValidations.verifyQuantityValueIsReflected(fourthQuantityElm, fourthRandomQuantity)
		GlobalVariable.productQuantity4 = fourthRandomQuantity

		String fifthRandomQuantity = getRandomNumber()
		TestObject fifthQuantityElm = QuickOrderActions.fillFifthQuantity(fifthRandomQuantity)
		QuickOrderValidations.verifyQuantityValueIsReflected(fifthQuantityElm, fifthRandomQuantity)
		GlobalVariable.productQuantity5 = fifthRandomQuantity

		WebUI.click(findTestObject("Object Repository/QuickOrderPage/div_tempElm"));
	}

	/**
	 * Get Ranndom number between 5 - 50
	 * @author Norhan salman
	 */
	public static String getRandomNumber() {
		int randomQuantity = (int) (Math.random() * (50 - 5)) + 5;
		return randomQuantity.toString()
	}
}
