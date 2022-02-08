package validations

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.Assert

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

public class QuickOrderValidations {

	/***
	 * Verify Quick order page URL
	 * @author Norhan Salman
	 */
	public static void verifyPageURL() {
		String expectedURL = "/quick-order"
		String actualURL = WebUI.getUrl()
		Assert.assertTrue(actualURL.contains(expectedURL))
	}

	/***
	 * Verify Quick order page Title
	 * @author Norhan Salman
	 */
	public static void verifyPageTitle() {
		String expectedTitle = "Quick Order - Cleaner's Supply"
		String actualTitle = WebUI.getWindowTitle()
		Assert.assertTrue(actualTitle.contains(expectedTitle))
	}

	/***
	 * Verify Quick order page heading
	 * @author Norhan Salman
	 */
	public static void verifyPageHeading() {
		TestObject pageHeadeingObject = findTestObject("Object Repository/QuickOrderPage/a_pageHeading")
		String expectedHeading = ""
		String actualHeading = WebUI.getText(pageHeadeingObject)
		Assert.assertTrue(actualHeading.contains(expectedHeading))
	}

	/***
	 * verify quick order page sub heading
	 * @author Norhan Salman
	 */

	public static void verifyPageSubHeading() {
		TestObject pageSubHeading = findTestObject("Object Repository/QuickOrderPage/p_pageSubHeading")
		String expectedSubHeading = "Quick and easy ordering! Simply enter the stock number and the quantities you wish to order, then click button to ADD TO CART."
		String acutalSubHeading = WebUI.getText(pageSubHeading)
		Assert.assertTrue(acutalSubHeading.contains(expectedSubHeading))
	}

	/***
	 * verify the palceholder of each stock input
	 * @author Norhan Salman
	 */
	public static void verifyStockInputPlaceholder() {
		List<WebElement> stockInputs = WebUI.findWebElements(findTestObject('QuickOrderPage/input_stock'),10);
		String expectedPlaceHolder = "Enter Stock #";
		for(WebElement elm : stockInputs) {
			String actualPlaceholder = elm.getAttribute("placeholder");
			assert actualPlaceholder.equals(expectedPlaceHolder)
		}
	}

	/***
	 * verify Focusing over stock input field
	 * @param stockInput: the TestObject of the stock input field
	 * @author Norhan Salman
	 */
	public static void verifyFocusingOnStockInput(TestObject stockInput) {
		String focusedBorderColor = WebUI.getCSSValue(stockInput, "border-color")
		assert focusedBorderColor.equals("rgb(99, 99, 99)")
	}

	/***
	 * verify reflected value of stock input
	 * @param stockInput: the TestObject of the stock input field
	 * @param value: the entered value in the field
	 * @author Norhan Salman
	 */
	public static void verifyTheEnterdValueReflectedInStockInput(TestObject stockInput, String value) {
		String actualValue = WebUI.getAttribute(stockInput, "value")
		assert value.contains(actualValue)
	}

	/***
	 * verify reflected value of stock input
	 * @param stockInput: the TestObject of the stock input field
	 * @param value: the entered value in the field
	 * @author Norhan Salman
	 */
	public static void verifyPalceholderRemovedAfterFilling(TestObject stockInput) {
		String actualValue = WebUI.getAttribute(stockInput, "placeholder")
		assert !actualValue.equals("Enter Stock #")
	}

	/***
	 * verify reflected value of product quantity
	 * @param quantityInput: the TestObject of the stock input field
	 * @param value: the entered value in the field
	 * @author Norhan Salman
	 */
	public static void verifyTheEnterdValueReflectedInQuantityInput(TestObject quantityInput, String value) {
		String actualValue = WebUI.getAttribute(quantityInput, "value")
		assert actualValue.equals(value)
	}

	/***
	 * verify product suggestions drop down menu is displayed
	 * @param quantityInput: the TestObject of the dropDown menu
	 * @author Norhan Salman
	 */
	public static void verifyDropDownMenuIsDisplayed(TestObject dropDownElm) {
		boolean isVisibleElm = WebUI.verifyElementVisible(dropDownElm)
		assert isVisibleElm == true
	}

	/***
	 * verify that correct products data filled in the table
	 * @author Norhan salman
	 */
	public static void verifyCorrectProductDetails() {
		List<WebElement> products = WebUI.findWebElements(findTestObject("Object Repository/QuickOrderPage/tr_producTableRows"),2)
		for(int i = 0 ; i < products.size(); ++i) {
			if(i == 0 ) {
				verifyProductRowDetails(products[i], GlobalVariable.productImage1, GlobalVariable.productName1, GlobalVariable.productPrice1)
			}else if(i == 1) {
				verifyProductRowDetails(products[i], GlobalVariable.productImage2, GlobalVariable.productName2, GlobalVariable.productPrice2)
			}else if(i == 2) {
				verifyProductRowDetails(products[i], GlobalVariable.productImage3, GlobalVariable.productName3, GlobalVariable.productPrice3)
			}else if(i == 3) {
				verifyProductRowDetails(products[i], GlobalVariable.productImage4, GlobalVariable.productName4, GlobalVariable.productPrice4)
			}else if(i == 4) {
				verifyProductRowDetails(products[i], GlobalVariable.productImage5, GlobalVariable.productName5, GlobalVariable.productPrice5)
			}
		}
	}


	/***
	 * verify that correct products data filled in the table row
	 * @param row: the webElement of the Row
	 * @param image: the expected image src value
	 * @param name: the expected name value
	 * @param price: the expected price value
	 * @author Norhan salman
	 */
	public static verifyProductRowDetails(WebElement row, String image, String name, String price) {
		WebElement quantity = row.findElement(By.cssSelector(".product-table__quantity input"))
		assert quantity.getAttribute("value").equals("1")

		WebElement nameElm = row.findElement(By.cssSelector(".product-item__details a.product-title"))
		assert nameElm.getText().toLowerCase().equals(name.toLowerCase())

		WebElement stockElm = row.findElement(By.cssSelector(".stock-notification"))
		assert stockElm.getText().toLowerCase().contains("In Stock!".toLowerCase())


		WebElement imageElm = row.findElement(By.cssSelector(".product-table__image img"))
		assert imageElm.getAttribute("src").contains(image)

		WebElement priceElm = row.findElement(By.cssSelector(".price-holder"))
		assert priceElm.getText().equals(price)

		WebElement totalElm = row.findElement(By.cssSelector(".product-table__total.hidden-sm span"))
		assert totalElm.getText().equals(price)
	}

	/***
	 * verify quick order product quantity reflected value
	 * @param value: the entered quantity value
	 * @param quantityObject: the TestObject of the quantity fiels
	 * @author Norhan salman
	 */
	public static void verifyQuantityValueIsReflected(TestObject quantityObject , String value) {
		String actualValue = WebUI.getAttribute(quantityObject, "value")
		assert actualValue.equals(value)
	}

	/***
	 * verify total price for each quick order product
	 * @author Norhan salman
	 */
	public static void verifyTotalPriceForAllProducts() {
		List<WebElement> products = WebUI.findWebElements(findTestObject("Object Repository/QuickOrderPage/tr_producTableRows"),2)
		for(int i = 0 ; i < products.size(); ++i) {
			WebElement quantityElm = products[i].findElement(By.cssSelector(".product-table__quantity input"))
			double quantity = Double.parseDouble(quantityElm.getAttribute("value").replace('$', ''))

			WebElement priceElm = products[i].findElement(By.cssSelector(".price-holder"))
			double price = Double.parseDouble(priceElm.getText().replace('$', ''))

			WebElement totalElm = products[i].findElement(By.cssSelector(".product-table__total.hidden-sm span"))
			double total = Double.parseDouble(totalElm.getText().replace('$', '').replace(',', ''))
			assert total == Double.parseDouble(String.format("%.2f", price*quantity))
		}
	}

	/***
	 * verify hovering over add to cart button
	 * @author Norhan Slaman
	 */
	public static void verifyHoveringOverAddToCartButton() {
		TestObject addToCartButton = findTestObject("Object Repository/QuickOrderPage/button_addToCart")
		assert WebUI.getCSSValue(addToCartButton, "box-shadow").equals("rgba(0, 0, 0, 0.3) 0px 0px 10px 2px")
	}
}
