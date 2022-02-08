package validations

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
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

public class HeaderValidations {

	/***
	 * verify Clicking On Tags And Forms
	 * @author Norhan salman
	 */
	public static void verifyClickingOnTagsAndForms() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.contains("/Tags-Forms/")
		assert actualTitle.contains("Dry Cleaning Tags, Forms & Invoices - Cleaner's Supply")
		assert actualHeader.toLowerCase().contains("Dry Cleaning Tags, Forms & Invoices".toLowerCase())
		WebUI.back();
	}

	/***
	 * verify Clicking On Counter And CheckIn
	 * @author Norhan salman
	 */
	public static void verifyClickingOnCounterAndCheckIn() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.contains("/Counter-Check-In/")
		assert actualTitle.contains("Store Counter & Check-In Supplies - Cleaner's Supply")
		assert actualHeader.toLowerCase().contains("Store Counter & Check-In Supplies".toLowerCase())
		WebUI.back();
	}

	/***
	 * verify Clicking On Bags
	 * @author Norhan salman
	 */
	public static void verifyClickingOnBags() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.contains("/Bags/")
		assert actualTitle.contains("Dry Cleaning Bags - Cleaner's Supply")
		assert actualHeader.toLowerCase().contains("Dry Cleaning Bags".toLowerCase())
		WebUI.back();
	}


	/***
	 * verify Clicking On Pressing And Spotting
	 * @author Norhan salman
	 */
	public static void verifyClickingOnPressingAndSpotting() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.contains("/Pressing-Spotting/")
		assert actualTitle.contains("Pressing, Spotting Tools & Supplies - Cleaner's Supply")
		assert actualHeader.toLowerCase().contains("Pressing, Spotting Tools & Supplies".toLowerCase())
		WebUI.back();
	}

	/***
	 *verify Clicking On Packaging
	 * @author Norhan salman
	 */
	public static void verifyClickingOnPackaging() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.contains("/Packaging/")
		assert actualTitle.contains("Packaging Supplies - Cleaner's Supply")
		assert actualHeader.toLowerCase().contains("Packaging Supplies".toLowerCase())
		WebUI.back();
	}


	/***
	 *verify Clicking On Racks
	 * @author Norhan salman
	 */
	public static void verifyClickingOnRacks() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.contains("Racks/")
		assert actualTitle.contains("Racks & Rack Accessories - Cleaner's Supply")
		assert actualHeader.toLowerCase().contains("Racks & Rack Accessories".toLowerCase())
		WebUI.back();
	}

	/***
	 *verify Clicking On Tailoring
	 * @author Norhan salman
	 */
	public static void verifyClickingOnTailoring() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.contains("/Tailoring/")
		assert actualTitle.contains("Tailoring Supplies - Cleaner's Supply")
		assert actualHeader.toLowerCase().contains("Tailoring Supplies".toLowerCase())
		WebUI.back();
	}


	/***
	 *verify Clicking On Laundromat
	 * @author Norhan salman
	 */
	public static void verifyClickingOnLaundromat() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.contains("/Laundromat/")
		assert actualTitle.toLowerCase().contains("Laundromat Supplies - Cleaner's Supply".toLowerCase())
		assert actualHeader.toLowerCase().contains("Laundromat Supplies".toLowerCase())
		WebUI.back();
	}

	/***
	 *verify Clicking On QuickOrder
	 * @author Norhan salman
	 */
	public static void verifyClickingOnQuickOrder() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()

		assert actualURL.toLowerCase().contains("/quick-order/".toLowerCase())
		assert actualTitle.toLowerCase().contains("Quick Order - Cleaner's Supply".toLowerCase())
		WebUI.back();
	}

	/***
	 *verify Clicking On Reorder
	 * @author Norhan salman
	 */
	public static void verifyClickingOnReorder() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()

		assert actualURL.contains("/log-in/?ReturnUrl=%2fpreviously-ordered%2f")
		assert actualTitle.toLowerCase().contains("Log In - Cleaner's Supply".toLowerCase())
		WebUI.back();
	}

	/***
	 *verify Clicking On Cart
	 * @author Norhan salman
	 */
	public static void verifyClickingOnCart() {
		String actualURL = WebUI.getUrl();
		String actualTitle = WebUI.getWindowTitle()
		TestObject headerElm = findTestObject("Object Repository/Header/h1_pageHeading")
		String actualHeader = WebUI.getText(headerElm)

		assert actualURL.toLowerCase().contains("/shopping-cart/".toLowerCase())
		assert actualTitle.toLowerCase().contains("Shopping Cart - Cleaner's Supply".toLowerCase())
		assert actualHeader.toLowerCase().toLowerCase().contains("Shopping Cart".toLowerCase())
		WebUI.back();
	}


	/***
	 *verify hovering On TagsAndForms
	 * @author Norhan salman
	 */
	public static void verifyHoveringOnTagsAndForms() {
		TestObject TagsAndFormsMenu = findTestObject("Object Repository/Header/div_tagsAndFormsMenu")
		boolean isVisible =  WebUI.verifyElementVisible(TagsAndFormsMenu)

		String actualColor = WebUI.getCSSValue(TagsAndFormsMenu, "color")
		String actualBackgroundColor = WebUI.getCSSValue(TagsAndFormsMenu, "background")

		assert isVisible == true
		assert actualColor.equals("rgba(82, 36, 127, 1)")
		assert actualBackgroundColor.contains("rgb(255, 255, 255)")
	}


	/***
	 *verify hovering On CounterAndCheckIn
	 * @author Norhan salman
	 */
	public static void verifyHoveringOnCounterAndCheckIn() {
		TestObject counterAndCheckInMenu = findTestObject("Object Repository/Header/div_counterCheckInMenu")
		boolean isVisible =  WebUI.verifyElementVisible(counterAndCheckInMenu)

		TestObject counterCheckIn = findTestObject("Object Repository/Header/a_counterAndCheckInMenuItem")
		String actualColor = WebUI.getCSSValue(counterCheckIn, "color")
		String actualBackgroundColor = WebUI.getCSSValue(counterCheckIn, "background")

		assert isVisible == true
		assert actualColor.equals("rgba(82, 36, 127, 1)")
		assert actualBackgroundColor.contains("rgb(255, 255, 255)")
	}

	/***
	 *verify hovering On Bags
	 * @author Norhan salman
	 */
	public static void verifyHoveringOnBags() {
		TestObject bagsMenu = findTestObject("Object Repository/Header/div_bagsMenu")
		boolean isVisible =  WebUI.verifyElementVisible(bagsMenu)

		TestObject bags = findTestObject("Object Repository/Header/a_bags")
		String actualColor = WebUI.getCSSValue(bags, "color")
		String actualBackgroundColor = WebUI.getCSSValue(bags, "background")

		assert isVisible == true
		assert actualColor.equals("rgba(82, 36, 127, 1)")
		assert actualBackgroundColor.contains("rgb(255, 255, 255)")
	}

	/***
	 *verify hovering On PressingAndSpotting
	 * @author Norhan salman
	 */
	public static void verifyHoveringOnPressingAndSpotting() {
		TestObject pressingAndSpotingMenu = findTestObject("Object Repository/Header/div_pressingAndSpottingMenu")
		boolean isVisible =  WebUI.verifyElementVisible(pressingAndSpotingMenu)

		TestObject pressingAndSpoting = findTestObject("Object Repository/Header/a_pressingAndSpottingMenuItem")
		String actualColor = WebUI.getCSSValue(pressingAndSpoting, "color")
		String actualBackgroundColor = WebUI.getCSSValue(pressingAndSpoting, "background")

		assert isVisible == true
		assert actualColor.equals("rgba(82, 36, 127, 1)")
		assert actualBackgroundColor.contains("rgb(255, 255, 255)")
	}


	/***
	 *verify hovering On packaging
	 * @author Norhan salman
	 */
	public static void verifyHoveringOnPackaging() {
		TestObject packagingMenu = findTestObject("Object Repository/Header/div_packagingMenu")
		boolean isVisible =  WebUI.verifyElementVisible(packagingMenu)

		TestObject packaging = findTestObject("Object Repository/Header/a_packaging")
		String actualColor = WebUI.getCSSValue(packaging, "color")
		String actualBackgroundColor = WebUI.getCSSValue(packaging, "background")

		assert isVisible == true
		assert actualColor.equals("rgba(82, 36, 127, 1)")
		assert actualBackgroundColor.contains("rgb(255, 255, 255)")
	}


	/***
	 *verify hovering On racks
	 * @author Norhan salman
	 */
	public static void verifyHoveringOnRacks() {
		TestObject racksMenu = findTestObject("Object Repository/Header/div_racksMenu")
		boolean isVisible =  WebUI.verifyElementVisible(racksMenu)

		TestObject racks = findTestObject("Object Repository/Header/a_racks")
		String actualColor = WebUI.getCSSValue(racks, "color")
		String actualBackgroundColor = WebUI.getCSSValue(racks, "background")

		assert isVisible == true
		assert actualColor.equals("rgba(82, 36, 127, 1)")
		assert actualBackgroundColor.contains("rgb(255, 255, 255)")
	}

	/***
	 *verify hovering On Tailoring
	 * @author Norhan salman
	 */
	public static void verifyHoveringOnTailoring() {
		TestObject tailoringMenu = findTestObject("Object Repository/Header/div_tailoringMenu")
		boolean isVisible =  WebUI.verifyElementVisible(tailoringMenu)

		TestObject tailoring = findTestObject("Object Repository/Header/a_tailoring")
		String actualColor = WebUI.getCSSValue(tailoring, "color")
		String actualBackgroundColor = WebUI.getCSSValue(tailoring, "background")

		assert isVisible == true
		assert actualColor.equals("rgba(82, 36, 127, 1)")
		assert actualBackgroundColor.contains("rgb(255, 255, 255)")
	}


	/***
	 *verify hovering On Laundromat
	 * @author Norhan salman
	 */
	public static void verifyHoveringOnLaundromat() {
		TestObject laundromatMenu = findTestObject("Object Repository/Header/div_laundromatMenu")
		boolean isVisible =  WebUI.verifyElementVisible(laundromatMenu)

		TestObject laundromat = findTestObject("Object Repository/Header/a_laundromat")
		String actualColor = WebUI.getCSSValue(laundromat, "color")
		String actualBackgroundColor = WebUI.getCSSValue(laundromat, "background")

		assert isVisible == true
		assert actualColor.equals("rgba(82, 36, 127, 1)")
		assert actualBackgroundColor.contains("rgb(255, 255, 255)")
	}

	public static void verifyHoveringOnCart() {
		TestObject emptyCartHolder = findTestObject("Object Repository/Header/div_emptyCartHolder")
		boolean isVisible =  WebUI.verifyElementVisible(emptyCartHolder)

		WebElement emptyCartElm = WebUI.findWebElement(emptyCartHolder)
		WebElement emptyCartImage1 = emptyCartElm.findElement(By.cssSelector("img.cleaners"));
		WebElement emptyCartImage2 = emptyCartElm.findElement(By.cssSelector("img.wawak"));

		assert emptyCartImage1.getAttribute("src").contains("/Content/images/assets/empty-cart-img.jpg");
		assert emptyCartImage2.getAttribute("src").contains("/Content/images/assets/wawak-empty-cart-img2.jpg");

		TestObject cartIcon = findTestObject("Object Repository/Header/i_cartIcon")
		assert WebUI.getCSSValue(cartIcon, "color").equals("rgba(82, 36, 127, 1)")
	}

	public static void verifyHoveringOnQuickOrder() {
		TestObject quickOrderIcon = findTestObject("Object Repository/Header/i_quickOrderIcon")
		assert WebUI.getCSSValue(quickOrderIcon, "color").equals("rgba(82, 36, 127, 1)")
	}

	public static void verifyHoveringOnReorder() {
		TestObject reorderIcon = findTestObject("Object Repository/Header/i_reorderIcon")
		assert WebUI.getCSSValue(reorderIcon, "color").equals("rgba(82, 36, 127, 1)")
	}

	public static void verifyHoveringOnMyAccount() {
		TestObject myAccountIcon = findTestObject("Object Repository/Header/i_myAccountIcon")
		assert WebUI.getCSSValue(myAccountIcon, "color").equals("rgba(82, 36, 127, 1)")
	}

	public static void verifyHoveringOnDetailsLink() {
		TestObject details = findTestObject("Object Repository/Header/a_details")
		assert WebUI.getCSSValue(details, "text-decoration").contains("none solid rgb(0, 0, 0)")
	}

	public static verifyHoveringOnCustomerServiceLink() {
		TestObject customerService = findTestObject("Object Repository/Header/a_customerService")
		assert WebUI.getCSSValue(customerService, "text-decoration").contains("none solid rgb(0, 0, 0)")
	}

	public static verifyPageLogos() {
		TestObject logo1 = findTestObject("Object Repository/Header/img_logo1")
		TestObject logo2 = findTestObject("Object Repository/Header/img_logo2")

		assert WebUI.getAttribute(logo1, "src").contains("/49857c/globalassets/csius/homepage/logo.svg")
		assert WebUI.getAttribute(logo2, "src").contains("/499072/globalassets/csius/homepage/tagline.svg")
	}

	public static verifyInfoHolder() {
		TestObject infoHolder = findTestObject("Object Repository/Header/span_infoHolder")
		assert WebUI.getText(infoHolder).toLowerCase().contains('FREE SHIPPING & RETURNS ON ORDERS OVER $99'.toLowerCase())
	}

	public static verifyCustomerNo() {
		TestObject customerServiceNo = findTestObject("Object Repository/Header/span_customerServiceNo")
		assert WebUI.getText(customerServiceNo).toLowerCase().contains('1-800-388-5410'.toLowerCase())
	}

	public static verifySearchPlaceholder() {
		TestObject searchField = findTestObject("Object Repository/Header/input_search")
		assert WebUI.getAttribute(searchField, "placeholder").contains("Search by Stock # or Keyword")
	}
}