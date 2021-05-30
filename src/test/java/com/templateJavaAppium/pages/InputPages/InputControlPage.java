package com.templateJavaAppium.pages.InputPages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InputControlPage extends PageBase {
    @AndroidFindBy(xpath = "//*[@text='Text Field']")
    private MobileElement textField;

    @AndroidFindBy(xpath = "//*[@text='Checkbox']")
    private MobileElement checkBox;

    @AndroidFindBy(xpath = "//*[@text='Radio Buttons']")
    private MobileElement radioButtons;

    @AndroidFindBy(xpath = "//*[@text='Toggle Button']")
    private MobileElement toggleButton;

    @AndroidFindBy(xpath = "//*[@text='Spinner']")
    private MobileElement spinner;

    @AndroidFindBy(xpath = "//*[@text='Pull To Refresh']")
    private MobileElement pullToRefresh;

    @AndroidFindBy(xpath = "//*[@text='Time Picker']")
    private MobileElement timePicker;

    @AndroidFindBy(xpath = "//*[@text='Date Picker']")
    private MobileElement datePicker;

    @AndroidFindBy(xpath = "//*[@text='Submit Button']")
    private MobileElement submitButton;

    @AndroidFindBy(xpath = "//*[@text='Gestures']")
    private MobileElement gestures;

    public  void clickTextField() {
        click(textField);
    }

    public  void clickCheckBox() {
        click(checkBox);
    }

    public  void clickRadioButtons() {
        click(radioButtons);
    }

    public  void clickToggleButton() { click(toggleButton);    }

    public  void clickSpinner() {
        click(spinner);
    }

    public  void clickPullToRefresh() {
        click(pullToRefresh);
    }

    public  void clickTimePicker() {
        click(timePicker);
    }

    public  void clickDatePicker() {
        click(datePicker);
    }

    public  void clickSubmitButton() {
        click(submitButton);
    }

    public  void clickGestures() {
        click(gestures);
    }

    public void swipesInput(){
        scrolling("right");
    }
}
