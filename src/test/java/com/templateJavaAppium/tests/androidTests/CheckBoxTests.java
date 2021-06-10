package com.templateJavaAppium.tests.androidTests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.InputPages.CheckBoxPage;
import com.templateJavaAppium.pages.InputPages.InputControlPage;
import com.templateJavaAppium.pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends TestBase {
    CheckBoxPage checkBoxPage;
    HomePage homePage;
    MenuPage menuPage;
    InputControlPage inputControlPage;

    @Test
    public void shouldVefifyCheckBoxAble() {
        checkBoxPage = new CheckBoxPage();
        homePage = new HomePage();
        menuPage = new MenuPage();
        inputControlPage = new InputControlPage();

        homePage.clickMenu();
        menuPage.clickInputControls();
        inputControlPage.clickTextField();
        inputControlPage.clickCheckBox();
        checkBoxPage.clickCheckBox();

        Assert.assertEquals("Checked", checkBoxPage.getCheckBoxDisplay());
    }

    @Test
    public void shouldVefifyCheckBoxDisable() {
        checkBoxPage = new CheckBoxPage();
        homePage = new HomePage();
        menuPage = new MenuPage();
        inputControlPage = new InputControlPage();

        homePage.clickMenu();
        menuPage.clickInputControls();
        inputControlPage.clickTextField();
        inputControlPage.clickCheckBox();

        Assert.assertEquals("Unchecked", checkBoxPage.getCheckBoxDisplay());
    }
}
