package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.ContentOutViewPage;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.NativeComponentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentOutViewTest extends TestBase {
    HomePage homePage;
    MenuPage menuPage;
    NativeComponentsPage nativeComponentsPage;
    ContentOutViewPage contentOutViewPage;

        @Test
        public void ShouldVisibleFrame() {

            homePage = new HomePage();
            menuPage = new MenuPage();
            nativeComponentsPage = new NativeComponentsPage();
            contentOutViewPage = new ContentOutViewPage();

            homePage.clickMenu();
            menuPage.clickNativeComponentes();
            nativeComponentsPage.clickSubMenuImgCollection();
            nativeComponentsPage.clickSubMenuContentScrolling();
            nativeComponentsPage.clickSubMenuVideoPlayer();
            nativeComponentsPage.clickSubMenuCamera();
            nativeComponentsPage.clickSubMenuContentOutView();
            contentOutViewPage.frameIsDisplayed();
            contentOutViewPage.waitFrameCarregar();

            contentOutViewPage.waitFrameCarregar();
            Assert.assertTrue(contentOutViewPage.hiddenTextIsDisplayed());

        }

        @Test
        public void ShouldVerifyHiddenText() {

            homePage = new HomePage();
            menuPage = new MenuPage();
            nativeComponentsPage = new NativeComponentsPage();
            contentOutViewPage = new ContentOutViewPage();

            homePage.clickMenu();
            menuPage.clickNativeComponentes();
            nativeComponentsPage.clickSubMenuImgCollection();
            nativeComponentsPage.clickSubMenuContentScrolling();
            nativeComponentsPage.clickSubMenuVideoPlayer();
            nativeComponentsPage.clickSubMenuCamera();
            nativeComponentsPage.clickSubMenuContentOutView();
            contentOutViewPage.hiddenTextIsDisplayed();

            Assert.assertTrue(contentOutViewPage.hiddenTextIsDisplayed());

        }
    }