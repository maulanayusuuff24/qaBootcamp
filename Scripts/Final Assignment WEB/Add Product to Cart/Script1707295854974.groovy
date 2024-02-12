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

WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/input_OR_username'), username)

WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/input_Username_password'), password)

WebUI.sendKeys(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_Username_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('FinalWeb/Page_Advantage Shopping/div_SPEAKERS'))

WebUI.mouseOver(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/img_SHOP NOW_25'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/img_SHOP NOW_25'))

if (color == 'tosca') {
    WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/span_Color_tosca'))
}

if (color == 'black') {
    WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/span_Color_black'))
}

if (color == 'red') {
    WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/span_Color_red'))
} else {
    WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/span_Color_blue'))
}

WebUI.click(findTestObject('FinalWeb/Page_Advantage Shopping/input_Quantity_quantity'))

WebUI.sendKeys(findTestObject('FinalWeb/Page_Advantage Shopping/input_Quantity_quantity'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/input_Quantity_quantity'), qty)

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_CHECKOUT  (516.00)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/h3_ORDER PAYMENT'), 0)

