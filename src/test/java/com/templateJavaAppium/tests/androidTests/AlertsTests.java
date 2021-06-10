package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.AlertsPage;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.WebPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AlertsTests extends TestBase {
    private HomePage homePage;
    private MenuPage menuPage;
    private AlertsPage alertsPage;

    @Test
    public void ShouldValidateAlertMessege() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        alertsPage = new AlertsPage();

        homePage.clickMenu();
        menuPage.clickAlerts();
        alertsPage.clickAlert();
        alertsPage.returnMessageText();
        Assert.assertEquals("This is the alert message", alertsPage.returnMessageText());
        alertsPage.clickOkAlert();
    }
}
