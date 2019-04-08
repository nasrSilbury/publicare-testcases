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

WebUI.click(findTestObject('Object Repository/fr/4_Acadamy/Page_HOME  Publicare/accepted'))

WebUI.click(findTestObject('Object Repository/fr/4_Acadamy/Page_HOME  Publicare/Publicare Academy Menu'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/4_Acadamy/Page_Publicare Academy  Publicare/header menu'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/4_Acadamy/Page_Publicare Academy  Publicare/download handouts'))

WebUI.setText(findTestObject('Object Repository/fr/4_Acadamy/Page_Publicare Academy  Publicare/input access code'),'000')

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/4_Acadamy/Page_Publicare Academy  Publicare/send code button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/4_Acadamy/Page_Publicare Academy  Publicare/academy details page'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/4_Acadamy/Page_Publicare Academy  Publicare/phone icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/4_Acadamy/Page_Publicare Academy  Publicare/email icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/fr/4_Acadamy/Page_Publicare Academy  Publicare/calendar icon'))

WebUI.closeBrowser()

