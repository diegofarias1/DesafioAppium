package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.LoginPage;
import com.templateJavaAppium.pages.ProjetosLoginPage;
import com.templateJavaAppium.utils.DriveFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHomeTest extends TestBase {
    HomePage homePage;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @Test
    public void AcessarAplicativoComSucesso() {
        homePage = new HomePage();
        Assert.assertEquals("AWS Device Farm Sample App for Android", homePage.returnTextHomePage());
    }

    @Test
    public void ShouldVerifiedVersionApp() {
        homePage = new HomePage();
        Assert.assertEquals("version 1", homePage.returnVersionApp());
    }
}
