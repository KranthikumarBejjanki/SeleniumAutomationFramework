package PageEvents;

import PageObjects.LoginPageElements;
import Utils.FetchElements;
import org.testng.Assert;

public class LoginPageEvents {
    FetchElements elements = new FetchElements();

    public void verifyIfLoginPageOpenedOrNot() {
        int size = elements.getListOfElements("XPATH", LoginPageElements.signInText).size();
        Assert.assertTrue(size > 0, "login page not opened");
    }

    public void enterEmailId() {
        elements.getElement("ID", LoginPageElements.emailAddress).sendKeys("kranthi@gmail.com");
    }
}
