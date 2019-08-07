/**
* @author: rinkesh.jain
*
*/
package tests.android.testsuitetestng;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.WsStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.Validator;
import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


 

public class AndroidTestng extends WebDriverTestCase {

    private QAFExtendedWebDriver driver;

     @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        
            driver = getDriver();
        
    }

    @Test
    public void AndroidTestngTest() throws Exception {
    
                 CommonStep.sendKeys("Bob","email"); 
                 driver.findElement("email").verifyText("Bob"); 
                 CommonStep.sendKeys("Bob","password"); 
                 driver.findElement("password").verifyText("Bob"); 
                 driver.findElement("sign.in").waitForEnabled(); 
                 CommonStep.click("sign.in"); 
                 driver.findElement("transacations").verifyPresent(); 
                 driver.findElement("transacations").waitForEnabled(); 
                 CommonStep.click("transacations"); 
                 CommonStep.sendKeys("100","enter.amount"); 
                 driver.findElement("credit").verifyPresent(); 
                 driver.findElement("credit").waitForEnabled(); 
                 CommonStep.click("credit"); 
                 driver.findElement(".fund..transfer").verifyPresent(); 
                 driver.findElement(".fund..transfer").waitForEnabled(); 
                 CommonStep.click(".fund..transfer"); 
                 CommonStep.sendKeys("100","enter.amount"); 
                 driver.findElement("enter.amount").verifyText("100"); 
                 driver.findElement("fund.transfer").waitForEnabled(); 
                 CommonStep.click("fund.transfer"); 
    }

}
