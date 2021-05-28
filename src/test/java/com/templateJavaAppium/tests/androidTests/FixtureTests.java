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
    public void verificarStatusNFC() {

        String status = "true|false";
        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertTrue(fixturePage.getStatusNFC().matches(status));

    }

    @Test
    public void verificarStatusBlutooth() {

        String status = "true|false";

        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();
        homePage.clickMenu();
        menuPage.clickFixtures();

        Assert.assertTrue(fixturePage.getBluetooth().matches(status));

    }

    @Test
    public void verificaValorLat() {

        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertEquals(fixturePage.getValueLat(), fixturePage.getValueLat());
    }

    @Test
    public void verificarStatusWiFi() {

        String status = "true|false";
        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertTrue(fixturePage.getWiFi().matches(status));
    }

    @Test
    public void verificaValorLog() {

        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertEquals(fixturePage.getValueLong(), fixturePage.getValueLong());
    }

    @Test
    public void verificarStatusGps() {

        String status = "true|false";

        fixturePage = new FixturePage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertTrue(fixturePage.getStatusGps().matches(status));
    }
}
