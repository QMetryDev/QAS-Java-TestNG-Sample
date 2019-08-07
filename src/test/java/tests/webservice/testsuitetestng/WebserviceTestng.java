/**
* @author: rinkesh.jain
*
*/
package tests.webservice.testsuitetestng;

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


 

public class WebserviceTestng extends WebDriverTestCase {

    private QAFExtendedWebDriver driver;

     @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        
    }

    @Test
    public void WebserviceTestngTest() throws Exception {
    
                 WsStep.userRequests("GET.struts2.rest.showcase.2.5.18.orders.json"); 
                 WsStep.userRequests("PUT.struts2.rest.showcase.2.5.18.orders.3.json"); 
                 WsStep.responseShouldHaveStatusCode(200); 
                 WsStep.responseShouldHaveHeaderWithValue("Content-Length","4"); 
                 WsStep.userRequests("PUT.struts2.rest.showcase.2.5.18.orders.3.json_1"); 
    }

}
