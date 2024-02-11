import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://advantageonlineshopping.com/')

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_OR_username'), 'namuu')

WebUI.setEncryptedText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_Username_password'), 'c5s7CZtvJJc=')

WebUI.sendKeys(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_Username_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/div_SPEAKERS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/img_SHOP NOW_25'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_CHECKOUT  (1,138.00)'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_NEXT'))

WebUI.mouseOver(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/Safepay'))

WebUI.mouseOver(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/MasterCredit'))

WebUI.mouseOver(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/span_1,188.00'))

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/address'), 'uname')

WebUI.setEncryptedText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/address'), 'c5s7CZtvJJc=')

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_PAY NOW'))

WebUI.verifyElementText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/span_Thank you for buying with Advantage'), 
    'Thank you for buying with Advantage')

