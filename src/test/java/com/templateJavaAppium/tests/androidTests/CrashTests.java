package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.CrashPage;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrashTests extends TestBase {
    CrashPage crashPage;
    MenuPage menuPage;
    HomePage homePage;

    @Test
    public void reabrirAppAlertCrash() {

        crashPage = new CrashPage();
        menuPage = new MenuPage();
        homePage = new HomePage();
        homePage.clickMenu();

        crashPage.clickCrashBugBtn();
        crashPage.clickButtonCrash();
        crashPage.clickButtonCrashAlert();
        Assert.assertEquals("AWS Device Farm Sample App for Android", homePage.getTextHome());
    }
}
