package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InputControlsInfoPage extends PageBase {

    @AndroidFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeButton[1]")
    private MobileElement btnMaisInformacao;

    public void clicarBtnMaisInformacao() {
        click(btnMaisInformacao);
    }

    public boolean botaoInfoDisplayed() {
        return returnIfElementIsDisplayed(btnMaisInformacao);
    }

    public String getTextoBtnMaisInformacao() {
        return getText(btnMaisInformacao);

    }
}
