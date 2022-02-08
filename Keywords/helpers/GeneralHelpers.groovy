package helpers

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import actions.Navigations
import internal.GlobalVariable
import validations.GeneralValidations

public class GeneralHelpers {
	/***
	 * initialise the website
	 * @author wesam hamad
	 */
	public static void initWebsite() {
		WebUI.openBrowser('');
		WebUI.maximizeWindow()

		Navigations.navigateToHomePage()
		WebUI.waitForPageLoad(GlobalVariable.pageLoadTimeOut)

		GeneralValidations.verifyCurrentPageTitleIsNotEmpty()
		GeneralValidations.verifyCurrentPageURL(GlobalVariable.baseUrl)
	}
}
