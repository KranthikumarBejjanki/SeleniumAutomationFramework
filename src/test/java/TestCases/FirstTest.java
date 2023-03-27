package TestCases;

import PageEvents.BaseClass;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import PageObjects.LoginPageElements;
import org.testng.annotations.Test;

public class FirstTest extends BaseClass {

    @Test
    public void emailEntering(){
        HomePageEvents HomeEvents = new HomePageEvents();
        HomeEvents.clickOnSignInButton();
        LoginPageEvents LoginEvents = new LoginPageEvents();
        LoginEvents.enterEmailId();
    }
}
