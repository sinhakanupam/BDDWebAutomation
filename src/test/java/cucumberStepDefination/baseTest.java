package cucumberStepDefination;

import PageObject.SampleWebPage;
import org.openqa.selenium.WebDriver;

public class baseTest {

    public static WebDriver driver;
    public final SampleWebPage sampleWebPage=new SampleWebPage(driver);


    public baseTest(){}

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        baseTest.driver = driver;
    }

    public static void killDriver(){
        baseTest.driver.close();
    }
}
