package uk.org.wcht.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.pages.MyAccountPage;
import uk.org.wcht.testbase.TestBase;

//your account test extends with test base class
public class YourAccountTest extends TestBase {
    //object created
    HomePage homePage;
    MyAccountPage myAccountPage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
    }


    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToYourAccountPage(){
        //below methods calling from pages package
        homePage.setClickOnYourAccount();
        //compare expected with actual result
        String expectedResult = "My Account";
        String actualResult = myAccountPage.getMyAccountMessage();
        Assert.assertEquals(expectedResult,actualResult);

    }
}

