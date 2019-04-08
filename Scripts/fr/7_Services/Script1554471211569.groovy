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

WebUI.click(findTestObject('Object Repository/fr/7_Services/Page_HOME  Publicare/accepted'))

WebUI.click(findTestObject('Object Repository/fr/7_Services/Page_HOME  Publicare/header menu'))

WebUI.click(findTestObject('Object Repository/fr/7_Services/Page_HOME  Publicare/services menu'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/services page'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/consultation'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/supplier'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/partner'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/knowledge and training'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/download center'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/phone icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/email icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/7_Services/Page_services  Publicare/calendar icon'))

WebUI.closeBrowser()
