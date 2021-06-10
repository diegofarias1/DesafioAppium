package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LocalWebViewPage extends PageBase {
    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @resource-id='first-name-form']")
    private MobileElement firstName;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @resource-id='last-name-form']")
    private MobileElement lastName;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @index='5']")
    private MobileElement messageLocal;


    public void sendFirstName(String nameFirst) {
        clear(firstName);
        sendKeys(firstName, nameFirst);
    }

    public void sendLastName(String nameLast) {
        clear(lastName);
        sendKeys(lastName, nameLast);
    }

    public String getNamesInserts() {
        String names = getText(messageLocal);
        return names;
    }
}
