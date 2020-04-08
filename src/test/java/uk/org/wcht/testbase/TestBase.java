package uk.org.wcht.testbase;

import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.org.wcht.basepage.BasePage;
import uk.org.wcht.browserSelector.BrowserSelector;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    //object creation for browser selector
    BrowserSelector browserSelector = new BrowserSelector();
    //URL for watford community
    String baseUrl = "https://www.wcht.org.uk/";

    @BeforeMethod
    //opening browser
    public void openBrowser() {
        browserSelector.selectBrowser("chrome");
        driver.manage().window().setPosition(new Point(2000, 0));//display into second screen
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    //after method of testNG
    @AfterMethod

    public void tearDown() {
        //browser closing
        driver.quit();


    }
}

