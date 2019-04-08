import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url + '/' + GlobalVariable.lang)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/de/5_Login/Page_HOME  Publicare/accepted'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/5_Login/Page_HOME  Publicare/header section'))

WebUI.click(findTestObject('Object Repository/de/5_Login/Page_HOME  Publicare/login header button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/5_Login/Page_Portal log in  Publicare/login section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/5_Login/Page_Portal log in  Publicare/register now and profit section'))

WebUI.setText(findTestObject('Object Repository/de/5_Login/Page_Portal log in  Publicare/input email'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/de/5_Login/Page_Portal log in  Publicare/input password'), GlobalVariable.password)

WebUI.verifyElementClickable(findTestObject('Object Repository/de/5_Login/Page_Portal log in  Publicare/login button'))

WebUI.closeBrowser()

