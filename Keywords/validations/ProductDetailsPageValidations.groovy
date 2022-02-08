package validations

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ProductDetailsPageValidations {

	public static void verifyContainsOneOfTags(String tag) {
		List<WebElement> tagsWebElements = WebUI.findWebElements(findTestObject("Object Repository/ProductDetailsPage/span_itemProperties"),GlobalVariable.elementVisibilityTimeOut);
		boolean tagExist =false;
		for(WebElement tagWebElement:tagsWebElements) {
			println(tagWebElement.getText().trim());
			if(tagWebElement.getText().trim().equals(tag)) {
				tagExist=true;
				assert tagExist;
			}
		}
		assert tagExist;
	}
	public static void verifyNumberOfColorsAvailable(int colorNumbers) {
		List<WebElement> colorAvailableNumberElements = WebUI.findWebElements(findTestObject("Object Repository/ProductDetailsPage/span_itemProperties"),GlobalVariable.elementVisibilityTimeOut);

		assert colorAvailableNumberElements.size() == colorNumbers;
	}
	public static void verifyColorAvaliable(String color) {
		boolean isColorAvailable =false;
		List<WebElement> colorAvailableNumberElements = WebUI.findWebElements(findTestObject("Object Repository/ProductDetailsPage/span_itemProperties")
				,GlobalVariable.elementVisibilityTimeOut);

		for(WebElement colorAvailable:colorAvailableNumberElements) {
			if(colorAvailable.getAttribute("title").trim().equals(color)) {
				isColorAvailable=true;
				assert isColorAvailable;
			}
		}
		assert isColorAvailable;
	}
	public static void verifyProductNameContainsWord(String word) {
		TestObject productNameTestObject = findTestObject("Object Repository/ProductDetailsPage/h1_productName");
		String productName = WebUI.getText(productNameTestObject);
		assert productName.contains(word);
	}
	public static void verifyProductDescriptionContainsWord(String word) {
		TestObject productDescriptionTestObject = findTestObject("Object Repository/ProductDetailsPage/span_productDescription");
		String productDescription = WebUI.getText(productDescriptionTestObject);
		assert productDescription.contains(word);
	}
	public static void verifyProductDescriptionMoreContainWord(String word) {
		TestObject productDescriptionTestObject = findTestObject("Object Repository/ProductDetailsPage/p_descriptionMore");
		String productDescription = WebUI.getText(productDescriptionTestObject);
		assert productDescription.contains(word);
	}
	public static void verifyProductUnits(String word) {
		TestObject productUnitsTestObject = findTestObject("Object Repository/ProductDetailsPage/span_productUnits");
		String productUnits= WebUI.getText(productUnitsTestObject);
		assert productUnits.contains(word);
	}
	public static void verifyXlargeSizeSelected() {
		TestObject xlargeTestObject = findTestObject("Object Repository/ProductDetailsPage/a_extraLargeButton");
		String classes = WebUI.getAttribute(xlargeTestObject, "class");
		assert classes.contains("selected");
	}
	public static void verifyProductSize(String size) {

		assert WebUI.getText(findTestObject("Object Repository/ProductDetailsPage/span_productSize")).contains(size);
	}
	public static void verifySelectedColorText(String color) {
		String selectedColorText = WebUI.getText(findTestObject("Object Repository/ProductDetailsPage/span_selectedColorText"));
		assert selectedColorText.equals(color);
	}
	public static void verifyProductInStock() {
		String productInStock = WebUI.getText(findTestObject("Object Repository/ProductDetailsPage/div_inStock"));
		assert productInStock.contains("In Stock!");
	}
	public static void verifyProductQuantity(String quantity) {
		String productQuantity = WebUI.getAttribute(findTestObject("Object Repository/ProductDetailsPage/input_quantity"),"value")
		assert productQuantity.equals(quantity);
	}
	public static void verifyVolumePrice() {
		WebDriver driver = DriverFactory.getWebDriver();
		WebElement volumePriceTable = driver.findElement(By.cssSelector("table.volume-table"));
		List<WebElement> rows = volumePriceTable.findElements(By.tagName("tr"));
		double basePrice = Double.parseDouble(((rows.get(1).findElements(By.cssSelector("td span")).get(1).getText()).trim().substring(1)));
	}
	public static void verifyPriceCalculatedCorrectly(double price,double quantity) {
		double calculatedPrice = Double.parseDouble(WebUI.getText(findTestObject("Object Repository/ProductDetailsPage/span_cartLabel")).substring(1));
		assert calculatedPrice == price * quantity;
	}
	public static void verifyProductItemNoInCart(String number) {
		assert WebUI.getText(findTestObject("Object Repository/ProductDetailsPage/span_itemNo")).equals(number)
	}
}
