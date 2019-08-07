/**
* @author: rinkesh.jain
*
*/
package tests.windows.testsuitetestng;

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


 

public class WindowsTestng extends WebDriverTestCase {

    private QAFExtendedWebDriver driver;

     @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        
            driver = getDriver();
        
    }

    @Test
    public void WindowsTestngTest() throws Exception {
    
                 driver.findElement("..window..window.2...group..group.6...button.8.").waitForEnabled(); 
                 CommonStep.click("..window..window.2...group..group.6...button.8."); 
                 driver.findElement("..window..window.2...group..group.4...button.2.").waitForEnabled(); 
                 CommonStep.click("..window..window.2...group..group.4...button.2."); 
                 driver.findElement("..window..window.2...group..group.6...button.8.").waitForEnabled(); 
                 CommonStep.click("..window..window.2...group..group.6...button.8."); 
                 driver.findElement("..window..window.2...group..group.4...button.5.").waitForEnabled(); 
                 CommonStep.click("..window..window.2...group..group.4...button.5."); 
                 driver.findElement("xpath..Window.Window.2..Group.Text").verifyText("Display is 49"); 
    }

}
