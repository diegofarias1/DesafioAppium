package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VideoTests extends TestBase {
    HomePage homePage;
    MenuPage menuPage;
    CameraPage cameraPage;
    NativeComponentsPage nativeComponentsPage;
    VideoPlayerPage videoPlayerPage;

    @Test
    public void verificarFuncionamentoVideo() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        cameraPage = new CameraPage();
        videoPlayerPage = new VideoPlayerPage();

        nativeComponentsPage = new NativeComponentsPage();

        homePage.clickMenu();
        menuPage.clickNativeComponentes();
        nativeComponentsPage.clickSubMenuImgCollection();
        nativeComponentsPage.clickSubMenuContentScrolling();
        nativeComponentsPage.clickSubMenuVideoPlayer();
        videoPlayerPage.videoIsDisplayed();
        Assert.assertTrue(videoPlayerPage.videoIsDisplayed());
    }
}