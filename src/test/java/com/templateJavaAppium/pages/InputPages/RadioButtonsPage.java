package com.templateJavaAppium.pages.InputPages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RadioButtonsPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_1")
    private MobileElement radioAmazon;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_2")
    private MobileElement radioWeb;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_3")
    private MobileElement radioServices;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_radio_button_display")
    private MobileElement radioText;


    public String getRadioText() {
        return getText(radioText);
    }

    public void clickRadioAmazon() {
        click(radioAmazon);
    }

    public void clickRadioWeb() {
        click(radioWeb);
    }

    public void clickRadioServices() {
        click(radioServices);
    }
}
