package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AlertsPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_toast_button")
    private MobileElement ToastAlertBtn;

    @AndroidFindBy(xpath = "(//android.widget.Button[@text='ALERT'])")
    private MobileElement AlertBtn;

    @AndroidFindBy(id = "android:id/message")
    private MobileElement messageAlert;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okBtnAlert;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    private MobileElement messageToast;

    public String returnMensagemToast() {
        return getText(messageToast);
    }

    public void clickAlert() {
        click(AlertBtn);
    }

    public void clickToast() {
        click(ToastAlertBtn);

    }

    public String returnMessageText() {
        return getText(messageAlert);
    }

    public void clickOkAlert(){
        click(okBtnAlert);
    }

}
