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

WebUI.openBrowser('https://stqatools.com/demo/Register.php')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('REGE/submit'), 3)

WebUI.delay(3)

WebUI.check(findTestObject('REGE/Reading'))

isReadingchecked = WebUI.verifyElementChecked(findTestObject('REGE/Reading'), 0)

if(isReadingchecked==true) {
	WebUI.check(findTestObject('REGE/Travelling'))
}

isTravellingchecked = WebUI.verifyElementChecked(findTestObject('REGE/Travelling'), 0)
if(isTravellingchecked==true) {
	WebUI.check(findTestObject('REGE/Music'))
}

isMusicChecked = WebUI.verifyElementChecked(findTestObject('REGE/Music'), 0)
if(isMusicChecked==true) {
	WebUI.uncheck(findTestObject('REGE/Reading'))
}

isRUnchecked = WebUI.verifyElementNotChecked(findTestObject('REGE/Reading'), 0)
if(isRUnchecked==true) {
	WebUI.uncheck(findTestObject('REGE/Travelling'))
}

IsTunchecked = WebUI.verifyElementNotChecked(findTestObject('REGE/Travelling'), 0)
if(IsTunchecked==true) {
	WebUI.uncheck(findTestObject('REGE/Music'))
}

isMunchecked = WebUI.verifyElementNotChecked(findTestObject('REGE/Music'), 0)


if(isMunchecked==true) {
WebUI.closeBrowser()

}