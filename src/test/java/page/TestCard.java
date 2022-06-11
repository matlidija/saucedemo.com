package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestCard extends BaseTest {
    public TestCard(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public void clickCheckoutButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        checkoutButton.click();
    }
}
