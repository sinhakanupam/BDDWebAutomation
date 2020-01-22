package cucumberStepDefination;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sampleTestDefination extends baseTest {

    @Given("^user navigates to SOFTWARETETINGHELP\\.COM$")
    public void user_navigates_to_SOFTWARETETINGHELP_COM() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("fddaf");
        driver.navigate().to("https://www.google.com/");
        sampleWebPage.enterText();
    }

    @When("^user logs in using Username as “USER” and Password “PASSWORD”$")
    public void user_logs_in_using_Username_as_USER_and_Password_PASSWORD() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("fddaf2");

    }

    @Then("^login should be successful$")
    public void login_should_be_successful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("fddaf3");

    }


}
