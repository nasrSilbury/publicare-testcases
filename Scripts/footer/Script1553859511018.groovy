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

WebUI.navigateToUrl('https://publicare.ch/de')

WebUI.click(findTestObject('Object Repository/footer/Page_HOME  Publicare/a_Kontakt (2)'))

WebUI.click(findTestObject('Object Repository/footer/Page_HOME  Publicare/div_Wir beraten Sie kompetent  kostenlos._contact-option__circle (6)'))

WebUI.click(findTestObject('Object Repository/footer/Page_HOME  Publicare/div_Anrufen_contact-option__circle'))

WebUI.click(findTestObject('Object Repository/footer/Page_HOME  Publicare/img_schreiben_contact-option__icon'))

WebUI.click(findTestObject('Object Repository/footer/Page_HOME  Publicare/h5_Kontakt'))

WebUI.click(findTestObject('Object Repository/footer/Page_HOME  Publicare/h5_ffnungszeiten'))

WebUI.click(findTestObject('Object Repository/footer/Page_HOME  Publicare/h5_ber Publicare'))

WebUI.click(findTestObject('Object Repository/footer/Page_HOME  Publicare/h5_Publicare Stories'))

WebUI.closeBrowser()
