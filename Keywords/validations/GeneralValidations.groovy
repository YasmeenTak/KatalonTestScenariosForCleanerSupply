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

public class GeneralValidations {
	/***
	 * Verify Current Page Title Is Not Empty
	 * @author wesam hamad
	 */
	public static void verifyCurrentPageTitleIsNotEmpty() {
		assert !WebUI.getWindowTitle().isEmpty()
	}

	/***
	 * verify current page title match the expected title
	 * @param expectedTitle
	 * @author wesam hamad
	 */
	public static void verifyCurrentPageTitleValue(String expectedTitle) {
		assert WebUI.getWindowTitle().equals(expectedTitle)
	}

	/**
	 * Verify Current Page URL matched the passed url
	 * @param expectedURL expectedURL or part of expectedURL
	 * @author wesam hamad
	 */
	public static void verifyCurrentPageURL(String expectedURL) {
		assert WebUI.getUrl().contains(expectedURL)
	}

	/**
	 * Verify Current Page Heading matched the passed Heading
	 * @param expectedHeading expectedHeading or part of expectedHeading
	 * @author Yasmeen
	 */
	public static void verifyCurrentPageHeading(String expectedHeading) {
		TestObject  pageHeading = findTestObject("Object Repository/GeneralTestObjects/h1_Heading");
		assert WebUI.verifyElementText(pageHeading, expectedHeading)
	}
}
