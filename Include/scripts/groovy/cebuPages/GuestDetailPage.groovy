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

public class GuestDetailPage extends Base{


	String gotItBtn ="//button[text()=' Got it ']"
	String mobileNumberTxtBx ="//input[@formcontrolname='number']"
	String emailTxtBx ="//input[@formcontrolname='email']"
	String retypeEmail="//input[@ng-reflect-name='retypeEmail']"
	String termsCheckBx ="//div[@class='checkbox terms']//span[@class='checkmark']"
	String continueGuest= "//div[@class='group-cta']//a[text()='Continue']"
	String dd= "(//input[@type = 'text' and @placeholder = 'DD'])[1]"
	String mm ="(//input[@type = 'text' and @placeholder = 'Month'])[1]"
	String yy ="(//input[@type = 'text' and @placeholder = 'YYYY'])[1]"
	String lName="(//input[@type = 'text' and @placeholder = 'Enter last name'])[1]"
	String nationality ="//input[@type = 'text' and @placeholder = 'Select nationality']"
	String title="(//input[@type = 'text' and @placeholder = 'Select'])[1]"
	String fName="(//input[@type = 'text' and @placeholder = 'Enter first name'])[1]"
	String nextGuest ="//a[text()='Next guest ']"
	String mTitle ="(//section[@id='contact-information-container']//input[@placeholder='Select'])[1]"
	//	String continueAddOns ="//button[text()=' Continue ']"

	def clickGotIt() {
		click(gotItBtn)
	}

	def enterLastName(String lastName) {
		enterValue(lName,lastName)
	}

	def enterDOB(String DD, String MM, String YYYY) {
		String dValue ="//a[contains(text(),'"+DD+"')]"
		String mValue="//a[contains(text(),'"+MM+"')]"
		String yValue="//a[contains(text(),'"+YYYY+"')]"
		click(dd)
		click(dValue)
		click(mm)
		click(mValue)
		click(yy)
		click(yValue)
	}

	def enterNationality(String Nationality) {
		String val = "//a[contains(text(),'"+Nationality+"')]"
		click(nationality)
		click(val)
	}

	def enterTitle(String Title) {
		String mr ="//a[contains(text(),'"+Title+".')]"
		click(title)
		click(mr)
	}

	def enterMTitle(String Title) {
		String mr ="//a[contains(text(),'"+Title+".')]"
		click(mTitle)
		click(mr)
	}


	def enterFirstName(String firstName) {
		enterValue(fName,firstName)
	}

	def enterCountryCode(String CountryCode) {
		//enterValue(countryCodeInputBx, value)
		String countryCodeInputBx ="//input[@ng-reflect-name='countryCallingCode']"
		String countryCode ="//a[contains(text(),'"+CountryCode+"')]"
		click(countryCodeInputBx)
		click(countryCode)
	}

	def enterMobileNumber(String mobileNumber) {
		enterValue(mobileNumberTxtBx,mobileNumber)
	}

	def enterEmail(String email) {
		enterValue(emailTxtBx,email)
	}

	def retypeEmail(String email) {
		enterValue(retypeEmail, email)
	}

	def clickConsent() {
		click(termsCheckBx)
	}

	def clickContinueButton() {
		click(continueGuest)
	}

	def clickNextGuest() {
		click(nextGuest)
	}

}
