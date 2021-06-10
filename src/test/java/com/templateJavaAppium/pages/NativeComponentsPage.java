package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NativeComponentsPage extends PageBase {

    @AndroidFindBy(xpath = "//*[@text='Image Collection']")
    private MobileElement imgCollection;

    @AndroidFindBy(xpath = "//*[@text='Content Scrolling']")
    private MobileElement contentScrolling;

    @AndroidFindBy(xpath = "//*[@text='Video Player']")
    private MobileElement videoPlayer;

    @AndroidFindBy(xpath = "//*[@text='Camera']")
    private MobileElement camera;

    @AndroidFindBy(xpath = "//*[@text='Content Out of View']")
    private MobileElement contentOutView;

    public  void clickSubMenuImgCollection() {
        click(imgCollection);
    }

    public  void clickSubMenuContentScrolling() {
        click(contentScrolling);
    }

    public void clickSubMenuVideoPlayer() {
        click(videoPlayer);
    }

    public  void clickSubMenuCamera() {
        click(camera);
    }

    public  void clickSubMenuContentOutView() {
        click(contentOutView);
    }
}