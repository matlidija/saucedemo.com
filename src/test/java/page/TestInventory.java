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
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCardButton;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeButton;
    @FindBy(css = ".shopping_cart_link")
    WebElement cardButton;

    public void clickCardButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(cardButton));
        cardButton.click();
    }

    public void clickRemoveButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(removeButton));
        removeButton.click();
    }

    public boolean removeButtonIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(removeButton));
        return removeButton.isDisplayed();
    }

    public String removeButtonIsText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(removeButton));
        return removeButton.getText();
    }

    public void clickAddToCardButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(addToCardButton));
        addToCardButton.click();
    }
    public boolean addToCardButtonIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(addToCardButton));
        return addToCardButton.isDisplayed();
    }
    public String addToCardButtonIsText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(addToCardButton));
        return addToCardButton.getText();
    }

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
