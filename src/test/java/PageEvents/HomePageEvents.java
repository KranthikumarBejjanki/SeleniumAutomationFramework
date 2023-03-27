package PageEvents;

import PageObjects.HomePageElements;
import Utils.FetchElements;

public class HomePageEvents {
    public void clickOnSignInButton(){

        FetchElements elements = new FetchElements();
        elements.getElement("XPATH", HomePageElements.signInButton).click();

    }
}
