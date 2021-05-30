package com.templateJavaAppium.tests.androidTests;


import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.InputPages.TextFieldPage;
import com.templateJavaAppium.pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TextFieldTests extends TestBase {
    TextFieldPage textFieldPage;
    HomePage homePage;
    MenuPage menuPage;

    @Test
    public void inserirtexto() {
        String text = "Diego";
        textFieldPage = new TextFieldPage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickInputControls();
        textFieldPage.sendText(text);

        Assert.assertEquals("Diego", textFieldPage.verificarTexto());
    }

    @Test
    public void verificarCampoVazio() {

        textFieldPage = new TextFieldPage();
        homePage = new HomePage();
        menuPage = new MenuPage();

        homePage.clickMenu();
        menuPage.clickInputControls();

        Assert.assertEquals("Enter Text", textFieldPage.verificarTexto());
    }
}

