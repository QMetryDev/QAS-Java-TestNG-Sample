/**
* @author: rinkesh.jain
*
*/
package tests.web.testsuitetestng;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.WsStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.Validator;
import com.qmetry.qaf.automation.util.CSVUtil;
import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.util.List;
import java.util.Map;



 

public class WebTestng extends WebDriverTestCase {

    private QAFExtendedWebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        
            driver = getDriver();
        
    }

    @Test(dataProvider = "csvdataprovider")
    public void WebTestngTest(Object data1, Object data2, Object password) throws Exception {
    
                 driver.get("https://www.gmail.com"); 
                 CommonStep.clear("email.identifierid"); 
                 CommonStep.sendKeys("demoqas2019@gmail.com","email.identifierid"); 
                 driver.findElement("div.div2111").waitForEnabled(); 
                 CommonStep.click("div.div2111"); 
                 driver.findElement("email.identifierid").verifyValue("demoqas2019@gmail.com"); 
                 driver.findElement("span.span1111").waitForEnabled(); 
                 CommonStep.click("span.span1111"); 
                 CommonStep.clear("password.test"); 
                 CommonStep.sendKeys(String.valueOf(password),"password.test"); 
                 driver.findElement("div.div111").waitForEnabled(); 
                 CommonStep.click("div.div111"); 
                 driver.findElement("password.test").verifyValue(String.valueOf(password)); 
                 driver.findElement("span.span1111_1").waitForEnabled(); 
                 CommonStep.click("span.span1111_1"); 
    }

    @DataProvider(name = "csvdataprovider")
    public Object[][] qasDataProvider() {
        List<Object[]> csvData = CSVUtil.getCSVData("resources/testdata/testng.csv");
        csvData.remove(0);
        return csvData.toArray(new Object[csvData.size()][]);
    }

}
