package com.templateJavaAppium.pages.InputPages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckBoxPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox")
    private MobileElement checkBox;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox_status")
    private MobileElement display;

    public void clickCheckBox() {
        click(checkBox);
    }

    public String getCheckBoxDisplay() {
        return getText(display);
    }
}
