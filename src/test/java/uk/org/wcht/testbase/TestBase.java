package uk.org.wcht.testbase;

import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.org.wcht.basepage.BasePage;
import uk.org.wcht.browserSelector.BrowserSelector;
import uk.org.wcht.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

//test base class extends with base page class
public class TestBase extends BasePage {
    //object creation for browser selector
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @BeforeMethod(groups = {"sanity","smoke","regression"})
    //opening browser
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().setPosition(new Point(2000, 0));//display into second screen
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    //after method of testNG
    @AfterMethod(groups = {"regression"})

    public void tearDown() {
        //browser closing
        driver.quit();


    }
}

