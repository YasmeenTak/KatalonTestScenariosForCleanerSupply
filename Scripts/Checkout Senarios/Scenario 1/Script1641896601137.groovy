import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import actions.HomePageActions
import actions.ProductDetailsPageActions
import actions.SearchResultsPageActions
import helpers.GeneralHelpers
import helpers.ProductDetailsPageHelpers
import helpers.SearchResultsPageHelpers
import internal.GlobalVariable
import validations.GeneralValidations
import validations.HomePageValidations
import validations.ProductDetailsPageValidations
import validations.SearchResultsPageValidations

import org.openqa.selenium.Keys as Keys

GeneralHelpers.initWebsite();

HomePageActions.typingSearchInput(GlobalVariable.searchWord);
//HomePageValidations.verifyPlaceholderDisappear();
//HomePageValidations.verifySuggestionDropdownSearchDisplay();
//HomePageValidations.verifySearchWordInCategoriesAndProducts(GlobalVariable.searchWord);
//HomePageValidations.verifySearchForContainsWord(GlobalVariable.searchWord);
//HomePageValidations.verifyLoadingResultTextForSearch();

HomePageActions.pressingEnter();
//GeneralValidations.verifyCurrentPageTitleValue("Search Results - Cleaner's Supply");
//GeneralValidations.verifyCurrentPageURL("search-results/?q=Plastic");
//SearchResultsPageValidations.verifyPageHeadingOfSearchResults("SEARCH RESULTS");
//SearchResultsPageValidations.verifyResultsForContainsWord(GlobalVariable.searchWord);
//SearchResultsPageValidations.verifyNumberOfPagesInSearchResults(SearchResultsPageHelpers.getNumberOfSearchResults());

SearchResultsPageActions.selectPackingProductsFilter();
//SearchResultsPageValidations.verifyLoadingPageVisible();
//GeneralValidations.verifyCurrentPageURL("Category=Packaging+Products");
//SearchResultsPageValidations.verifyPackingProductsOptionSelected();
//SearchResultsPageValidations.verifyNumberOfPagesInSearchResults(SearchResultsPageHelpers.getNumberOfSearchResults());
//SearchResultsPageValidations.verifyNumberOfPackingProducts();
//SearchResultsPageValidations.verifySelectedFilter("Packaging Products");

SearchResultsPageActions.selectPackingProductsFilter();

SearchResultsPageActions.selectPlasticBagsFilter();
//SearchResultsPageValidations.verifyLoadingPageVisible();
//GeneralValidations.verifyCurrentPageURL("Category=Plastic+Bags&q=Plastic");
//SearchResultsPageValidations.verifyPlasticBagsOptionSelected();
//SearchResultsPageValidations.verifyNumberOfPagesInSearchResults(SearchResultsPageHelpers.getNumberOfSearchResults());
//SearchResultsPageValidations.verifyNumberOfPlasticBags();
//SearchResultsPageValidations.verifySelectedFilter("Plastic Bags");

SearchResultsPageActions.selectPlasticBagsFilter();

SearchResultsPageActions.clickColorGroupCollapse();
SearchResultsPageActions.clickGreenColor();
//SearchResultsPageValidations.verifyLoadingPageVisible();
//GeneralValidations.verifyCurrentPageURL("Color+Group=Green");
//SearchResultsPageValidations.verifyGreenColorOptionSelected();
//SearchResultsPageValidations.verifyNumberOfPagesInSearchResults(SearchResultsPageHelpers.getNumberOfSearchResults());
//SearchResultsPageValidations.verifyNumberOfGreenColor();
//SearchResultsPageValidations.verifySelectedFilter("Green");

SearchResultsPageActions.selectPackingProductsFilter();

SearchResultsPageActions.selectPlasticBagsFilter();

SearchResultsPageActions.clickGreenPlasticPackingProduct();
//GeneralValidations.verifyCurrentPageURL("comforterblanket-bags-12pack");
//GeneralValidations.verifyCurrentPageTitleValue("Comforter/Blanket Bags - 12/Pack - Cleaner's Supply");
//ProductDetailsValidations.verifyContainsOneOfTags("Plastic Bags");
//ProductDetailsValidations.verifyProductNameContainsWord("BLANKET BAG");
//ProductDetailsValidations.verifyProductNameContainsWord("12/PACK");
//ProductDetailsValidations.verifyProductDescriptionContainsWord("comforter/blanket bags");
//SearchResultsPageValidations.VerifyPriceInRange(ProductDetailsHelpers.getPrice());
//SearchResultsPageValidations.VerifySalePriceInRange(ProductDetailsHelpers.getSalePrice());
//ProductDetailsPageValidations.verifyNumberOfColorsAvailable(SearchResultsPageHelpers.getAvailableColorNumber());
//ProductDetailsPageValidations.verifyColorAvaliable("Green");

ProductDetailsPageActions.selectXlargeSize();
//GeneralValidations.verifyCurrentPageURL(ProductDetailsPageHelpers.getProductSku());
//SearchResultsPageValidations.VerifyPriceInRange(ProductDetailsPageHelpers.getPrice());
//SearchResultsPageValidations.VerifySalePriceInRange(ProductDetailsPageHelpers.getSalePrice());
//ProductDetailsPageValidations.verifyXlargeSizeSelected()
//ProductDetailsPageValidations.verifyProductNameContainsWord("X-LARGE");
//ProductDetailsPageValidations.verifyProductDescriptionContainsWord("26\" X 29\" X 10\"");
//ProductDetailsPageValidations.verifyProductSize("26\" X 29\" X 10\"")

ProductDetailsPageActions.clickGreenColor();
//GeneralValidations.verifyCurrentPageURL(ProductDetailsPageHelpers.getProductSku());
//ProductDetailsPageValidations.verifyProductNameContainsWord("GREEN");
//ProductDetailsPageValidations.verifySelectedColorText("GREEN")
//ProductDetailsPageValidations.verifyProductInStock();

ProductDetailsPageActions.enterProductQuantity("5");
ProductDetailsPageValidations.verifyProductQuantity("5");
ProductDetailsPageActions.clickAddToButton();
ProductDetailsPageValidations.verifyVolumePrice();
ProductDetailsPageValidations.verifyPriceCalculatedCorrectly(14.52, 5)
ProductDetailsPageValidations.verifyProductItemNoInCart("1")


//WebUI.closeBrowser()
