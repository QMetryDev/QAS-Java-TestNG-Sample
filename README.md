# Java TestNG

### To Get Started

#### Pre-requisites
1.JAVA installed globally in the system.

2.Chrome or Firefox browsers installed.

3.TestNG installed in system.

4.MAVEN installed in system.

5.Compatible chromedriver path should be set in your system and in application.properties file if it is present in your project folder for command line execution.
#### About
* This is sample project with Maven directory structure:
* The 'config' directory contains testng.xml file, and is a place holder for configuration files.
* The 'resources' directory contains all required resources including properties files and data files, and is a place holder for other resources.
* inside `application.properties : `

	   step.provider.pkg : steps.${platform} for generating package according to platform
	   webdriver.chrome.driver = <CHROMEDRIVE_PATH> give chromedriver.exe path, placed in your directory
	   env.baseurl=<BASE_URL> use bydefault URL for testing

* The 'src' directory contains all java files and is a place holder for other java files.
* The 'test-results' directory contains result files.

#### run the test
* To change/modify dependencies
  ```
  check pom.xml
  ```
* To run the project from command prompt, go to project home.
	```
	 mvn clean
	 mvn test
	 ```
* To run project using Tags :
	```
	 mvn test -Dgroups=tag1,tag2
	 ```

#### View Results.
	Open dashboard.htm

```Note: ```This sample project uses chrome driver and it requires chrome driver binary.
You need to download and set webdriver.chrome.driver property in application.properties file with driver binary path.


#### Integrate with QTM
Please refer https://github.com/qmetry/qmetry-test-management-maven-plugin
