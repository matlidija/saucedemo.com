package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestCheckoutTwo extends BaseTest {
    public TestCheckoutTwo(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "*[data-test=\"finish\"]")
    WebElement finishButton;

    public void clickFinishButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(finishButton));
        finishButton.click();
    }
}
