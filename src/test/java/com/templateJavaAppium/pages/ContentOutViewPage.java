package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ContentOutViewPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/out_of_content_frame")
    private MobileElement frame;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().resourceId(\"com.amazonaws.devicefarm.android.referenceapp:id/out_of_content_scrollView\")).scrollIntoView(new UiSelector().text(\"This is hidden text\"))")
    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='This is hidden text']")
    private MobileElement text;

    public boolean frameIsDisplayed() {
        return returnIfElementIsDisplayed(frame);
    }

    public boolean hiddenTextIsDisplayed() {
        return returnIfElementIsDisplayed(text);
    }

    public void waitFrameCarregar() {
        waitForElement(frame);
    }

}
