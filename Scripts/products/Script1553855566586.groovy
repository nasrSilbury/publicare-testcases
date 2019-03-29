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

WebUI.click(findTestObject('Object Repository/products/Page_HOME  Publicare/a_Produkte'))

WebUI.click(findTestObject('Object Repository/products/Page_Produkt  Publicare/a_Ergnzende Produkte'))

WebUI.click(findTestObject('Object Repository/products/Page_Ergnzende Produkte  Publicare/a_Blutzuckermessungen'))

WebUI.click(findTestObject('Object Repository/products/Page_Blutzuckermessungen  Publicare/a_Blutzuckermessungen'))

WebUI.click(findTestObject('Object Repository/products/Page_Blutzuckermessungen  Publicare/a_Lanzetten und Nadeln'))

WebUI.click(findTestObject('Object Repository/products/Page_Lanzetten und Nadeln  Publicare/a_Blutzuckermessungen'))

WebUI.click(findTestObject('Object Repository/products/Page_Blutzuckermessungen  Publicare/a_Ergnzende Produkte'))

WebUI.click(findTestObject('Object Repository/products/Page_Ergnzende Produkte  Publicare/a_Alle Produkte'))

WebUI.click(findTestObject('Object Repository/products/Page_Produkt  Publicare/a_Produkte'))

WebUI.closeBrowser()

