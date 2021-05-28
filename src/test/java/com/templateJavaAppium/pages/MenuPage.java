package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPage extends PageBase {
    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Login Page']")
    private MobileElement LoginBtn;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Web']")
    private MobileElement WebBtn;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Native Components']")
    private MobileElement NativeComponentesBtn;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Input Controls']")
    private MobileElement InputControlsBtn;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Nested Views']")
    private MobileElement NestedViewsBtn;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Crash/Bug']")
    private MobileElement CrashBugBtn;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Alerts']")
    private MobileElement AlertsBtn;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Local Web View']")
    private MobileElement LocalWebViewBtn;

    @AndroidFindBy(xpath = "//*[@class='android.widget.TextView' and @text='Fixtures']")
    private MobileElement FixturesBtn;

    public void clickLoginMenu() {
        click(LoginBtn);
    }

    public void clickWeb() {
        click(WebBtn);
    }

    public void clickNativeComponentes() {
        click(NativeComponentesBtn);
    }

    public void clickInputControls() {
        click(InputControlsBtn);
    }

    public void clickNestedViews() {
        click(NestedViewsBtn);
    }

    public void clickCrashBug() {
        click(CrashBugBtn);
    }

    public void clickAlerts() {
        click(AlertsBtn);
    }

    public void clickLocalWebView() {
        click(LocalWebViewBtn);
    }

    public void clickFixtures() {
        click(FixturesBtn);

    }
}