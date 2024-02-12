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

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/svg_CHECKOUT  (0.00)_menuUser'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/a_CREATE NEW ACCOUNT'))

WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/input__usernameRegisterPage (1)'), username)

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input__emailRegisterPage'), email)

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input__passwordRegisterPage'), password)

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input__confirm_passwordRegisterPage'), 
    cpassword)

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_PERSONAL DETAILS_first_nameRegisterPage'), 
    firstName)

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_- Use maximum 30 character_last_nameR_6ef033'), 
    lastName)

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_- Use maximum 30 character_phone_numb_7c938a'), 
    phone)

WebUI.selectOptionByLabel(findTestObject('FinalWeb/Page_Advantage Shopping/Select Country'), country, true)

WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/input_Country_cityRegisterPage'), city)

WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/AlamatRumah (1)'), address)

WebUI.setText(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/input_- Use maximum 50 character_state__pro_272a54'), 
    state)

WebUI.setText(findTestObject('FinalWeb/Page_Advantage Shopping/kkodepos'), '133')

if (offer == 1) {
    WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/offering'))
} else {
    println('lanjut')
}

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/TnCbox'))

WebUI.click(findTestObject('Object Repository/FinalWeb/Page_Advantage Shopping/button_REGISTER'))

