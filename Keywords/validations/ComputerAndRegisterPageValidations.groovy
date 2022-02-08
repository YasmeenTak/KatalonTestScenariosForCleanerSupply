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

public class ComputerAndRegisterPageValidations {
	/***
	 * Verify the select tag have "Manufacturer" title by default in filters section
	 * @author Yasmeen
	 */

	public static void verifySelectTagHaveManufacturerTitle() {
		TestObject  selectTag = findTestObject("Object Repository/ComputerAndRegisterPage/select_SelectTitle");
		assert WebUI.verifyElementAttributeValue(selectTag, 'title', 'Manufacturer', 0)
	}
	/***
	 * Verify the Dropdown Menu Option Have 'Casio'
	 * @author Yasmeen 
	 */
	public static void verifyDropdownMenuOptionHaveCasio() {
		TestObject  manufacturerSelectOption = findTestObject("Object Repository/ComputerAndRegisterPage/select_SelectTitle");
		assert WebUI.verifyOptionsPresent(manufacturerSelectOption, ["Casio"])
	}

	/***
	 * Verify the Casio Option is Selected
	 * @author Yasmeen
	 */
	public static void verifyCasioIsSelected() {
		TestObject  manufacturerSelectOptions = findTestObject("Object Repository/ComputerAndRegisterPage/select_SelectTitle");
		//assert WebUI.verifyElementHasAttribute(casioOption, 'selected', 0)
		assert WebUI.verifyOptionSelectedByLabel(manufacturerSelectOptions, 'Casio', false, 0)
	}

	/***
	 * Verify the 'SP100' model Option is Selected
	 * @author Yasmeen
	 */
	public static void VerifySP100ModelIsSelected() {
		TestObject  modelOption = findTestObject("Object Repository/ComputerAndRegisterPage/select_ModelOption");
		//assert WebUI.verifyElementHasAttribute(casioOption, 'selected', 0)
		assert WebUI.verifyOptionSelectedByLabel(modelOption, 'SP1000', false, 0)
	}

	/***
	 * Verify the model is enable
	 * @author Yasmeen
	 */
	public static void VerifyModelIsEnable() {
		TestObject  modelOptionBtn = findTestObject("Object Repository/ComputerAndRegisterPage/button_ModelList");
		assert WebUI.verifyElementClickable(modelOptionBtn)
	}

	/***
	 * Verify Hovering over resulted product
	 * @author Yasmeen
	 */
	public static void verifyHoveringOverResultedProduct() {
		TestObject productElement = findTestObject("Object Repository/ComputerAndRegisterPage/a_Product");
		WebUI.mouseOver(productElement)
		assert WebUI.getCSSValue(productElement, "box-shadow").equals("rgba(0, 0, 0, 0.55) 0px 0px 10px 1px")
	}
}
