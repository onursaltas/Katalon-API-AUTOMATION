<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>addUserGroup</name>
   <tag></tag>
   <elementGuidId>36671150-948e-4558-bcab-b13871596c54</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;v_group_id\&quot;: ${Group_Id},\n  \&quot;v_group_name\&quot;: ${Group_Name},\n  \&quot;v_group_desc\&quot;: ${Group_Desc},\n  \&quot;precedence\&quot;: \u0027111\u0027\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${gtoken}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://tn002.ofs.oracle.com/identity/v1/group/addusergroup</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.gtoken</defaultValue>
      <description></description>
      <id>a0f47f7d-e74b-4309-9a72-43b125ee9427</id>
      <masked>false</masked>
      <name>gtoken</name>
   </variables>
   <variables>
      <defaultValue>findTestData('excel').getValue(1, 1)</defaultValue>
      <description></description>
      <id>e97d228f-c0ba-4a2d-adb3-f3c321d6e4b6</id>
      <masked>false</masked>
      <name>Group_Id</name>
   </variables>
   <variables>
      <defaultValue>findTestData('excel').getValue(2, 1)</defaultValue>
      <description></description>
      <id>e6961902-ccae-49b5-b18c-c1577fc22450</id>
      <masked>false</masked>
      <name>Group_Name</name>
   </variables>
   <variables>
      <defaultValue>findTestData('excel').getValue(3, 1)</defaultValue>
      <description></description>
      <id>a3a5f0bf-32d2-48f2-8431-030389320131</id>
      <masked>false</masked>
      <name>Group_Desc</name>
   </variables>
   <variables>
      <defaultValue>109</defaultValue>
      <description></description>
      <id>647c1fa9-b447-46ed-b07e-1720199bcff6</id>
      <masked>false</masked>
      <name>Precedence</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()



WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
