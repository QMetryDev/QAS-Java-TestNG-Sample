package steps.common;

import static com.qmetry.qaf.automation.ui.webdriver.ElementFactory.$;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
// define common steps among all the platforms.
// You can create sub packages to organize the steps within different modules
public class StepsLibrary {
	/**
	 * @param data : data which is being passed from bdd
	 */
	@QAFTestStep(description = "sample step with {0}")
	public static void sampleStep(String data) {
	}

	@QAFTestStep(description = "sendNumericKeys {number} into {loc}")
	public static void sendKeysInt(Integer number, String loc) {
		$(loc).sendKeys(number.toString());
	}

	@QAFTestStep(description = "store value of {0} into system as {1}")
	public static void storeValueToSystem(String localKey, String systemKey) {
		System.setProperty(systemKey, String.valueOf(ConfigurationManager.getBundle().getObject(localKey)));
	}

	@QAFTestStep(description = "store {0} into system as {1}")
	public static void storeToSystem(String localKey, String systemKey) {
		System.setProperty(systemKey, localKey);
	}

	@QAFTestStep(description = "get value from system {0} into {1}")
	public static void getValueFromSystem(String systemKey, String localKey) {
		ConfigurationManager.getBundle().setProperty(localKey, System.getProperty(systemKey));
	}

	@QAFTestStep(description = "switch to {0} platform")
	public static void switchToPlatform(String platform) {
		ConfigurationManager.getBundle().setProperty("env.resources", "resources/testdata;resources/" + platform);
	}

	@QAFTestStep(description="select {0} in {1}")
	public static void selectIn(String value,String loc) {
		WebElement sel = new WebDriverTestBase().getDriver().findElement(loc);
		Select selectDropDown = new Select(sel);
		selectDropDown.selectByValue(value.split("=")[1]);
	}
	@QAFTestStep(description = "close {loc}")
	public static void close(String loc) {
		new WebDriverTestBase().getDriver().close();
	}

	@QAFTestStep(description = "switchWindow {0}")
	public static void switchWindow(String str0) {
		Set<String> windowHandles = new WebDriverTestBase().getDriver().getWindowHandles();
		List<String> windowStrings = new ArrayList<>(windowHandles);
		String reqWindow = windowStrings.get(Integer.parseInt(str0));
		new WebDriverTestBase().getDriver().switchTo().window(reqWindow);
	}

}
