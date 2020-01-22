package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumberStepDefination.baseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(features="src/test/features/", glue = "cucumberStepDefination")
public class runner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void initializeWebDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        baseTest.setDriver(new ChromeDriver());
    }

    @AfterSuite
    public void killInitialization(){
        baseTest.killDriver();
    }

}
