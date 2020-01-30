package cucumberStepDefination;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.reporters.Files;

import java.io.File;
import java.util.*;


public class sampleTestDefination extends baseTest {

    @Given("^user navigates to SOFTWARETETINGHELP\\.COM$")
    public void user_navigates_to_SOFTWARETETINGHELP_COM() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("fddaf");
       String jsonData = Files.readFile(new File("src/main/resources/testData.json"));
       Gson gson= new Gson();
       List<LinkedTreeMap<String,String>> testmap= gson.fromJson(jsonData,List.class);
       System.out.println(testmap.get(0).get("album").toString());
       testmap.forEach(item->{
           System.out.println(item.get("album"));
       });

        driver.navigate().to("https://www.google.com/");
        sampleWebPage.enterText();
    }

  /*  @When("^user logs in using Username as anupam and Password sinha$")
    public void user_logs_in_using_Username_as_anupam_and_Password_sinha(String Username, String Password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println(Username);
        System.out.println(Password);


    }
*/

   /* @When("^user logs in using Username as “USER” and Password “PASSWORD”$")
    public void user_logs_in_using_Username_as_USER_and_Password_PASSWORD() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("fddaf2");

    }
*/

    @When("^user logs in using Username as \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_logs_in_using_Username_as_and_Password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println(arg1);
        System.out.println(arg2);
    }
    @Then("^login should be successful$")
    public void login_should_be_successful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("fddaf3");

    }


}
