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

WebUI.navigateToUrl(GlobalVariable.Url+'/'+GlobalVariable.lang)

WebUI.maximizeWindow();

WebUI.click(findTestObject('Object Repository/fr/3_Product/Page_HOME  Publicare/a_Akzeptieren'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/3_Product/Page_HOME  Publicare/verify page header'))

WebUI.click(findTestObject('Object Repository/fr/3_Product/Page_HOME  Publicare/click product menu'))

WebUI.click(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/product label'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/a_Ergnzende Produkte'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/direct to label'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/direct element'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/product details'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/phone icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/email icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/calendar icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/publicare benefits'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/learn more link'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/3_Product/Page_Product  Publicare/signup button'))

WebUI.closeBrowser()

