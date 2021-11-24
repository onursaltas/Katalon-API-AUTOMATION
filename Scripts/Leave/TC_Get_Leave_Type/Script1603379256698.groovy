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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequestAndVerify(findTestObject('Leave/GET_Leave_Types', [('url') : GlobalVariable.url, ('token') : GlobalVariable.token]))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'data[0].type', "aa")
WS.verifyElementPropertyValue(response, 'data[0].id', "12")

WS.verifyElementPropertyValue(response, 'data[1].type', "aga")
WS.verifyElementPropertyValue(response, 'data[1].id', "34")

WS.verifyElementPropertyValue(response, 'data[2].type', "alodia")
WS.verifyElementPropertyValue(response, 'data[2].id', "6")
//
//WS.verifyElementPropertyValue(response, 'data[3].type', "Cuti Nia")
//WS.verifyElementPropertyValue(response, 'data[3].id', "8")
