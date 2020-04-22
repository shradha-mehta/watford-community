package uk.org.wcht.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

//your home feature test extends test base class
public class YourHomeFeatureTest extends TestBase {
    //object created
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage();
    }

        @Test(groups = {"regression"})
        public void verifyUserShouldNavigateToYourHomeFeature () {
            //below methods calling from pages package
            homePage.clickOnYourHomeFeature();


        }

    }

