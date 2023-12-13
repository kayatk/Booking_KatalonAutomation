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

WebUI.navigateToUrl('https://omnix-qa.cebupacificair.com/en-PH/')

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/img_Subscribe_ng-tns-c18-15'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_From_originFormControl-0'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/a_Australia'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/span_Sydney'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/a_Philippines'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/span_Manila'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_Depart_ng-tns-c20-20'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/span_14'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/span_29'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/button_Select dates'))

WebUI.setText(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_Children_ng-tns-c24-23 grey ng-untouc_9074fa'), 
    '1')

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/button_Search flights'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/div_1225 PMDepart - SYD0535 PM Arrive - MNL_9ea20c'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/div_1120 PMDepart - MNL1055 AM 1 Arrive - S_19c35f'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/button_I want cheaper bags  seats'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/a_Continue'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/button_Got it'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_Title_o-form_input__field readonly ng_000448'))

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/a_Ms'))

WebUI.setText(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_First name_ng-tns-c38-118 ng-untouche_dd8f85'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_Last name_ng-tns-c38-118 ng-untouched_cb1647'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_Day_ng-tns-c40-126 ng-untouched ng-pr_73241e'), 
    '18')

WebUI.setText(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_Month_ng-tns-c40-126 ng-untouched ng-_5b26e7'), 
    'April')

WebUI.setText(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_Year_ng-tns-c40-126 ng-untouched ng-p_638fa2'), 
    '1997')

WebUI.setText(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/input_Nationality_o-form_input__field ng-un_d9e3d9'), 
    'Sr')

WebUI.click(findTestObject('Object Repository/Home Page/Page_Book flights with Cebu Pacific/a_Sri Lanka, Democratic Socialist Republic _b2d9a1'))

