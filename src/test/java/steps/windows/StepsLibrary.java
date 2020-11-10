package steps.windows;

import com.qmetry.qaf.automation.step.QAFTestStep;
// define desktop based applciation related steps here.
// You can create sub packages to organize the steps within different modules
public class StepsLibrary {
	/**
	 * @param data
	 *                 : data which is being passed from bdd
	 */
	@QAFTestStep(description = "sample step with {0}")
	public static void sampleStep(String data) {
	}
}
