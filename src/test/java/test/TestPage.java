package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.TestHome;
import page.TestInventory;

public class TestPage extends BaseTest {
    TestHome testHome;
    TestInventory testInventory;



    @Before
    public void setUpTest(){
        testHome = new TestHome();
        testInventory = new TestInventory();


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

}
