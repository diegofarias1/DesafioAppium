package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.InputPages.InputControlPage;
import com.templateJavaAppium.pages.InputPages.RadioButtonsPage;
import com.templateJavaAppium.pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioTests extends TestBase {
    RadioButtonsPage radioButtonsPage;
    HomePage homePage;
    MenuPage menuPage;
    InputControlPage inputControlPage;


    @Test
    public void shouldCheckRadioAmazon() {
        radioButtonsPage = new RadioButtonsPage();
        homePage = new HomePage();
        menuPage = new MenuPage();
        inputControlPage = new InputControlPage();

        homePage.clickMenu();
        menuPage.clickInputControls();
        inputControlPage.clickTextField();
        inputControlPage.clickCheckBox();
        inputControlPage.clickRadioButtons();
        radioButtonsPage.clickRadioAmazon();
        Assert.assertEquals(radioButtonsPage.getRadioText(), "Amazon");
    }

    @Test
    public void shouldCheckRadioWeb() {
        radioButtonsPage = new RadioButtonsPage();
        homePage = new HomePage();
        menuPage = new MenuPage();
        inputControlPage = new InputControlPage();

        homePage.clickMenu();
        menuPage.clickInputControls();
        inputControlPage.clickTextField();
        inputControlPage.clickCheckBox();
        inputControlPage.clickRadioButtons();
        radioButtonsPage.clickRadioWeb();
        Assert.assertEquals(radioButtonsPage.getRadioText(), "Web");
    }

    @Test
    public void shouldCheckRadioServices() {
        radioButtonsPage = new RadioButtonsPage();
        homePage = new HomePage();
        menuPage = new MenuPage();
        inputControlPage = new InputControlPage();

        homePage.clickMenu();
        menuPage.clickInputControls();
        inputControlPage.clickTextField();
        inputControlPage.clickCheckBox();
        inputControlPage.clickRadioButtons();
        radioButtonsPage.clickRadioServices();
        Assert.assertEquals(radioButtonsPage.getRadioText(), "Services");
    }
}