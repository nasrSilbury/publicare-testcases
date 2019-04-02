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

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/header/Page_HOME  Publicare/a_Akzeptieren'))

WebUI.click(findTestObject('Object Repository/header/Page_HOME  Publicare/a_ber Publicare'))

WebUI.click(findTestObject('Object Repository/header/Page_ber Publicare  Publicare/a_Team'))

WebUI.click(findTestObject('Object Repository/header/Page_Team  Publicare/a_ber Publicare'))

WebUI.click(findTestObject('Object Repository/header/Page_ber Publicare  Publicare/a_Karriere'))

WebUI.click(findTestObject('Object Repository/header/Page_Karriere  Publicare/a_ber Publicare'))

WebUI.click(findTestObject('Object Repository/header/Page_ber Publicare  Publicare/a_Leitbild'))

WebUI.click(findTestObject('Object Repository/header/Page_Leitbild  Publicare/a_ber Publicare'))

WebUI.click(findTestObject('Object Repository/header/Page_ber Publicare  Publicare/a_Engagement'))

WebUI.click(findTestObject('Object Repository/header/Page_Engagement  Publicare/a_ber Publicare'))

WebUI.click(findTestObject('Object Repository/header/Page_ber Publicare  Publicare/a_Karriere'))

WebUI.click(findTestObject('Object Repository/header/Page_Karriere  Publicare/a_Kontakt'))

WebUI.closeBrowser()
