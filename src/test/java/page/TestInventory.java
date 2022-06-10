package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestInventory extends BaseTest {
    public TestInventory(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;
    @FindBy(css = ".title")
    WebElement titleSelect;

    public boolean titleSelectIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(titleSelect));
        return titleSelect.isDisplayed();
    }
    public String titleSelectIsGet(){
        wdwait.until(ExpectedConditions.elementToBeClickable(titleSelect));
        return titleSelect.getText();
    }
    public void clickLogoutButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }

    public void clickMenuButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(menuButton));
        menuButton.click();
    }
}
