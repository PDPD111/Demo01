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

WebUI.openBrowser('https://testpages.herokuapp.com/styled/alerts/alert-test.html')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Alert Pop Up/Prompt box'), 2)

WebUI.click(findTestObject('Alert Pop Up/Prompt box'))

WebUI.waitForAlert(2)

isAlertPresent = WebUI.verifyAlertPresent(2)

if (isAlertPresent == true) {
    alertMessage = WebUI.getAlertText()

    if (isAlertPresent == true) {
        WebUI.setAlertText('OKOK')

        WebUI.acceptAlert()

        WebUI.delay(2)

        WebUI.verifyAlertNotPresent(2)
    }
}

WebUI.click(findTestObject('Alert Pop Up/Prompt box'))

WebUI.setAlertText('Thank you')

WebUI.dismissAlert()

WebUI.closeBrowser()

