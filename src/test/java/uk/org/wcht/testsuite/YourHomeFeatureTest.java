package uk.org.wcht.testsuite;

import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

public class YourHomeFeatureTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToYourHomeFeature() {
        //below methods calling from pages package
        homePage.clickOnYourHomeFeature();


    }

}

