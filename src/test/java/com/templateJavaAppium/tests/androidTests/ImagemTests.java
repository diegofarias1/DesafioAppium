package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class ImagemTests extends TestBase {
    ImageCollectionPage imageCollectionPage;
    HomePage homePage;
    MenuPage menuPage;
    NativeComponentsPage nativeComponentsPage;

    @Test
    public void checkIImageGalleryDisplayed() {

        homePage = new HomePage();
        imageCollectionPage = new ImageCollectionPage();
        menuPage = new MenuPage();
        nativeComponentsPage = new NativeComponentsPage();

        homePage.clickMenu();
        menuPage.clickNativeComponentes();
        nativeComponentsPage.clickSubMenuImgCollection();
        imageCollectionPage.waitImagemCarregar();

        imageCollectionPage.imageGalleryIsDisplayed();
        Assert.assertTrue(imageCollectionPage.imageGalleryIsDisplayed());
    }
}