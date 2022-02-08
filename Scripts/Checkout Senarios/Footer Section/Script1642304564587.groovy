import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import actions.FooterActions
import helpers.GeneralHelpers
import validations.FooterValidations
import validations.GeneralValidations

GeneralHelpers.initWebsite()

FooterActions.clickingOnMyAccountLink()

FooterActions.fillingMailInput()
FooterActions.clickingOnSIGNUPBtn()
//FooterValidations.verifySuccessMessageAppears()

GeneralValidations.verifyCurrentPageURL("my-account")
GeneralValidations.verifyCurrentPageTitleValue("Log In - Cleaner's Supply")
FooterValidations.verifyHoveringOnManageMyAccountLink()

FooterActions.clickingOnTrackMyOrderLink()
GeneralValidations.verifyCurrentPageURL("track-order-guest")
GeneralValidations.verifyCurrentPageTitleValue("Track Order Guest - Cleaner's Supply")

FooterActions.clickingOnOurStoryLink()
GeneralValidations.verifyCurrentPageURL("our-story")
GeneralValidations.verifyCurrentPageTitleValue("Our Story - Cleaner's Supply")

FooterActions.clickingOnFastFreeShippingLink()
GeneralValidations.verifyCurrentPageURL("fast-free-shipping")
GeneralValidations.verifyCurrentPageTitleValue("Fast, Free Shipping - Cleaner's Supply")

FooterActions.clickingOnCustomerServiceLink()
GeneralValidations.verifyCurrentPageURL("customer-service")
GeneralValidations.verifyCurrentPageTitleValue("Customer Service - Cleaner's Supply")

FooterActions.clickingOnNewsroomLink()
GeneralValidations.verifyCurrentPageURL("newsroom")
GeneralValidations.verifyCurrentPageTitleValue("Newsroom - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("NEWSROOM")

FooterActions.clickingOnTagsFormsLink()
GeneralValidations.verifyCurrentPageURL("Tags-Forms")
GeneralValidations.verifyCurrentPageTitleValue("Dry Cleaning Tags, Forms & Invoices - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("DRY CLEANING TAGS, FORMS & INVOICES")

FooterActions.clickingOnCounterCheckInLink()
GeneralValidations.verifyCurrentPageURL("Counter-Check-In")
GeneralValidations.verifyCurrentPageTitleValue("Store Counter & Check-In Supplies - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("STORE COUNTER & CHECK-IN SUPPLIES")


FooterActions.clickingOnBagsLink()
GeneralValidations.verifyCurrentPageURL("Bags")
GeneralValidations.verifyCurrentPageTitleValue("Dry Cleaning Bags - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("DRY CLEANING BAGS")


FooterActions.clickingOnPressingSpottingLink()
GeneralValidations.verifyCurrentPageURL("Pressing-Spotting")
GeneralValidations.verifyCurrentPageTitleValue("Pressing, Spotting Tools & Supplies - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("PRESSING, SPOTTING TOOLS & SUPPLIES")


FooterActions.clickingOnRacksLink()
GeneralValidations.verifyCurrentPageURL("Racks")
GeneralValidations.verifyCurrentPageTitleValue("Racks & Rack Accessories - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("RACKS & RACK ACCESSORIES")

FooterActions.clickingOnTailoringLink()
GeneralValidations.verifyCurrentPageURL("Tailoring")
GeneralValidations.verifyCurrentPageTitleValue("Tailoring Supplies - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("TAILORING SUPPLIES")


FooterActions.clickingOnLaundromatLink()
GeneralValidations.verifyCurrentPageURL("Laundromat")
GeneralValidations.verifyCurrentPageTitleValue("Laundromat Supplies - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("LAUNDROMAT SUPPLIES")


FooterActions.clickingOnFavoritesLink()
GeneralValidations.verifyCurrentPageURL("favorites")
GeneralValidations.verifyCurrentPageTitleValue("Log In - Cleaner's Supply")

FooterActions.clickingOnRequestCatalogLink()
GeneralValidations.verifyCurrentPageURL("request-a-catalog")
GeneralValidations.verifyCurrentPageTitleValue("Request A Catalog – Free Monthly Printed Catalog - Cleaner's Supply")
GeneralValidations.verifyCurrentPageHeading("LET’S GET STARTED")

FooterActions.clickingOnRequestCatalogLink()
GeneralValidations.verifyCurrentPageURL("equest-a-catalog")
GeneralValidations.verifyCurrentPageTitleValue("Request A Catalog – Free Monthly Printed Catalog - Cleaner's Supply")
//GeneralValidations.verifyCurrentPageHeading("CLASSIFIEDS")


FooterActions.clickingOnChooseRegionButton();
FooterValidations.verifyCanadaRegioIsSelected()
GeneralValidations.verifyCurrentPageURL("ca")
FooterValidations.verifyTextAdsContainCANADIAN("CANADIAN")

FooterActions.clickingOnleaveFeedback()
FooterValidations.VerifyFeedbackModalAppear()

//============ Social Media Links ===========
FooterActions.clickingOnFacebookLink()
//GeneralValidations.verifyCurrentPageURL("https://www.facebook.com/cleanersupply")
FooterActions.switchingToMainWindow()

FooterActions.clickingOnYoutubeLink()
//GeneralValidations.verifyCurrentPageURL("https://www.youtube.com/channel/UCuRpXEVYnsiiHTHkOAWZsww")
FooterActions.switchingToMainWindow()

FooterActions.clickingOnInstagramLink()
//GeneralValidations.verifyCurrentPageURL("https://www.instagram.com/accounts/login/")
FooterActions.switchingToMainWindow()

FooterActions.clickingOnLinkedinLink()
//GeneralValidations.verifyCurrentPageURL("https://www.linkedin.com/company/cleaners-supply-inc/")
FooterActions.switchingToMainWindow()





