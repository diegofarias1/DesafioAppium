package com.templateJavaAppium.flows;

import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.LoginPage;
import com.templateJavaAppium.pages.MenuPage;


public class LoginFlows {
    private LoginPage loginPage;
    private HomePage homePage;
    private MenuPage menuPage;

    public LoginFlows() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        loginPage = new LoginPage();
    }

    public void goToLoginPage() {
        homePage.clickMenu();
        menuPage.clickLoginMenu();

    }

    public String login(String username, String password) {
        loginPage.username(username);
        loginPage.password(password);
        loginPage.clickLogin();
        return loginPage.getMessageText();
    }
}

