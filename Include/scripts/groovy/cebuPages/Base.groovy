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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.SelectorMethod
import internal.GlobalVariable

public class Base {
	String option;

	def click(String path) {
		TestObject btn = new TestObject()
		btn.setSelectorValue(SelectorMethod.XPATH,path)
		btn.setSelectorMethod(SelectorMethod.XPATH)
		WebUI.scrollToElement(btn, 60)
		WebUI.click(btn)
	}

	def enterValue(String path, String value) {
		TestObject text = new TestObject()
		text.setSelectorValue(SelectorMethod.XPATH,path)
		text.setSelectorMethod(SelectorMethod.XPATH)
		WebUI.scrollToElement(text, 60)
		WebUI.setText(text,value )
	}

	def verifyElementPresent(String path) {
		TestObject element = new TestObject()
		element.setSelectorValue(SelectorMethod.XPATH,path)
		element.setSelectorMethod(SelectorMethod.XPATH)
		WebUI.verifyElementPresent(element, 60)
	}

	def clickbutton(String Options) {
		if (Options == 'Agree') {
			option='I agree'
		}
		else if (Options =='Continue') {
			option='Continue'
		}
		String buttonName = "//a[contains(text(),'"+option+"')]"
		click(buttonName)
	}

	def elementScroll(String path) {
		TestObject element = new TestObject()
		element.setSelectorValue(SelectorMethod.XPATH,path)
		element.setSelectorMethod(SelectorMethod.XPATH)
		WebUI.scrollToElement(element, 60)
	}
}
