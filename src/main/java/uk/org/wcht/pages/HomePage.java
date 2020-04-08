package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {
    //locator defines for web elements
    By yourHomeFeature = By.className("header__nav-area-title");
    By clickOnYourAccount = By.xpath("//div[contains(text(),'Your account')]");


    //below method created for each elements and doing actions on each elements
    public void clickOnYourHomeFeature() {
        clickOnElement(yourHomeFeature);
    }

    public void setClickOnYourAccount() {
        clickOnElement(clickOnYourAccount);
    }
}

