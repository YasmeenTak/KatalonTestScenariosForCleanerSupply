package actions


import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class ProductDetailsPageActions {
	public static void selectXlargeSize() {
		TestObject xLargeSizeTestObject = findTestObject("Object Repository/ProductDetailsPage/a_extraLargeButton");
		WebUI.click(xLargeSizeTestObject);
	}
	public static void clickGreenColor() {
		TestObject xLargeSizeTestObject = findTestObject("Object Repository/ProductDetailsPage/a_greenColor");
		WebUI.click(xLargeSizeTestObject);
	}
	public static void enterProductQuantity(String quantity) {
		TestObject productQuantityTestObject = findTestObject("Object Repository/ProductDetailsPage/input_quantity");
		WebUI.sendKeys(productQuantityTestObject, Keys.chord(Keys.BACK_SPACE));
		WebUI.setText(productQuantityTestObject, quantity);
	}
	public static void clickAddToButton() {
		TestObject addToButtonTestObject = findTestObject("Object Repository/ProductDetailsPage/button_addToCart");
		WebUI.click(addToButtonTestObject);
	}
	/***
	 * Change Product Quantities items 
	 * @author Yasmeen
	 * @param quantityNumber the Quantity Numbers of items want to change
	 */
	public static void changeProductQuantities (String quantityNumber) {
		TestObject productQuantityInput= findTestObject("Object Repository/ProductDetailsPage/input_ProductQuantity");
		WebUI.sendKeys(findTestObject("Object Repository/ProductDetailsPage/input_ProductQuantity"), Keys.chord(Keys.BACK_SPACE))
		WebUI.setText(productQuantityInput, quantityNumber)
	}
	/***
	 * Adding items to the cart
	 * @author Yasmeen
	 */
	public static void clickingOnAddToCartButton() {
		TestObject addToCartBtn= findTestObject("Object Repository/ProductDetailsPage/button_AddToCart");
		WebUI.click(addToCartBtn)
	}
	/***
	 * Clicking on Cart icon in navbar item
	 * @author Yasmeen
	 */
	public static void clickingOnCartIcon() {
		TestObject cartIcon= findTestObject("Object Repository/ProductDetailsPage/li_CartIcon");
		WebUI.click(cartIcon)
	}
}
