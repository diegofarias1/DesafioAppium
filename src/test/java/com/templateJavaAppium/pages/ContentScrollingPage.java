package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ContentScrollingPage extends PageBase {

    @AndroidFindBy(className = "android.widget.ScrollView")
    private MobileElement scrollView;

    public void scrollDown() {
        scroll(0.5, 0.1);
    }

    public boolean scrollViewDisplayed() {
        return returnIfElementIsDisplayed(scrollView);
    }

    public void waitScrollDisplayed() {
        waitForElement(scrollView);
    }
}