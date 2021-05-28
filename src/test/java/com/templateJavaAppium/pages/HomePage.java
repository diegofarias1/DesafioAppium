package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class HomePage extends PageBase {
    @AndroidFindBy(accessibility = "Homepage Headline")
    private MobileElement MensagemHome;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/homepage_subheadline")
    private MobileElement version;

    @AndroidFindBy(xpath = ".//android.widget.Button[@text='Continue']")
    private MobileElement acceptance;

    @AndroidFindBy(xpath = ".//android.widget.Button[@text='OK']")
    private MobileElement acceptanceOK;

    @AndroidFindBy(accessibility = "ReferenceApp")
    private MobileElement menuBtn;

    @AndroidFindBy(accessibility = "Homepage Headline")
    private MobileElement textHome;

    public String getTextHome(){
        return getText(textHome);
    }



    public String returnTextHomePage() {
        return getText(MensagemHome);
    }

    public String returnVersionApp() {
        return getText(version);
    }

    public void clickMenu()
    {
        click(menuBtn);
    }

}
