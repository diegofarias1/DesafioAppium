package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHomeTest extends TestBase {
    HomePage homePage;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @Test
    public void ShouldAcessAppSucessfull() {
        homePage = new HomePage();
        Assert.assertEquals("AWS Device Farm Sample App for Android", homePage.returnTextHomePage());
    }

    @Test
    public void ShouldVerifyVersionApp() {
        homePage = new HomePage();
        Assert.assertEquals("version 1", homePage.returnVersionApp());
    }
}
