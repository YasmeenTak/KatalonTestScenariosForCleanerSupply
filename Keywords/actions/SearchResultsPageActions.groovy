package actions

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

public class SearchResultsPageActions {
	public static void selectPackingProductsFilter() {
		TestObject selectPackingProductsTestObject = findTestObject("Object Repository/SearchResultPage/span_packingProductsCheckbox");
		WebUI.click(selectPackingProductsTestObject);
	}
	public static void selectPlasticBagsFilter() {
		TestObject selectPlasticBagsTestObject = findTestObject("Object Repository/SearchResultPage/span.color-plastic-bags");
		WebUI.click(selectPlasticBagsTestObject);
	}
	public static void clickColorGroupCollapse() {
		TestObject colorGroupCollapseTestObject = findTestObject("Object Repository/SearchResultPage/div_colorGroupCollapse");
		WebUI.click(colorGroupCollapseTestObject);
	}
	public static void clickGreenColor() {
		TestObject greenColorTestObject = findTestObject("Object Repository/SearchResultPage/span_colorGreenCheckout");
		WebUI.click(greenColorTestObject);
	}
	public static void clickGreenPlasticPackingProduct() {
		TestObject greenPlasticPackingProductTestObject = findTestObject("Object Repository/SearchResultPage/a_greenPlasticPackingProduct");
		WebUI.click(greenPlasticPackingProductTestObject);
	}
}
