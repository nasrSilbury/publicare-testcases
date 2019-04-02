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

WebUI.maximizeWindow();

WebUI.setText(findTestObject('Object Repository/search/Page_HOME  Publicare/input_Anmelden_search_api_fulltext'), 'medi')

WebUI.click(findTestObject('Object Repository/search/Page_HOME  Publicare/input_Anmelden_edit-submit-publicare-search'))

WebUI.click(findTestObject('Object Repository/search/Page_Publicare Suche  Publicare/div_Hausella Slip medi Plus Gr.4244'))

WebUI.click(findTestObject('Object Repository/search/Page_Product Information  Publicare/td_Nicht an Lager_table-cell'))

WebUI.click(findTestObject('Object Repository/search/Page_Product Information  Publicare/a_3M 1528-1'))

WebUI.setText(findTestObject('Object Repository/search/Page_Product Information  Publicare/input_Anmelden_search_api_fulltext'), 
    'beutel')

WebUI.click(findTestObject('Object Repository/search/Page_Product Information  Publicare/input_Anmelden_edit-submit-publicare-search'))

WebUI.click(findTestObject('Object Repository/search/Page_Publicare Suche  Publicare/h1_Ergebnis fr          beutel'))

WebUI.click(findTestObject('Object Repository/search/Page_Publicare Suche  Publicare/strong_705'))

WebUI.closeBrowser()

