package validations

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.eclipse.jdt.internal.compiler.ast.ForeachStatement
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class HomePageValidations {
	public static int numberOfResults;

	public static void verifyPlaceholderDisappear() {
	}
	public static void verifySuggestionDropdownSearchDisplay() {
//		assert WebUI.verifyElementVisible(findTestObject("Object Repository/HomePage/div_dropdownSearchResult"));
	}
	public static void verifySearchForContainsWord(String word) {
		WebUI.waitForElementVisible(findTestObject("Object Repository/HomePage/div_dropdownSearchResult"), GlobalVariable.elementVisibilityTimeOut)
		TestObject searchForStrong = findTestObject("HomePage/strong_searchFor");
		String searchForTxt = WebUI.getText(searchForStrong);
		assert searchForTxt.trim().equals(word.toUpperCase());
	}
	public static void verifySearchWordInCategoriesAndProducts(String word) {
		WebUI.waitForElementVisible(findTestObject("Object Repository/HomePage/div_dropdownSearchResult"), GlobalVariable.elementVisibilityTimeOut)
		List <WebElement> searchWordElements =
				WebUI.findWebElements(findTestObject("Object Repository/HomePage/strong_keywoard"),
				GlobalVariable.elementVisibilityTimeOut)
		for(WebElement wordElement : searchWordElements){
			assert wordElement.getText().equals(word);
		}
	}
	public static void verifyLoadingResultTextForSearch() {
		TestObject loadingResultTestObject = findTestObject("Object Repository/HomePage/span_searchTextLoading");
		assert WebUI.verifyElementVisible(loadingResultTestObject);
	}
	/***
	 * Verify Dropdown Tags & Forms Menu is Displayed
	 * @author Yasmeen
	 */
	public static void verifyDropdownTagsAndFormsMenuDisplayed() {
		TestObject  dropdownTagsAndFormsMenu = findTestObject("Object Repository/HomePage/div_dropdownTagsAndForms");
		assert WebUI.verifyElementVisible(dropdownTagsAndFormsMenu);
	}

	/***
	 * Verify Hovering over 'Tags & Forms'
	 * @author Yasmeen
	 */
	public static void verifyHoveringOverTagsAndForms() {
		TestObject TagsAndFormsNav = findTestObject("Object Repository/HomePage/a-TagsAndFormsNav");
		assert WebUI.getCSSValue(TagsAndFormsNav, "color").equals("rgba(82, 36, 127, 1)")
		//assert WebUI.getCSSValue(TagsAndFormsNav, "background").equals("rgb(255, 255, 255)")
	}

	/***
	 * Verify Hovering Over 'Computers & Registers' category
	 * @author Yasmeen
	 */
	public static void verifyHoveringOverComputersRegistersDesign() {
		TestObject computersAndRegistersLink  = findTestObject("Object Repository/HomePage/a_ComputersAndRegisters");
		WebUI.mouseOver(computersAndRegistersLink);
		assert WebUI.getCSSValue(computersAndRegistersLink, "color").equals("rgba(82, 36, 127, 1)")
		//		String color =  WebUI.getCSSValue(computersAndRegistersLink, 'color');
		//		println("hereeeeee"+color)
	}
}
