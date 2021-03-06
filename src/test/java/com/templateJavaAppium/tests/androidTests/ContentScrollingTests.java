package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.ContentScrollingPage;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.NativeComponentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentScrollingTests extends TestBase {
    HomePage homePage;
    MenuPage menuPage;
    ContentScrollingPage contentScrollingPage;
    NativeComponentsPage nativeComponentsPage;

    @Test
    public void shouldViewScrollSucess() {

        homePage = new HomePage();
        menuPage = new MenuPage();
        contentScrollingPage = new ContentScrollingPage();
        nativeComponentsPage = new NativeComponentsPage();

        homePage.clickMenu();
        menuPage.clickNativeComponentes();
        nativeComponentsPage.clickSubMenuImgCollection();
        nativeComponentsPage.clickSubMenuContentScrolling();
        contentScrollingPage.waitScrollDisplayed();
        contentScrollingPage.scrollDown();
        Assert.assertTrue(contentScrollingPage.scrollViewDisplayed());

    }

}