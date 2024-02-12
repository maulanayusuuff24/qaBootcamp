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

WebUI.navigateToUrl(GlobalVariable.webfinal)

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_OR_username'), username)

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_Username_password'), password)

WebUI.sendKeys(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_Username_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/div_SPEAKERS                        Shop Now'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/img_SHOP NOW_25'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_CHECKOUT  (1,138.00)'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_NEXT'))

if (paymentMethod == 'safepay') {
    WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/input__safepay_username'), 'uname')

    WebUI.setEncryptedText(findTestObject('FinalWeb/Page_Advantage Shopping/input__safepay_password'), 'c5s7CZtvJJc=')

    WebUI.click(findTestObject('FinalWeb/Page_Advantage Shopping/button_PAY NOW_PAY'))
} else {
    WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/MasterCredit'))

    WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/input__card_number'), cardNumber)

    WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/cvvNumber'), cvv)

    WebUI.selectOptionByValue(findTestObject('FinalWeb/Page_Advantage Shopping/mmExp'), expMonth, false)

    WebUI.selectOptionByLabel(findTestObject('FinalWeb/Page_Advantage Shopping/yyyyExp'), expYear, false)

    WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/input__cardholder_name'), username)
	WebUI.click(findTestObject('FinalWeb/Page_Advantage Shopping/sec-sender_PAY NOW'))
}



WebUI.verifyElementText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/span_Thank you for buying with Advantage'), 
    'Thank you for buying with Advantage')

