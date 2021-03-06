package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.CameraPage;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.NativeComponentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CameraTests extends TestBase {
    HomePage homePage;
    MenuPage menuPage;
    CameraPage cameraPage;
    NativeComponentsPage nativeComponentsPage;

    @Test
    public void ShouldVerifyOpenCamera() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        cameraPage = new CameraPage();
        nativeComponentsPage = new NativeComponentsPage();

        homePage.clickMenu();
        menuPage.clickNativeComponentes();
        nativeComponentsPage.clickSubMenuImgCollection();
        nativeComponentsPage.clickSubMenuContentScrolling();
        nativeComponentsPage.clickSubMenuVideoPlayer();
        nativeComponentsPage.clickSubMenuCamera();
        cameraPage.cameraIsDisplayed();
        cameraPage.waitCamera();
        Assert.assertTrue(cameraPage.cameraIsDisplayed());
    }
}
