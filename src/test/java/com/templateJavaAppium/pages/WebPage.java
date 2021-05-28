package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class WebPage extends PageBase {
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/toolbar_title")
    private MobileElement titleWeb;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/website_input")
    private MobileElement websiteImput;

    public String returnTitlePage() {
       return getText(titleWeb);
    }
    public void acessarWebSite() {
        sendKeys(websiteImput,"http://www.google.com.br");
    }

    public String returnImputAplication(){
        return getText(websiteImput);
    }

}