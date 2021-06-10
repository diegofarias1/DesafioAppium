package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FixtureTests extends TestBase {
    FixturePage fixturePage;
    HomePage homePage;
    MenuPage menuPage;

    @Test
    public void shouldVerifyStatusNFC() {

        String status = "true|false";
        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertTrue(fixturePage.getStatusNFC().matches(status));

    }

    @Test
    public void shouldVerifyStatusBlutooth() {

        String status = "true|false";

        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();
        homePage.clickMenu();
        menuPage.clickFixtures();

        Assert.assertTrue(fixturePage.getBluetooth().matches(status));

    }

    @Test
    public void shouldVerifyLatitudeValue() {

        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertEquals(fixturePage.getValueLat(), fixturePage.getValueLat());
    }

    @Test
    public void shouldVerifyStatusInternet() {

        String status = "true|false";
        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertTrue(fixturePage.getWiFi().matches(status));
    }

    @Test
    public void shouldVerifyLongValue() {

        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertEquals(fixturePage.getValueLong(), fixturePage.getValueLong());
    }

    @Test
    public void shouldVerifyStatusGPS() {

        String status = "true|false";

        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertTrue(fixturePage.getStatusGps().matches(status));
    }
}
