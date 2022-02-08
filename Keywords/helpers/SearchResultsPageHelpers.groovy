package helpers

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public class SearchResultsPageHelpers {

	public static int getNumberOfSearchResults() {
		TestObject resultsForSubheadingTestObject =  findTestObject("SearchResultPage/h2_subheadingOfSearchResultsPage");
		int startIndex =WebUI.getText(resultsForSubheadingTestObject).indexOf("(");
		int endIndex =WebUI.getText(resultsForSubheadingTestObject).indexOf(")");
		int numberOfSearchResults = Integer.parseInt(WebUI.getText(resultsForSubheadingTestObject).substring(startIndex+1,endIndex));
		return numberOfSearchResults;
	}
	public static int getAvailableColorNumber() {
		return Integer.parseInt(WebUI.getText(findTestObject("Object Repository/SearchResultPage/span_availableColors")).trim().split(" ")[2])
	}
}
