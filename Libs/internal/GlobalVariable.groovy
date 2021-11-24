package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object reg_url
     
    /**
     * <p></p>
     */
    public static Object aut_url
     
    /**
     * <p></p>
     */
    public static Object baseURL
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object tokenaut
     
    /**
     * <p></p>
     */
    public static Object ID
     
    /**
     * <p></p>
     */
    public static Object idP
     
    /**
     * <p></p>
     */
    public static Object firstName
     
    /**
     * <p></p>
     */
    public static Object middleName
     
    /**
     * <p></p>
     */
    public static Object lastName
     
    /**
     * <p></p>
     */
    public static Object code
     
    /**
     * <p></p>
     */
    public static Object timezone
     
    /**
     * <p></p>
     */
    public static Object notePI
     
    /**
     * <p></p>
     */
    public static Object datetime
     
    /**
     * <p></p>
     */
    public static Object notePO
     
    /**
     * <p></p>
     */
    public static Object dob
     
    /**
     * <p></p>
     */
    public static Object licenseNumber
     
    /**
     * <p></p>
     */
    public static Object licenseExpDate
     
    /**
     * <p></p>
     */
    public static Object marital
     
    /**
     * <p></p>
     */
    public static Object gender
     
    /**
     * <p></p>
     */
    public static Object otherid
     
    /**
     * <p></p>
     */
    public static Object nationality
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            reg_url = selectedVariables['reg_url']
            aut_url = selectedVariables['aut_url']
            baseURL = selectedVariables['baseURL']
            username = selectedVariables['username']
            password = selectedVariables['password']
            tokenaut = selectedVariables['tokenaut']
            ID = selectedVariables['ID']
            idP = selectedVariables['idP']
            firstName = selectedVariables['firstName']
            middleName = selectedVariables['middleName']
            lastName = selectedVariables['lastName']
            code = selectedVariables['code']
            timezone = selectedVariables['timezone']
            notePI = selectedVariables['notePI']
            datetime = selectedVariables['datetime']
            notePO = selectedVariables['notePO']
            dob = selectedVariables['dob']
            licenseNumber = selectedVariables['licenseNumber']
            licenseExpDate = selectedVariables['licenseExpDate']
            marital = selectedVariables['marital']
            gender = selectedVariables['gender']
            otherid = selectedVariables['otherid']
            nationality = selectedVariables['nationality']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
