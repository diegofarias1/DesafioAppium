package com.templateJavaAppium.pages.InputPages;

import com.templateJavaAppium.bases.PageBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class TextFieldPage extends PageBase {

    @AndroidFindBy(accessibility = "Text Input Control")
    private MobileElement inputEditText;

    public void sendText(String text) {
        sendKeys(inputEditText, text);
    }

    public String verificarTexto() {
        return getText(inputEditText);
    }
}
