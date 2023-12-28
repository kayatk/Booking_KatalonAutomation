package cebuPages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.And
import cucumber.api.java.en.Then

import internal.GlobalVariable

public class paymentPage extends Base {

	String proceedToPayment ="//button[text()=' Proceed to payment ']"
	String carriageConsent ="//div[@class='checkbox terms']//span[@class='checkmark']"
	String continuePayment ="//a[text()='Continue']"
	String creditRadiobtn= "//div[@id='gtm_card_payment']//input[@type='radio']"
	String cardNumbertxtbx = "//div[@name='cardNumber']//input[@id='cardInfo_cardNumber']"
	String cardFirstNametxtbx = "//div[@name='CardHolderFirstName']//input[@id='cardInfo_holderFirstName']"
	String cardLastNametxtbx = "//div[@name='CardHolderLastName']//input[@id='cardInfo_holderLastName']"
	String cvvTxtbx ="//div[@name='cvv']//input[@id='cardInfo_cvv']"
	String mmtxtbx ="//div[@id='cardInfo_expiryDate']"
	String mmValue="//li[@label='03']"
	String yyyytxtbx ="//div[@id='cardInfo_expiryYear']"
	String yyyyValue ="//li[@label='2027']"
	String streetAddress = "//input[@placeholder='Enter street address']"
	String city ="//input[@placeholder='Enter city/town']"
	String country="//div[@id='billingInfo_countryid']"
	String state ="//div[@id='billingInfo_state']"
	String zipCode ="//input[@placeholder='Enter zip code']"
	String paymentConsent = "//input[@id='gtm_pay_term_conditions']"
	String submitPayment = "//button[@id='gtm_pay_submit']"
	String paymentCurrency = "//div[@class='card '][1]//div[@class='payNow']"
	String otpTxtBx="//input[@name='challengeDataEntry']"
	String otpSubmit = "//div[@class='acs-challenge-form-actions']//button[@class='acs-challenge-btn proceed']"
	String backToHome = "//input[@type='submit']"
	String countryValue="//li[text()='Philippines']"
	String stateValue="//li[text()='Metro Manila']"

	@Then ("Make the payment(.*),(.*),(.*),(.*),(.*),(.*),(.*)")
	def makePayment(String cardNumber, String cardFName, String cardLName, String cvv, String address,String Ccity, String CzipCode) {
		click(creditRadiobtn)
		enterValue(cardNumbertxtbx,cardNumber )
		enterValue(cardFirstNametxtbx,cardFName)
		enterValue(cardLastNametxtbx,cardLName)
		enterValue(cvvTxtbx,cvv)
		click(mmtxtbx)
		click(mmValue)
		click(yyyytxtbx)
		click(yyyyValue)
		click(paymentCurrency)
		enterValue(streetAddress,address)
		enterValue(city,Ccity)
		click(country)
		click(countryValue)
		click(state)
		click(stateValue)
		enterValue(zipCode,CzipCode)
		click(paymentConsent)
		click(submitPayment)
	}

	@And ("Enter otp(.*)")
	def enterotp(String otp) {
		WebUI.waitForPageLoad(60)
		enterValue(otpTxtBx,otp)
		click(otpSubmit)
		click(backToHome)
	}
	@And("click on proceed to payment")
	def clickProceedPayment() {
		WebUI.waitForPageLoad(65)
		click(proceedToPayment)
	}

	@Then ("Click on Conditions of carriage consent")
	def clickOnConditionsConsent() {
		click(carriageConsent)
	}

	@And ("Click on Conitnue in AddOns page")
	def clickContinueAddOns() {
		click(continuePayment)
		Thread.sleep(75000)
	}

	@And("consent Agreement in booking summary")
	def consentBookingSummary() {
		click(carriageConsent)
		click(continuePayment)
		Thread.sleep(75000)
	}
}
