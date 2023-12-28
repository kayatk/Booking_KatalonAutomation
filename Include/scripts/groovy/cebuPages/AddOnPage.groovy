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

public class AddOnPage extends Base {

	String continueAddOns ="//button[text()=' Continue ']"
	String proceedAnyway = "//a[text()='Proceed anyway']"
	String seatSelector = "(//div[@class='c-add-ons__card__content'])[1]"
	String baggage ="(//div[@class='c-add-ons__card__content'])[2]"
	String meals ="(//div[@class='c-add-ons__card__content'])[3]"
	String flexi= "(//div[@class='c-add-ons__card__content'])[4]"
	String travelSure="(//div[@class='c-add-ons__card__content'])[5]"

	@And("Click on Continue button in Add ons Page")
	def clickContinueButtonAddOns() {
		WebUI.waitForPageLoad(65)
		click(continueAddOns)
	}



	def clickProceedAnyway() {
		click(proceedAnyway)
	}


	@Then("Add Addons(.*)")
	def addAddOns(String addOns ) {
		if(addOns == "Yes") {
			click(seatSelector)
			click("(//span[contains(@class,'seat ng-star-inserted')])[90]")
			click("//span[text()='Select seat']")
			click("(//span[contains(@class,'seat ng-star-inserted')])[91]")
			click("//a[text()='Next Flight']")
			click("(//span[contains(@class,'seat ng-star-inserted')])[90]")
			click("//span[text()='Select seat']")
			click("(//span[contains(@class,'seat ng-star-inserted')])[91]")
			click("//button[text()=' Select more add-ons ']")
			click(baggage)
			click("//button[text()=' Add baggage ']")
			click("//button[text()=' + 4kg ']")
			click("//button[text()=' Next flight ']")
			click("//button[text()=' Add baggage ']")
			click("//button[text()=' + 4kg ']")
			click("//button[text()=' More add-ons ']")
			/*click(meals)
			 click("//span[@class='toggle-button']")
			 click("//h4[text()='Chicken and Mushroom Pasta']")
			 click("(//a[@class='add'])[2]")
			 click("//button[contains(text(),'Add')]")
			 click("//button[text()=' Select more add-ons ']")*/
			click(flexi)
			click("//button[text()=' Add CEB Flexi ']")
			click("//button[text()=' Back to Add-ons ']")
			/*click(travelSure)
			 click("//button[text()=' Add CEB TravelSure ']")
			 click("//button[text()=' Proceed to payment ']")
			 click("//button[text()=' Select more add-ons ']")*/
		}
	}
}
