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

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_HOME  Publicare/a_Akzeptieren'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/1_Header/Page_HOME  Publicare/p_Publicare'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/1_Header/Page_HOME  Publicare/div_Publicare'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/1_Header/Page_HOME  Publicare/header menu'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/1_Header/Page_HOME  Publicare/uber publicare'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/1_Header/Page_About Publicare  Publicare/career'))

WebUI.verifyElementClickable(findTestObject('Object Repository/fr/1_Header/Page_Karriere  Publicare/contact'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_Karriere  Publicare/language drop down'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_Karriere  Publicare/header menu right click'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_Karriere  Publicare/Uber publicare first menu'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_About Publicare  Publicare/Title publicare image click'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_HOME  Publicare/title product'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_Product  Publicare/title services'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_services  Publicare/title publicare academy'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_Publicare Academy  Publicare/a_ber Publicare'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_About Publicare  Publicare/a_Team'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_Team  Publicare/a_ber Publicare'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_About Publicare  Publicare/a_Karriere'))

WebUI.click(findTestObject('Object Repository/fr/1_Header/Page_Karriere  Publicare/a_ber Publicare'))

WebUI.closeBrowser()