package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.WebPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTests extends TestBase {
    private HomePage homePage;
    private MenuPage menuPage;
    private WebPage webPage;

    @Test
    public void shouldNavigateWebPage() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        webPage = new WebPage();

        homePage.clickMenu();
        menuPage.clickWeb();
        webPage.returnTitlePage();
        Assert.assertEquals("Web View", webPage.returnTitlePage());

    }

    @Test
    public void shouldNavigateWebPageWithAppBrowser() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        webPage = new WebPage();

        homePage.clickMenu();
        menuPage.clickWeb();
        webPage.acessarWebSite();
        webPage.returnImputAplication();
        Assert.assertEquals("http://www.google.com.br", webPage.returnImputAplication());
    }
}