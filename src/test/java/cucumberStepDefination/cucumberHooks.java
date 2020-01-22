package cucumberStepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class cucumberHooks {


    @Before
    public void before(){
        System.out.println("before hook");
    }

    @After
    public void after(){
        System.out.println("after");
    }
}
