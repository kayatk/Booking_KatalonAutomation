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
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import internal.GlobalVariable

public class Login extends Base{

	String login= "//li[@id='login']/a"
	String loginBtn ="//button[text() = ' Log in ']"
	String emailAddress= "//input[@name='identifier']"
	String nextBtn = "//input[@value='Next']"
	String clickSelect ="//div[@data-se='okta_password']//a[text()='Select']"
	String passwordTxtBx ="//input[@type='password']"
	String verifyBtn ="//input[@type='submit']"
	String myAccount="//a[contains(text(),'My Account')]"

	def clickLogin() {
		click(login)
	}

	def loginButton() {
		click(loginBtn)
	}

	def enterEmail(String Email) {
		enterValue(emailAddress,Email)
	}

	def enterPassword(String Password) {
		enterValue(passwordTxtBx,Password )
	}

	def clickNext() {
		click(nextBtn)
	}

	def selectPassword() {
		click(clickSelect)
	}

	def clickVerify() {
		click(verifyBtn)
	}

	def verifyLoggedIn() {
		verifyElementPresent(myAccount)
	}
}