package homePage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass
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
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class HomePage extends Base{


	//	String Continue = "//a[contains(text(),'Continue')]"
	String gotItBtn ="//button[text()=' Got it ']"
	String close ="(//img[@alt='Clear'])[1]"
	String fromDropdown="//input[@id=\"originFormControl-0\"]"
	String departxtBox="//input[@type = 'text' and @placeholder = 'Departing on']"
	String selectDatesBtn = "//button[@type = 'button' and (text() = ' Select dates ')]"
	String child = "//input[@ng-reflect-name='child']"
	String searchflightsBtn="/html/body/omnix-project/omnix-main-master-page/div[1]/omnix-home/omnix-search-flight-modal/div/div[2]/div[5]/div[2]"
	// "//button[@type = 'button' and (text() = ' Search flights' )]"
	String departFlight = "(//div[@class='flight-fare_table'])[1]/div[1]"
	String returnFlight ="(//div[@class='flight-fare_table'])[2]/div[1]"
	String dd= "(//input[@type = 'text' and @placeholder = 'DD'])[1]"
	String mm ="(//input[@type = 'text' and @placeholder = 'Month'])[1]"
	String yy ="(//input[@type = 'text' and @placeholder = 'YYYY'])[1]"



	@And ("Click on Agree")
	def clickAgree() {
		clickbutton("Agree")
	}

	@Then("click on Continue")
	def clickContinue() {
		clickbutton("Continue")
	}

	@And("Select (.*) and (.*)")
	def selectFromCountry(String Country, String City) {
		click(close)
		click(fromDropdown)
		String Country1 ="//div[@class='content']//a[contains(text(),'"+Country+"')]"
		String fromCity1 = "//div[@class='content']//span[contains(text(),'"+City+"')]"
		click(Country1)
		click(fromCity1)
	}

	@Then ("Enter (.*) and (.*)")
	def selectToCountry(String ToCountry, String ToCity) {
		String Country2 = "//div[@class='content']//a[contains(text(),'"+ToCountry+"')]"
		String toCity ="//div[@class='content']//span[contains(text(),'"+ToCity+"')]"
		click(Country2)
		click(toCity)
	}

	@Then ("Select the (.*)")
	def selectDepartDate(String DepartDate){
		String departDate ="//div[contains(@class,'c-calendar-month-container')]/div[1]//div[(text() = '"+DepartDate+"' or . = '"+DepartDate+"')]"
		click(departxtBox)
		click(departDate)
	}

	@And ("Select Return (.*)")
	def selectReturnDate(String rDate) {
		String returnDate ="//div[contains(@class,'c-calendar-month-container')]/div[2]//div[(text() = '"+rDate+"' or . = '"+rDate+"')]"
		click(returnDate)
	}

	@And ("Click on Select dates button")
	def clickOnSelectDateButton() {
		click(selectDatesBtn)
	}

	@Then ("Click on Search flight")
	def clickOnSearchFlight(){
		click(searchflightsBtn)
	}

	@Then("Close the browser")
	def closeBrowser() {
		WebUI.closeBrowser()
	}

	@Then("Marketing Window should get closed")
	def verifyHomePage() {
		WebUI.verifyElementClickable(findTestObject('Object Repository/Home Page/originInput'))
	}

	@Then("Enter the child (.*)")
	def enterChild(String count) {
		enterValue(child,count)
	}

	@And ("select Depart Flight")
	def selectDepartFlight() {
		click(departFlight)
	}

	@And ("select Return Flight")
	def selectReturnFlight() {
		click(returnFlight)
	}

	@Then ("select the fare (.*)")
	def selectBundle(String Bundle) {
		String bundle="//div[contains(@class,'bundle-details')]//button[contains(text(),'"+Bundle+"')]"
		click(bundle)
	}

	@Then ("click on Got it")
	def clickGotIt() {
		click(gotItBtn)
	}

	@And ("enter the Title (.*)")
	def enterTitle(String Title) {
		String title="//input[@type = 'text' and @placeholder = 'Select']"
		String mr ="//a[contains(text(),'"+Title+".')]"
		click(title)
		click(mr)
	}

	@And ("enter Firstname (.*)")
	def enterFirstName(String firstName) {
		String fName="(//input[@type = 'text' and @placeholder = 'Enter first name'])[1]"
		enterValue(fName,firstName)
	}

	@Then ("enter Lastname (.*)")
	def enterLastName(String lastName) {
		String lName="(//input[@type = 'text' and @placeholder = 'Enter last name'])[1]"
		enterValue(lName,lastName)
	}

	@Then ("Enter Date of Birth (.*) (.*) (.*)")
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

	@Then ("Enter Nationality (.*)")
	def enterNationality(String Nationality) {
		String nationality ="//input[@type = 'text' and @placeholder = 'Select nationality']"
		String val = "//a[contains(text(),'"+Nationality+"')]"
		click(nationality)
		click(val)

	}
}