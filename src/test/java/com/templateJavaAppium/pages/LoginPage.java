package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
public class LoginPage extends PageBase {


    @AndroidFindBy(xpath = "//android.widget.EditText[@text='username']")
    private MobileElement campoEmail;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @text='password']")

    private MobileElement campoSenha;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='LOGIN']")
    private MobileElement EntrarBtn;

    @AndroidFindBy(accessibility = "Alt Message")
    private MobileElement message;

    public void username(String email) {
        sendKeys(campoEmail, email);
    }

    public void password(String password) {
        sendKeys(campoSenha, password);
    }

    public void clickLogin() {
        click(EntrarBtn);
    }

    public String getMessageText() {
        return message.getText();
    }
}
