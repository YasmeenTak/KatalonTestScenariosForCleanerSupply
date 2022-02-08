package actions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class ComputerRegisterPageActions {
	/***
	 * Clicking on Manufacturer Dropdown List 
	 * @author Yasmeen
	 */
	public static void  clickingOnManufacturerDropdownList() {
		TestObject manufacturerDropdownList = findTestObject("ComputerAndRegisterPage/button_ManufacturerList");
		WebUI.click(manufacturerDropdownList);
	}
	/***
	 * Select the 'Casio' manufacturer 
	 * @author Yasmeen
	 */
	public static void  selectingCasioManufacturer() {
		TestObject casioManufacturerOption = findTestObject("ComputerAndRegisterPage/a-CasioOption");
		WebUI.click(casioManufacturerOption);
	}
	/***
	 * Clicking on Model Dropdown List 
	 * @author Yasmeen
	 */
	public static void  clickingOnModelDropdownList() {
		TestObject modelDropdownList = findTestObject("Object Repository/ComputerAndRegisterPage/button_ModelList");
		WebUI.click(modelDropdownList);
	}

	/***
	 * Selecting 'SP1000' Model
	 * @author Yasmeen
	 */
	public static void selectModel() {
		TestObject selectModelOption = findTestObject("Object Repository/ComputerAndRegisterPage/a_ModelOption");
		WebUI.click(selectModelOption);
	}
	/***
	 * Clicking on resulted product
	 * @author Yasmeen
	 */
	public static void clickingOnProduct() {
		TestObject productElement = findTestObject("Object Repository/ComputerAndRegisterPage/a_Product");
		WebUI.click(productElement);
	}
}
