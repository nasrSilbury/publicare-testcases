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

WebUI.click(findTestObject('Object Repository/login/Page_HOME  Publicare/a_Anmelden'))

WebUI.sendKeys(findTestObject('Object Repository/login/Page_Portal log in  Publicare/input_E-Mail_email'), GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Portal log in  Publicare/input_Passwort_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/login/Page_Portal log in  Publicare/input_Passwort vergessen_button button--primary button--wider'))

WebUI.closeBrowser()

