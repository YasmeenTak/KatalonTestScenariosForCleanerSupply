package actions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import java.util.Random;




public class CheckoutPageActions {
	/***
	 * filling Data in Shipping Address section
	 * @author Yasmeen
	 * @param conmpanyName
	 * @param firstName
	 * @param lastName
	 * @param addressLine
	 * @param zipCode
	 * @param city
	 * @param phone
	 * @param phoneExt
	 * @param email
	 */

	public static void fillingShippingAddressSectionData(String conmpanyName, String firstName, String lastName,
			String addressLine, String zipCode, String city, String phone, String phoneExt, String email) {

		TestObject conmpanyNameInput= findTestObject("Object Repository/CheckoutPage/input_Company");
		WebUI.setText(conmpanyNameInput, conmpanyName);

		TestObject firstNameInput= findTestObject("Object Repository/CheckoutPage/input_FirstName");
		WebUI.setText(firstNameInput, firstName);

		TestObject lastNameInput= findTestObject("Object Repository/CheckoutPage/input_LastName");
		WebUI.setText(lastNameInput, lastName);

		TestObject addressLineInput= findTestObject("Object Repository/CheckoutPage/input_AddressLine");
		WebUI.setText(addressLineInput, addressLine);

		TestObject zipCodeInput= findTestObject("Object Repository/CheckoutPage/input_zipCode");
		WebUI.setText(zipCodeInput, zipCode);

		TestObject cityInput= findTestObject("Object Repository/CheckoutPage/input_City");
		WebUI.setText(cityInput, city);

		TestObject stateSelectBtn= findTestObject("Object Repository/CheckoutPage/button_SelectState");
		WebUI.click(stateSelectBtn)

		TestObject stateSelectOption= findTestObject("Object Repository/CheckoutPage/li_SelectStateOption");
		WebUI.click(stateSelectOption)


		TestObject phoneNumberInput= findTestObject("Object Repository/CheckoutPage/input_PhoneNumber");
		WebUI.setText(phoneNumberInput, phone);

		TestObject phoneExtInput= findTestObject("Object Repository/CheckoutPage/input_phoneExtension");
		WebUI.sendKeys(phoneExtInput, phoneExt);

		//WebUI.sendKeys(findTestObject("Object Repository/CheckoutPage/input_phoneExtension"),phoneExt.toString(),Keys.chord(Keys.TAB))
		//WebUI.sendKeys(phoneExt, Keys.chord(Keys.TAB))

		//		TestObject bodyTestObject = findTestObject('Object Repository/CheckoutPage/body')
		//		WebUI.findWebElement(bodyTestObject, GlobalVariable.elementVisibilityTimeOut).click()

		TestObject emailInput= findTestObject("Object Repository/CheckoutPage/input_Email");
		WebUI.setText(emailInput, email);
	}
	/***
	 * Filling payment method Section Data
	 * @author Yasmeen
	 * @param nameOnCard
	 * @param creditCardNumber
	 * @param securityCode
	 */
	public static void fillingPaymentMethodSectionData(String nameOnCard, String creditCardNumber, String securityCode) {
		TestObject nameOnCardInput= findTestObject("Object Repository/CheckoutPage/input_NameOnCard");
		WebUI.setText(nameOnCardInput, nameOnCard);

		TestObject creditCardNumberInput = findTestObject("Object Repository/CheckoutPage/input_CreditCardNumber");
		WebUI.setText(creditCardNumberInput, creditCardNumber);

		TestObject securityCodeInput = findTestObject("Object Repository/CheckoutPage/input_SecurityCode");
		WebUI.setText(securityCodeInput, securityCode);

		TestObject expDateMonthBtn = findTestObject("Object Repository/CheckoutPage/button_ExpirationDateMonth");
		WebUI.click(expDateMonthBtn)

		TestObject expDateMonthList = findTestObject('Object Repository/CheckoutPage/li_ExpDateMonthList')
		List <WebElement> expDateMonthListElements = WebUI.findWebElements(expDateMonthList, GlobalVariable.elementVisibilityTimeOut)
		int randomNumber = Math.random();
		expDateMonthListElements.get(randomNumber * expDateMonthListElements.size()).click()


		TestObject expDateYearBtn = findTestObject("Object Repository/CheckoutPage/button_ExpirationDateYear");
		WebUI.click(expDateYearBtn)

		TestObject expDateYearList = findTestObject('Object Repository/CheckoutPage/li_ExpDateYearList')
		List <WebElement> expDateYearListElements = WebUI.findWebElements(expDateYearList, GlobalVariable.elementVisibilityTimeOut)
		expDateYearListElements.get(randomNumber * expDateYearListElements.size()).click()
	}

	/***
	 * Clicking On Review Order Button
	 * @author Yasmeen
	 */
	public static void clickingOnReviewOrderBtn() {
		TestObject reviewOrderBtn = findTestObject("Object Repository/CheckoutPage/a_ReviewOrder");
		WebUI.click(reviewOrderBtn)
	}
}