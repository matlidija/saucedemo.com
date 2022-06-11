package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestCheckoutOne extends BaseTest {
    public TestCheckoutOne(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "first-name")
    WebElement firstNameField;
    @FindBy(id = "last-name")
    WebElement lastNameField;
    @FindBy(css = "*[data-test=\"postalCode\"]")
    WebElement postalCodeField;
    @FindBy(css = "*[data-test=\"continue\"]")
    WebElement continueButton;

    public void clickContinueButton(){
        wdwait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }
    public void inputPostalCodeField(String postal){
        wdwait.until(ExpectedConditions.elementToBeClickable(postalCodeField));
        postalCodeField.clear();
        postalCodeField.sendKeys(postal);
    }

    public void inputLastNameField(String lastname){
        wdwait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.clear();
        lastNameField.sendKeys(lastname);
    }
    public void inputFirstNameField(String name){
        wdwait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.clear();
        firstNameField.sendKeys(name);
    }
}
