import actions.CheckoutInterstitialPageActions as CheckoutInterstitialPageActions
import actions.CheckoutPageActions as CheckoutPageActions
import actions.ComputerRegisterPageActions as ComputerRegisterPageActions
import actions.HomePageActions as HomePageActions
import actions.ProductDetailsPageActions as ProductDetailsPageActions
import actions.ShoppingCartPageActions as ShoppingCartPageActions
import helpers.GeneralHelpers as GeneralHelpers
import internal.GlobalVariable
import validations.ComputerAndRegisterPageValidations
import validations.GeneralValidations as GeneralValidations
import validations.HomePageValidations
import validations.ProductDetailsPageValidations
import validations.ProductDetailsValidations
import validations.SearchResultsPageValidations 

GeneralHelpers.initWebsite()

HomePageActions.hoveringOverTagsFormsNav()
HomePageValidations.verifyHoveringOverTagsAndForms()
HomePageValidations.verifyDropdownTagsAndFormsMenuDisplayed()
HomePageValidations.verifyHoveringOverComputersRegistersDesign()

HomePageValidations.verifyHoveringOverComputersRegistersDesign()
HomePageActions.clickingOnComputersAndRegisters()
GeneralValidations.verifyCurrentPageTitleValue('Computer & Register - Cleaner\'s Supply')
GeneralValidations.verifyCurrentPageURL('Tags-Forms/Computer-Register')
//GeneralValidations.verifyCurrentPageHeading("COMPUTER & REGISTER TAGS & FORMS")
ProductDetailsValidations.verifyContainsOneOfTags("Computer & Register")


ComputerAndRegisterPageValidations.verifySelectTagHaveManufacturerTitle();
ComputerRegisterPageActions.clickingOnManufacturerDropdownList()
ComputerAndRegisterPageValidations.verifyDropdownMenuOptionHaveCasio();


ComputerRegisterPageActions.selectingCasioManufacturer()
ComputerAndRegisterPageValidations.verifyCasioIsSelected()
GeneralValidations.verifyCurrentPageURL('Manufacturer=Casio')
SearchResultsPageValidations.verifySelectedFilter("Casio")
ComputerAndRegisterPageValidations.VerifyModelIsEnable()

ComputerRegisterPageActions.clickingOnModelDropdownList()
ComputerRegisterPageActions.selectModel()
ComputerAndRegisterPageValidations.VerifySP100ModelIsSelected()
GeneralValidations.verifyCurrentPageURL('SP1000')
SearchResultsPageValidations.verifySelectedFilter("SP1000")

ComputerAndRegisterPageValidations.verifyHoveringOverResultedProduct()
ComputerRegisterPageActions.clickingOnProduct()
//ProductDetailsValidations.verifyContainsOneOfTags("Ink Ribbons")
GeneralValidations.verifyCurrentPageTitleValue("Epson Printer Indelibond Ink Ribbons #TM290, ERC27 - 6/Box - Cleaner's Supply")
GeneralValidations.verifyCurrentPageURL('Ink-Ribbons/epson-printer')
ProductDetailsPageValidations.verifyProductNameContainsWord("EPSON PRINTER INDELIBOND INK RIBBONS #TM290, ERC27 - 6/BOX")
ProductDetailsPageValidations.verifyProductDescriptionContainsWord("Epson printers")
ProductDetailsPageValidations.verifyProductDescriptionMoreContainWord("Epson printers")
ProductDetailsPageValidations.verifyProductUnits("6/Box")
ProductDetailsPageValidations.verifyProductInStock()


ProductDetailsPageActions.changeProductQuantities("10")
ProductDetailsPageValidations.verifyProductQuantity("10")

ProductDetailsPageActions.clickingOnAddToCartButton()
ProductDetailsPageValidations.verifyVolumePrice();
//ProductDetailsPageValidations.verifyPriceCalculatedCorrectly(20.94, 10)
ProductDetailsPageValidations.verifyProductItemNoInCart("1")

ProductDetailsPageActions.clickingOnCartIcon()
GeneralValidations.verifyCurrentPageTitleValue("Shopping Cart - Cleaner's Supply")
GeneralValidations.verifyCurrentPageURL('shopping-cart')
GeneralValidations.verifyCurrentPageHeading("SHOPPING CART CONTINUE SHOPPING")


ShoppingCartPageActions.clickingOnProceedToCheckout()
GeneralValidations.verifyCurrentPageTitleValue("Checkout Interstitial - Cleaner's Supply")
GeneralValidations.verifyCurrentPageURL('checkout-interstitial')

CheckoutInterstitialPageActions.clickingOnContinue()
GeneralValidations.verifyCurrentPageTitleValue("Checkout - Cleaner's Supply")
GeneralValidations.verifyCurrentPageURL('checkout')
GeneralValidations.verifyCurrentPageHeading("CHECKOUT")

CheckoutPageActions.fillingShippingAddressSectionData(GlobalVariable.companyName, GlobalVariable.firstName, GlobalVariable.lastName, 
    GlobalVariable.addressLine, GlobalVariable.zipCode, GlobalVariable.city, GlobalVariable.phone, GlobalVariable.phoneExt, 
    GlobalVariable.email)

CheckoutPageActions.fillingPaymentMethodSectionData(GlobalVariable.nameOnCard, GlobalVariable.creditCardNumber, GlobalVariable.securityCode)

CheckoutPageActions.clickingOnReviewOrderBtn()

//WebUI.closeBrowser()
