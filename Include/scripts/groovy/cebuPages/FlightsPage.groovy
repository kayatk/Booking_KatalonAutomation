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
import cucumber.api.java.en.When


public class FlightsPage extends Base {
	String departFlight = "(//div[@class='flight-fare_table'])[1]/div[1]"
	String returnFlight ="(//div[@class='flight-fare_table'])[2]/div[1]"
	
	def selectDepartFlight() {
		click(departFlight)
	}

	def selectReturnFlight() {
		click(returnFlight)
	}
	def clickContinue() {
		clickbutton("Continue")
	}

	def selectBundle(String Bundle) {
		String bundle="//div[contains(@class,'bundle-details')]//button[contains(text(),'"+Bundle+"')]"
		click(bundle)
	}
	

}
