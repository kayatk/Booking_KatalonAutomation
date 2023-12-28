package cebuFunctions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import cebuPages.*
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class GuestFn {

	GuestDetailPage guest = new GuestDetailPage()

	@And('Enter Guest Details(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)')
	def enterGuestDetails(String userType,String FlightType,String Title, String firstName, String lastName,String DD,String MM,String YYYY,String Nationality,String CTitle,String CfirstName,String ClastName,String CDD, String CMM, String CYYYY,String CNationality,String mobileNumber,String email,String CountryCode) {
		if(FlightType == "International") {
			guest.clickGotIt()
		}
		guest.enterTitle(Title)
		guest.enterFirstName(firstName)
		guest.enterLastName(lastName)
		guest.enterDOB(DD,MM,YYYY)
		guest.enterNationality(Nationality)
		guest.clickNextGuest()
		guest.enterTitle(CTitle)
		guest.enterFirstName(CfirstName)
		guest.enterLastName(ClastName)
		guest.enterDOB(CDD,CMM,CYYYY)
		guest.enterNationality(CNationality)	
		guest.enterCountryCode(CountryCode)
		guest.enterMobileNumber(mobileNumber)

		if (userType == 'Anonymous') {
			guest.enterEmail(email)
			guest.retypeEmail(email)
		}
		else {
			guest.enterMTitle(CTitle)
		}
		guest.clickConsent()
		guest.clickContinueButton()
	}
}