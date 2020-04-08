package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class MyAccountPage extends Utility {
    //locators for element
    By getTextMyAccount = By.xpath("//div[@class='panel-heading']");

    //below methods for elements and doing actions on that each elements
    public String getMyAccountMessage() {
        return getTextFromElement(getTextMyAccount);
    }
}


