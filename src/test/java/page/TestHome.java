package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestHome extends BaseTest {
    public TestHome(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "user-name")
    WebElement userNameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(css = "*[data-test=\"error\"]")
    WebElement lockedUser;
    @FindBy(css = ".fa-times > path")
    WebElement exitLockedMess;

    public void clickExitLockedMess(){
        wdwait.until(ExpectedConditions.elementToBeClickable(exitLockedMess));
        exitLockedMess.click();
    }

    public boolean lockedUserIsDisplay(){
        wdwait.until(ExpectedConditions.elementToBeClickable(lockedUser));
        return lockedUser.isDisplayed();
    }
    public String lockedUserIsGetText(){
        wdwait.until(ExpectedConditions.elementToBeClickable(lockedUser));
        return lockedUser.getText();
    }

    public void clickLoginButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public void typeUserNameField(String username){
     wdwait.until(ExpectedConditions.elementToBeClickable(userNameField));
     userNameField.clear();
     userNameField.sendKeys(username);
    }
    public void typePasswordField(String password){
        wdwait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }


}
