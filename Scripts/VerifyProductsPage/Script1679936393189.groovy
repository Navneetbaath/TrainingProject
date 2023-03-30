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
import internal.GlobalVariable as GlobalVariable



import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Proxy as Proxy
import org.openqa.selenium.Proxy.ProxyType as ProxyType
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions

import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions






ChromeOptions options = new ChromeOptions()

Proxy proxy = new Proxy()

proxy.setProxyType(ProxyType.MANUAL)

proxy.setHttpProxy('http://pagead2.googlesyndication.com/:80')

proxy.setSslProxy('http://googleleadservice.com/:443')

RunConfiguration.setWebDriverPreferencesProperty('chromeOptions', options)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.automationexercise.com/')

WebUI.click(findTestObject('Page_Automation Exercise/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/Login_Email'), 'Navneetbaath66@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/Login_Password'), 'IdCYbfuagzH88CVv22H0tA==')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/Login_Button'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - All Products/Products_Link'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - All Products/h2_All Products'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.delay(2)

// Obtain the current WebDriver instance
def driver = DriverFactory.getWebDriver()

// Create an Actions object
Actions actions = new Actions(driver)

// Move the mouse to the specified location
actions.moveByOffset(100, 100).click().build().perform()

