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

WebUI.navigateToUrl((GlobalVariable.Url + '/') + GlobalVariable.lang)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/a_Akzeptieren'))

WebUI.click(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/a_Kontakt'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/publicare advise'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/phone clickable'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/email clickable'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/calendar clickable'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/footer contact'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/contact section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/opening hrs'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/about publicare'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/publicare stories'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/newsletter section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/de/2_Footer/Page_HOME  Publicare/register now'))

WebUI.closeBrowser()

