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

WebUI.setText(findTestObject('REGE/address'), 'Pune Hin')

WebUI.focus(findTestObject('REGE/address'))

WebUI.setText(findTestObject('REGE/Name'), 'TECH MAHINDRA BB')

WebUI.clearText(findTestObject('REGE/Name'))

WebUI.setText(findTestObject('REGE/Name'), 'MOZO')

WebUI.check(findTestObject('REGE/Male'))

WebUI.check(findTestObject('REGE/Female'))

WebUI.scrollToElement(findTestObject('REGE/submit'), 3)

WebUI.delay(3)

WebUI.check(findTestObject('REGE/Reading'))

WebUI.check(findTestObject('REGE/Travelling'))

WebUI.check(findTestObject('REGE/Reading'))

WebUI.uncheck(findTestObject('REGE/Reading'))

countryOptionsCount = WebUI.getNumberOfTotalOption(findTestObject('REGE/country'))

if (countryOptionsCount == 6) {
    println('6 country present in dropdown')

    WebUI.selectOptionByValue(findTestObject('REGE/country'), 'India', false)
} else {
    println('6 country not present in dropdown, tesst case failed')
}

cityOption = WebUI.verifyOptionsPresent(findTestObject('REGE/city'), ['Delhi', 'Mumbai'])

if (cityOption == true) {
    WebUI.selectOptionByValue(findTestObject('REGE/city'), 'Delhi', false)
} else {
    println('tesst case failed')
}

WebUI.setText(findTestObject('REGE/DOB'), '06/25/2003')

WebUI.delay(5)

WebUI.click(findTestObject('REGE/submit'))

WebUI.closeBrowser()

