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

WebUI.openBrowser('http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html')

WebUI.maximizeWindow()

WebUI.dragAndDropToObject(findTestObject('Alert Pop Up/rome'), findTestObject('Alert Pop Up/italy'))

WebUI.dragAndDropToObject(findTestObject('Alert Pop Up/madrid'), findTestObject('Alert Pop Up/spain'))

WebUI.dragAndDropToObject(findTestObject('Alert Pop Up/seoul'), findTestObject('Alert Pop Up/south'))

WebUI.dragAndDropToObject(findTestObject('Alert Pop Up/copen'), findTestObject('Alert Pop Up/den'))

WebUI.dragAndDropToObject(findTestObject('Alert Pop Up/wash'), findTestObject('Alert Pop Up/united'))

WebUI.dragAndDropToObject(findTestObject('Alert Pop Up/stock'), findTestObject('Alert Pop Up/sweden'))

WebUI.dragAndDropToObject(findTestObject('Alert Pop Up/oslo'), findTestObject('Alert Pop Up/nor'))

WebUI.takeScreenshot()

