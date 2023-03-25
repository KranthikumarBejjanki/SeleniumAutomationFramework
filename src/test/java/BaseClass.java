import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    @BeforeTest
    public void beforeTestMethod(){

    }

    @BeforeMethod
    @Parameters(value = {"browserName"})
    public void beforeMethodMethod(String browserName){
    setUpDriver(browserName);
    driver.manage().window().maximize();
    driver.get(Constants.url);
    }

    @AfterMethod
    public void afterMethodMethod(){
    driver.quit();
    }

    @AfterTest
    public void afterTestMethod(){

    }

    public void setUpDriver(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Drivers"+"chromedriver.exe");
        driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"Drivers"+"geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Drivers"+"chromedriver.exe");
            driver = new ChromeDriver();
        }
    }
}
