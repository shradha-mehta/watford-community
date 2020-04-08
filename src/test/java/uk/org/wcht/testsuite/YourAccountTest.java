package uk.org.wcht.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.pages.MyAccountPage;
import uk.org.wcht.testbase.TestBase;

public class YourAccountTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();


    @Test
    public void verifyUserShouldNavigateToYourAccountPage(){
        //below methods calling from pages package
        homePage.setClickOnYourAccount();
        //compare expected with actual result
        String expectedResult = "My Account";
        String actualResult = myAccountPage.getMyAccountMessage();
        Assert.assertEquals(expectedResult,actualResult);

    }
}

