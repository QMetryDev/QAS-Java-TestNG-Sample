/**
* @author: nidhi.shah
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
import com.qmetry.qaf.automation.core.ConfigurationManager;

import java.util.List;
import java.util.Map;

public class VerifyCreditedAmount extends WebDriverTestCase {

    private QAFExtendedWebDriver driver;
    private String baseUrl = "https://qas.qmetry.com/bank";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String username = "Bob";
    String password = "Bob";
    String amountToBeCredited;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {

        driver = getDriver();

    }

    /**
     * Test method to verify successful credit transaction
     * 
     * @param data : data of transactionData.csv file
     * @throws Exception
     */
    @Test(dataProvider = "csvdataprovider")
    public void VerifyCreditedAmountTest(Object credit, Object debit) throws Exception {

        // Get amount to be credited from datafile
        amountToBeCredited = credit.toString();

        // Navigate to URL
        driver.get(baseUrl);

        // Maximize window
        driver.manage().window().maximize();

        // Login
        CommonStep.clear("text.txtusername");
        CommonStep.sendKeys(username, "text.txtusername");
        CommonStep.clear("password.txtpassword");
        CommonStep.sendKeys(password, "password.txtpassword");
        driver.findElement("button.btnlogin").waitForEnabled();
        CommonStep.click("button.btnlogin");

        // Assert - Successfull login
        CommonStep.assertVisible("button.button");

        // Get the value of current balance
        CommonStep.getText("strong.usergloberank");
        CommonStep.storeLastStepResultInto("currentBalance");

        // Credit the amount
        CommonStep.waitForEnabled("number.enteramountforcredit", 3);
        CommonStep.clear("number.enteramountforcredit");
        CommonStep.sendKeys(amountToBeCredited, "number.enteramountforcredit");
        driver.findElement("button.button11").waitForEnabled();
        CommonStep.click("button.button11");

        // Assert - Amount have been credited
        CommonStep.assertText("strong.usergloberank", updatedValue(amountToBeCredited));

        // Logout
        driver.findElement("button.button").waitForEnabled();
        CommonStep.click("button.button");

        // Assert - Successful logout
        CommonStep.assertVisible("button.btnlogin");
    }

    /**
     * Update the value of current balance
     * 
     * @param amountToBeCredited : Amount to be added into current balance
     * @return
     */
    public String updatedValue(String amountToBeCredited) {
        int currentBalance = Integer
                .parseInt(ConfigurationManager.getBundle().getProperty("currentBalance").toString().split(" ")[1]);
        currentBalance = currentBalance + Integer.parseInt(amountToBeCredited);
        return "$ " + currentBalance;
    }

    @DataProvider(name = "csvdataprovider")
    public Object[][] qasDataProvider() {
        List<Object[]> csvData = CSVUtil.getCSVData("resources/web/TransactionData.csv");
        csvData.remove(0);
        return csvData.toArray(new Object[csvData.size()][]);
    }

}
