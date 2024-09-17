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

WebUI.openBrowser('https://www.amazon.in/')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles')

WebUI.waitForPageLoad(8)

WebUI.navigateToMaskedUrl('https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers')

WebUI.waitForJQueryLoad(8)

WebUI.navigateToUrl('https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help')

WebUI.waitForAngularLoad(8)

WebUI.navigateToMaskedUrl('https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics')

WebUI.waitForPageLoad(8)

WebUI.back()

WebUI.waitForPageLoad(8)

WebUI.forward()

WebUI.waitForPageLoad(8)

WebUI.closeBrowser()

