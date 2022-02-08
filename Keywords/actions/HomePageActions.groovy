package actions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.Keys

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

public class HomePageActions {
	public static void typingSearchInput(String searchText) {
		TestObject searchInput = findTestObject("Object Repository/HomePage/input_searchField");
		WebUI.setText(searchInput, searchText);
	}
	public static void pressingEnter() {
		TestObject searchInput = findTestObject("Object Repository/HomePage/input_searchField");
		WebUI.sendKeys(searchInput, Keys.chord(Keys.ENTER));
	}

	/***
	 * Hover over 'Tags & Forms' header nav items
	 * @author Yasmeen
	 */
	public static void hoveringOverTagsFormsNav() {
		TestObject TagsAndFormsNav = findTestObject("Object Repository/HomePage/a-TagsAndFormsNav");
		WebUI.mouseOver(TagsAndFormsNav);
	}
	/***
	 * Clicking on 'Computers & Registers' category
	 * @author Yasmeen
	 */
	public static void  clickingOnComputersAndRegisters() {
		TestObject ComputersAndRegistersCategory = findTestObject("Object Repository/HomePage/a_ComputersAndRegisters");
		WebUI.click(ComputersAndRegistersCategory);
	}

	/***
	 * Hover over quick order menu item
	 * @author Norhan salman
	 */
	public static void hoverOverQuickOrderMenuItem() {
		TestObject quickOrderMenuItem = findTestObject("Object Repository/HomePage/a_quickOrder")
		WebUI.mouseOver(quickOrderMenuItem)
	}

	/***
	 * Clicking on quick order menu item
	 * @author Norhan salman
	 */
	public static void clickingOnQuickOrderMenuItem() {
		TestObject quickOrderMenuItem = findTestObject("Object Repository/HomePage/a_quickOrder")
		WebUI.click(quickOrderMenuItem)
	}
}
