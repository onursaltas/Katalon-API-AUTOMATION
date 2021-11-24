import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.sql.ResultSet as ResultSet
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonSlurper as JsonSlurper

response1 = WS.sendRequest(findTestObject('AAIService/Generate Token'))

println('response:' + response1.getResponseBodyContent())

def slurper = new JsonSlurper()

def result = slurper.parseText(response1.getResponseBodyContent())

def value = result.token

println('value of token:' + value)

GlobalVariable.gtoken = value

println('value of gtoken:' + GlobalVariable.gtoken)

println('value of GroupID:' + Group_Id)

response2 = WS.sendRequestAndVerify(findTestObject('AAIService/addUserGroup'))

println('response2:' + response2.getResponseBodyContent())




CustomKeywords.'dbConn.DemoMySql.connectDB'('whf00btz.in.oracle.com', '1521', 'PERL12CR2', 'nxg1_config01', 'password123')

String query = ("select * from CSSMS_GROUP_MAST where V_GROUP_CODE in ('" + Group_Id + "')")

println('Query: ' + query)

ResultSet rs = CustomKeywords.'dbConn.DemoMySql.executeQuery'(query)

String groupName = null

while (rs.next()) {
	groupName = rs.getObject('V_GROUP_NAME')

	println('value of groupName:' + groupName)
}

if (groupName.equals(Group_Name)) {
	println('${Group+Name}:' + Group_Name)

	println('Success')
}

CustomKeywords.'dbConn.DemoMySql.closeDatabaseConnection'()