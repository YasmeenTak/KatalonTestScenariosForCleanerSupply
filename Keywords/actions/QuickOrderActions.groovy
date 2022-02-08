package actions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class QuickOrderActions {

	/***
	 * fill the stock id for first product
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillFirstStockId() {
		TestObject firstStock = findTestObject("Object Repository/QuickOrderPage/input_stock1")
		WebUI.setText(firstStock, GlobalVariable.productId1)
		WebUI.sendKeys(firstStock, Keys.chord(Keys.SPACE))
		return firstStock
	}

	/***
	 * fill the stock id for second product
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillSecondStockId() {
		TestObject secondStock = findTestObject("Object Repository/QuickOrderPage/input_stock2")
		WebUI.setText(secondStock, GlobalVariable.productId2)
		WebUI.sendKeys(secondStock, Keys.chord(Keys.SPACE))
		return secondStock
	}


	/***
	 * fill the stock id for third product
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillThirdStockId() {
		TestObject thirdStock = findTestObject("Object Repository/QuickOrderPage/input_stock3")
		WebUI.setText(thirdStock, GlobalVariable.productId3)
		WebUI.sendKeys(thirdStock, Keys.chord(Keys.SPACE))
		return thirdStock
	}


	/***
	 * fill the stock id for fourth product
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillFourthStockId() {
		TestObject fourthStock = findTestObject("Object Repository/QuickOrderPage/input_stock4")
		WebUI.setText(fourthStock, GlobalVariable.productId4)
		WebUI.sendKeys(fourthStock, Keys.chord(Keys.SPACE))
		return fourthStock
	}


	/***
	 * fill the stock id for fifth product
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillFifthStockId() {
		TestObject fifthStock = findTestObject("Object Repository/QuickOrderPage/input_stock5")
		WebUI.setText(fifthStock, GlobalVariable.productId5)
		WebUI.sendKeys(fifthStock, Keys.chord(Keys.SPACE))
		return fifthStock
	}

	/***
	 * 
	 * @param menuObject
	 */
	public static void chooseProductFromMenuDropDown(TestObject menuObject) {
		TestObject menuTestObject = findTestObject("Object Repository/QuickOrderPage/span_loadingProducts")
		WebUI.waitForElementNotVisible(menuTestObject, 1)
		WebUI.click(menuObject)
	}


	/***
	 * fill the first product quantity
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillFirstQuantity(String quantity) {
		TestObject firstQuantity = findTestObject("Object Repository/QuickOrderPage/input_quantity1")
		WebUI.sendKeys(firstQuantity, Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(firstQuantity, quantity)
		return firstQuantity
	}

	/***
	 * fill the second product quantity
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillSecondQuantity(String quantity) {
		TestObject secondQuantity = findTestObject("Object Repository/QuickOrderPage/input_quantity2")
		WebUI.sendKeys(secondQuantity, Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(secondQuantity, quantity)
		return secondQuantity
	}


	/***
	 * fill third product quantity
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillThirdQuantity(String quantity) {
		TestObject thirdQuantity = findTestObject("Object Repository/QuickOrderPage/input_quantity3")
		WebUI.sendKeys(thirdQuantity, Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(thirdQuantity, quantity)
		return thirdQuantity
	}


	/***
	 * fill fourth product Quantity
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillFourthQuantity(String quantity) {
		TestObject fourthQuantity = findTestObject("Object Repository/QuickOrderPage/input_quantity4")
		WebUI.sendKeys(fourthQuantity, Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(fourthQuantity, quantity)
		return fourthQuantity
	}


	/***
	 * fill fifth product quantity
	 * @return the test object of the input
	 * @author Norhan salman
	 */
	public static TestObject fillFifthQuantity(String quantity) {
		TestObject fifthQuantity = findTestObject("Object Repository/QuickOrderPage/input_quantity5")
		WebUI.sendKeys(fifthQuantity, Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(fifthQuantity, quantity)
		return fifthQuantity
	}

	/***
	 * hover over add to cart button
	 * @author Norhan salman
	 */
	public static void hoverbOverAddToCart() {
		TestObject addToCartButton = findTestObject("Object Repository/QuickOrderPage/button_addToCart")
		WebElement addToCartButtonElm = WebUI.findWebElement(addToCartButton)
		WebUI.mouseOver(addToCartButton)
	}

	/***
	 * click on add to cart button
	 * @author Norhan salman 
	 */
	public static void clickOnAddToCartButton() {
		TestObject addToCartButton = findTestObject("Object Repository/QuickOrderPage/button_addToCart")
		WebUI.click(addToCartButton)
	}
}
