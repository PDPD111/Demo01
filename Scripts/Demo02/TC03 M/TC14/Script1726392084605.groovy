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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('LOGIN/user name'), 'John Doe')

WebUI.setEncryptedText(findTestObject('LOGIN/Pass'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('LOGIN/login'))

WebUI.verifyTextPresent('Make Appointment', false)

WebUI.selectOptionByValue(findTestObject('LOGIN/Facility'), 'Hongkong CURA Healthcare Centre', false)

WebUI.check(findTestObject('LOGIN/Apply for check'))

WebUI.click(findTestObject('LOGIN/medi'))

WebUI.setText(findTestObject('LOGIN/date'), '09/10/2024')

WebUI.setText(findTestObject('LOGIN/comment'), 'Thank U')

WebUI.click(findTestObject('LOGIN/book'))

WebUI.takeScreenshot()

apptStatus = WebUI.verifyTextPresent('Appointment Confirmation', false)

if (apptStatus == true) {
    WebUI.click(findTestObject('LOGIN/menu'))

    WebUI.click(findTestObject('LOGIN/Logout'))
}

WebUI.closeBrowser()

