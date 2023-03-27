package Utils;

import PageEvents.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FetchElements {
    public WebElement getElement(String locator, String locatorValue) {
        switch (locator) {
            case "ID":
                return BaseClass.driver.findElement(By.id(locatorValue));
            case "CSS":
                return BaseClass.driver.findElement(By.cssSelector(locatorValue));
            case "TAGNAME":
                return BaseClass.driver.findElement(By.tagName(locatorValue));
            case "XPATH":
                return BaseClass.driver.findElement(By.xpath(locatorValue));
            default:
                return null;

        }
    }
    public List<WebElement> getListOfElements(String locator, String locatorValue) {
        switch (locator) {
            case "ID":
                return BaseClass.driver.findElements(By.id(locatorValue));
            case "CSS":
                return BaseClass.driver.findElements(By.cssSelector(locatorValue));
            case "TAGNAME":
                return BaseClass.driver.findElements(By.tagName(locatorValue));
            case "XPATH":
                return BaseClass.driver.findElements(By.xpath(locatorValue));
            default:
                return null;

        }
    }
}
