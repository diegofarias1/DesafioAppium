package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.LocalWebViewPage;
import com.templateJavaAppium.pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalWebTests extends TestBase {
    HomePage homePage;
    MenuPage menuPage;
    LocalWebViewPage localWebViewPage;

    @Test
    public void ShouldInsertFirstAndLastName() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        localWebViewPage = new LocalWebViewPage();

        String firstName = "Diego";
        String lastName = "Farias";

        homePage.clickMenu();
        menuPage.clickLocalWebView();

        localWebViewPage.sendFirstName(firstName);
        localWebViewPage.sendLastName(lastName);
        localWebViewPage.getNamesInserts();


        Assert.assertTrue(localWebViewPage.getNamesInserts().contains("Hello!"));
        // Assert.assertEquals("Hello! Diego Farias", localWebViewPage.getNamesInserts());

    }
}
