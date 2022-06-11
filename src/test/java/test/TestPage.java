package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class TestPage extends BaseTest {
    TestHome testHome;
    TestInventory testInventory;
    TestCard testCard;
    TestCheckoutOne testCheckoutOne;
    TestCheckoutTwo testCheckoutTwo;
    TestCheckoutComplete testCheckoutComplete;

    @Before
    public void setUpTest(){
        testHome = new TestHome();
        testInventory = new TestInventory();
        testCard = new TestCard();
        testCheckoutOne = new TestCheckoutOne();
        testCheckoutTwo = new TestCheckoutTwo();
        testCheckoutComplete = new TestCheckoutComplete();
    }
    @Test
    public void loginPage(){
        testHome.typeUserNameField("standard_user");
        testHome.typePasswordField("secret_sauce");
        testHome.clickLoginButton();
        Assert.assertTrue(testInventory.titleSelectIsDisplay());
        Assert.assertEquals("PRODUCTS", testInventory.titleSelectIsGet());
        testInventory.clickMenuButton();
        testInventory.clickLogoutButton();
    }
    @Test
    public void lockedUser(){
        testHome.typeUserNameField("locked_out_user");
        testHome.typePasswordField("secret_sauce");
        testHome.clickLoginButton();
        Assert.assertTrue(testHome.lockedUserIsDisplay());
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", testHome.lockedUserIsGetText());
        testHome.clickExitLockedMess();
    }
    @Test
    public void problemUser(){
        testHome.typeUserNameField("problem_user");
        testHome.typePasswordField("secret_sauce");
        testHome.clickLoginButton();
        Assert.assertTrue(testInventory.addToCardButtonIsDisplay());
        Assert.assertEquals("ADD TO CART", testInventory.addToCardButtonIsText());
        testInventory.clickAddToCardButton();
        Assert.assertTrue(testInventory.removeButtonIsDisplay());
        Assert.assertEquals("REMOVE", testInventory.removeButtonIsText());
        testInventory.clickRemoveButton();
        Assert.assertTrue(testInventory.addToCardButtonIsDisplay());
        Assert.assertEquals("ADD TO CART", testInventory.addToCardButtonIsText());
    }
    @Test
    public void shopingUser(){
        testHome.typeUserNameField("standard_user");
        testHome.typePasswordField("secret_sauce");
        testHome.clickLoginButton();
        testInventory.clickAddToCardButton();
        testInventory.clickCardButton();
        testCard.clickCheckoutButton();
        testCheckoutOne.inputFirstNameField("Lidija");
        testCheckoutOne.inputLastNameField("Matic");
        testCheckoutOne.inputPostalCodeField("26232");
        testCheckoutOne.clickContinueButton();
        js.executeScript("window.scrollBy(0,200)");
        testCheckoutTwo.clickFinishButton();
        js.executeScript("window.scrollBy(0,-200)");
        Assert.assertTrue(testCheckoutComplete.completeHeaderTextIsDisplay());
        Assert.assertEquals("THANK YOU FOR YOUR ORDER", testCheckoutComplete.completeHeaderTextIsGet());

    }

}
