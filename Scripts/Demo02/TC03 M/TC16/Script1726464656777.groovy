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

WebUI.openBrowser('https://computer-database.gatling.io/computers')

WebUI.maximizeWindow()

WebUI.enhancedClick(findTestObject('Page_Computers database/Add a new computer'))

createCopm = WebUI.verifyTextPresent('Add a computer', false)

if (createCopm == true) {
    WebUI.setText(findTestObject('Page_Computers database/Computer name input'), compname1)

    WebUI.setMaskedText(findTestObject('Page_Computers database/introduced date'), introdate1)

    WebUI.setMaskedText(findTestObject('Page_Computers database/Discontinued date'), disdate1)

    WebUI.selectOptionByIndex(findTestObject('Page_Computers database/Choose a Company'), chosecompany1)

    WebUI.click(findTestObject('Page_Computers database/Create this comp button'))

    WebUI.verifyTextPresent('has been created', false)

    WebUI.closeBrowser()
} else {
    println('The test case failed')
}

