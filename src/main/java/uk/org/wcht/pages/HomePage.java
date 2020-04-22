package uk.org.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    //locator defines for web elements
    //By yourHomeFeature = By.className("header__nav-area-title");
    //By clickOnYourAccount = By.xpath("//div[contains(text(),'Your account')]");

    @FindBy(className = "header__nav-area-title")
    WebElement _yourHomeFeature;

    @FindBy(xpath = "//div[contains(text(),'Your account')]")
    WebElement _clickOnYourAccount;


    //below method created for each elements and doing actions on each elements
    public void clickOnYourHomeFeature() {
        Reporter.log("Clicking on login link : " + _yourHomeFeature.toString() + "<br>");
        clickOnElement(_yourHomeFeature);
        log.info("Clicking on login link : " + _yourHomeFeature.toString());
    }

    public void setClickOnYourAccount() {
        Reporter.log("Clicking on login link : " + _clickOnYourAccount.toString() + "<br>");

        clickOnElement(_clickOnYourAccount);
        log.info("Clicking on login link : " + _clickOnYourAccount.toString());
    }
}

