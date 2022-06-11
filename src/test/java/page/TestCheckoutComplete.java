package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestCheckoutComplete extends BaseTest {
    public TestCheckoutComplete(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".complete-header")
    WebElement completeHeaderText;

    public String completeHeaderTextIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(completeHeaderText));
        return completeHeaderText.getText();
    }
    public boolean completeHeaderTextIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(completeHeaderText));
        return completeHeaderText.isDisplayed();
    }
}
