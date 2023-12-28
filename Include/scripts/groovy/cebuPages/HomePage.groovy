package cebuPages
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

	String close ="(//img[@alt='Clear'])[1]"
	String fromDropdown="//input[@id=\"originFormControl-0\"]"
	String departxtBox="//input[@type = 'text' and @placeholder = 'Departing on']"
	String selectDatesBtn = "//button[@type = 'button' and (text() = ' Select dates ')]"
	String child = "//input[@ng-reflect-name='child']"
	String searchflightsBtn="/html/body/omnix-project/omnix-main-master-page/div[1]/omnix-home/omnix-search-flight-modal/div/div[2]/div[5]/div[2]"
	// "//button[@type = 'button' and (text() = ' Search flights' )]"
	String tripType= "//div[contains(@class,'group2')]//span[@class='result']"


	def selectTripType(String tripTypes){
		String trip = "(//a[text()='"+tripTypes+"'])[2]"
		if((tripTypes =="One-way") || (tripTypes == "Multi-city")) {
			elementScroll(tripType)
			click(tripType)
			click(trip)
		}
	}

	def selectFromCountry(String Country, String City) {
		click(close)
		click(fromDropdown)
		String Country1 ="//div[@class='content']//a[contains(text(),'"+Country+"')]"
		String fromCity1 = "//div[@class='content']//span[contains(text(),'"+City+"')]"
		click(Country1)
		click(fromCity1)
	}


	def selectToCountry(String ToCountry, String ToCity) {
		String Country2 = "//div[@class='content']//a[contains(text(),'"+ToCountry+"')]"
		String toCity ="//div[@class='content']//span[contains(text(),'"+ToCity+"')]"
		click(Country2)
		click(toCity)
	}

	def selectDepartDate(String DepartDate,String tripTypes){
		String departDate ="//div[contains(@class,'c-calendar-month-container')]/div[1]//div[(text() = '"+DepartDate+"' or . = '"+DepartDate+"')]"
		if(tripTypes=="One-way") {
			click("(//input[@type = 'text' and @placeholder = 'Departing on'])[2]")
		}
		else {
			click(departxtBox)
		}
		click(departDate)
	}

	def selectReturnDate(String rDate) {
		String returnDate ="//div[contains(@class,'c-calendar-month-container')]/div[2]//div[(text() = '"+rDate+"' or . = '"+rDate+"')]"
		click(returnDate)
	}

	def clickOnSelectDateButton() {
		click(selectDatesBtn)
	}

	def clickOnSearchFlight(){
		click(searchflightsBtn)
	}
	
	def enterChild(String count) {
		enterValue(child,count)
	}


}