package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentOutViewTest extends TestBase {
    HomePage homePage;
    MenuPage menuPage;
    NativeComponentsPage nativeComponentsPage;
    ContentOutViewPage contentOutViewPage;

        @Test
        public void visualizarFrame() {

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
        public void visualizarHiddenText() {

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