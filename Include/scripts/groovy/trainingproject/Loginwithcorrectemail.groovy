package trainingproject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Loginwithcorrectemail {
	/**
	 * The step definitions for testing login with correct email password
	 */
	@Given("I navigate to login page")
	def I_navigate_to_login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.automationexercise.com/')
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/SignupLogin_Link'))
	}

	@When('I login with email address "(.*)" and password "(.*)"')
	def I_login_with_email_address_and_password (String emailaddress, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/Login_Email'), emailaddress)
		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/Login_Password'),password)
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/Login_Button'))
	}

	@Then("I should arrive at products UI  search for TSHIRT add them to cart then delete the one and proceed to payment and invoice should be downloaded")
	def I_should_arrive_at_my_account_page() {
		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Products'))

		WebUI.delay(2)

		// Obtain the current WebDriver instance
		def driver = DriverFactory.getWebDriver()

		// Create an Actions object
		Actions actions = new Actions(driver)

		// Move the mouse to the specified location
		actions.moveByOffset(100, 100).click().build().perform()

		WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - All Products/input_Navneet Kaur_search'), 'tshirts')

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/button_Navneet Kaur_submit_search'))

		WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - All Products/h2_Searched Products'))

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

		WebUI.delay(1)

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

		WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

		WebUI.mouseOver(findTestObject('Page_Automation Exercise - All Products/AddToCart'))

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_Add to cart'))

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/button_Continue Shopping'))

		WebUI.mouseOver(findTestObject('Page_Automation Exercise - All Products/AddToCart2'))

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/a_Add to cart (1)'))

		WebUI.click(findTestObject('Page_Automation Exercise - All Products/u_View Cart'))

		WebUI.click(findTestObject('Page_Automation Exercise - Checkout/i_Pure Cotton V-Neck T-Shirt_fa fa-times'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

		WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Checkout/a_Place Order'))

		WebUI.sendKeys(findTestObject('Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 'Navneet')

		WebUI.sendKeys(findTestObject('Page_Automation Exercise - Payment/input_Card Number_card_number'), '98989898')

		WebUI.sendKeys(findTestObject('Page_Automation Exercise - Payment/input_CVC_cvc'), '657')

		WebUI.sendKeys(findTestObject('Page_Automation Exercise - Payment/input_Expiration_expiry_month'), '67')

		WebUI.sendKeys(findTestObject('Page_Automation Exercise - Payment/input_Expiration_expiry_year'), '1992')

		WebUI.click(findTestObject('Page_Automation Exercise - Payment/button_Pay and Confirm Order'))

		WebUI.verifyElementText(findTestObject('Page_Automation Exercise - Order Placed/p_Congratulations Your order has been confirmed'),
				'Congratulations! Your order has been confirmed!')

		WebUI.click(findTestObject('Page_Automation Exercise - Order Placed/a_Download Invoice'))

	}
}