/**
* @author: nidhi.shah
*
*/
package tests.windows.windows;

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
import org.openqa.selenium.Keys;
import steps.common.*;


 

public class Windows extends WebDriverTestCase {

    private QAFExtendedWebDriver driver;

     @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        
            driver = getDriver();
        
    }

    @Test (groups = {} )
    public void WindowsTest() throws Exception {
    
                 driver.findElement("..window..window.2...group..group.5...button.2.").waitForEnabled(); 
                 CommonStep.click("..window..window.2...group..group.5...button.2."); 
                 driver.findElement("..window..window.2...group..group.4...button.4.").waitForEnabled(); 
                 CommonStep.click("..window..window.2...group..group.4...button.4."); 
                 driver.findElement("..window..window.2...group..group.5...button.9.").waitForEnabled(); 
                 CommonStep.click("..window..window.2...group..group.5...button.9."); 
                 driver.findElement("..window..window.2...group..group.4...button.5.").waitForEnabled(); 
                 CommonStep.click("..window..window.2...group..group.4...button.5."); 
                 driver.findElement("xpath..Window.Window.2..Group.Text.2.").verifyText("Display is 9"); 
    }

}

