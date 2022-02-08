package validations

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

import helpers.SearchResultsPageHelpers
import internal.GlobalVariable

public class SearchResultsPageValidations {
	public static void verifyPageHeadingOfSearchResults(String text) {
		TestObject pageHeadingOfSearchResultsTestObject = findTestObject("SearchResultPage/h1_pageHeadingOfSearchResults");
		assert WebUI.getText(pageHeadingOfSearchResultsTestObject).contains(text);
	}
	public static void verifyResultsForContainsWord(String word) {
		TestObject resultsForSubheadingTestObject =  findTestObject("SearchResultPage/h2_subheadingOfSearchResultsPage");
		println(WebUI.getText(resultsForSubheadingTestObject));
		assert WebUI.getText(resultsForSubheadingTestObject).contains(word.toUpperCase());
	}
	public static void verifyNumberOfPagesInSearchResults(int searchResultsNumber) {
		if(searchResultsNumber >23) {
			int numberOfPages = Math.ceil(searchResultsNumber / 24);
			List<WebElement> paginationNumberItems = WebUI.findWebElements(findTestObject("SearchResultPage/a_paginationNumberItems"),GlobalVariable.elementVisibilityTimeOut);
			assert Integer.parseInt(paginationNumberItems.get(paginationNumberItems.size()-1).getText().trim()) == numberOfPages;
		}else {
			assert true;
		}
	}
	public static void verifyLoadingPageVisible() {
	}
	public static void verifyPackingProductsOptionSelected() {
		TestObject packingProductsListTestObject = findTestObject("Object Repository/SearchResultPage/li_packingProducts");
		WebUI.waitForElementAttributeValue(packingProductsListTestObject, "class", "selected ", GlobalVariable.elementVisibilityTimeOut)
		String classes = WebUI.getAttribute(packingProductsListTestObject, 'class');
		println(classes);
		//		assert classes.contains("selected");
	}
	public static void verifySelectedFilter(String filterName) {
		WebUI.waitForElementPresent(findTestObject("Object Repository/SearchResultPage/a_selectedFilters"),GlobalVariable.elementVisibilityTimeOut);
		List<WebElement> selectedFiltersElements = WebUI.findWebElements(findTestObject("Object Repository/SearchResultPage/a_selectedFilters"),
				GlobalVariable.elementVisibilityTimeOut);
		boolean selectedFilterExist =false;
		for(WebElement selectedFilterElement : selectedFiltersElements) {
			if(selectedFilterElement.getText().trim().toUpperCase().equals(filterName.trim().toUpperCase())) {
				selectedFilterExist =true;
			}
		}
		assert selectedFilterExist;
	}
	public static void verifyPlasticBagsOptionSelected() {
		TestObject packingProductsListTestObject = findTestObject("Object Repository/SearchResultPage/li_plasticBags");
		WebUI.waitForElementAttributeValue(packingProductsListTestObject, "class", "selected ", GlobalVariable.elementVisibilityTimeOut)
		String classes = WebUI.getAttribute(packingProductsListTestObject, "class");
		println(classes);
		//		assert classes.contains("selected");
	}
	public static void verifyNumberOfPackingProducts() {
		TestObject numberOfPackingProductsTestObject =  findTestObject("Object Repository/SearchResultPage/span_packingProductsNumber");
		int startIndex =WebUI.getText(numberOfPackingProductsTestObject).indexOf("(");
		int endIndex =WebUI.getText(numberOfPackingProductsTestObject).indexOf(")");
		int numberOfPackingProducts = Integer.parseInt(WebUI.getText(numberOfPackingProductsTestObject).substring(startIndex+1,endIndex));

		//		assert SearchResultsPageHelpers.getNumberOfSearchResults() == numberOfPackingProducts;
	}
	public static void verifyNumberOfPlasticBags() {
		TestObject numberOfPlasticBagsTestObject =  findTestObject("Object Repository/SearchResultPage/span_plasticBagsNumber");
		int startIndex =WebUI.getText(numberOfPlasticBagsTestObject).indexOf("(");
		int endIndex =WebUI.getText(numberOfPlasticBagsTestObject).indexOf(")");
		int numberOfPackingProducts = Integer.parseInt(WebUI.getText(numberOfPlasticBagsTestObject).substring(startIndex+1,endIndex));
		//		assert SearchResultsPageHelpers.getNumberOfSearchResults() == numberOfPlasticBags;
	}

	public static void verifyColorGroupContentOpen() {
		TestObject colorGroupContentTestObject = findTestObject("Object Repository/SearchResultPage/div_colorGroupCollapseContent");
		String displayProperty = WebUI.getCSSValue(colorGroupContentTestObject,"display");
		assert displayProperty == "block";
	}
	public static void verifyGreenColorOptionSelected() {
		TestObject greenColorListTestObject = findTestObject("Object Repository/SearchResultPage/li_greenColorOption");
		WebUI.waitForElementAttributeValue(greenColorListTestObject, "class", "selected ", GlobalVariable.elementVisibilityTimeOut)
		String classes = WebUI.getAttribute(greenColorListTestObject, "class");
		//		assert classes.contains("selected");
	}
	public static void verifyNumberOfGreenColor() {
		TestObject numberOfGreenColorsTestObject =  findTestObject("Object Repository/SearchResultPage/span_colorGreenNumber");
		int startIndex =WebUI.getText(numberOfGreenColorsTestObject).indexOf("(");
		int endIndex =WebUI.getText(numberOfGreenColorsTestObject).indexOf(")");
		int numberOfGreenColors = Integer.parseInt(WebUI.getText(numberOfGreenColorsTestObject).substring(startIndex+1,endIndex));
		//				assert SearchResultsPageHelpers.getNumberOfSearchResults() == numberOfGreenColors;
	}
	public static boolean VerifyPriceInRange(double price) {
		List<WebElement> priceElements = WebUI.findWebElements(findTestObject("Object Repository/SearchResultPage/span_prices"),GlobalVariable.elementVisibilityTimeOut);
		double [] priceRange = new double[priceElements.size()];
		boolean inRange=false;
		for(int i=0 ;i<priceElements.size();i++) {
			priceRange[i] = Double.parseDouble(priceElements[i].getText().substring(1));
		}
		if(priceRange[0]<= price | priceElements[1]>=price) {
			inRange =true;
		}
		assert IntRange;
	}
	public static boolean VerifySalePriceInRange(double price) {
		List<WebElement> salePriceElements = WebUI.findWebElements(findTestObject("Object Repository/SearchResultPage/span_listPrices"),GlobalVariable.elementVisibilityTimeOut)
		double [] priceRange = new double[salePriceElements.size()];
		boolean inRange=false;
		for(int i=0 ;i<salePriceElements.size();i++) {
			priceRange[i] = Double.parseDouble(salePriceElements[i].getText().substring(1));
		}
		if(priceRange[0]<= price | salePriceElements[1]>=price) {
			inRange =true;
		}
		assert IntRange;
	}
}
