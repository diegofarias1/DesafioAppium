package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FixturePage extends PageBase {


    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nfc")
    private MobileElement textNfc;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/longitude")
    private MobileElement valueLong;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/lat")
    private MobileElement valueLat;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/gps")
    private MobileElement textGps;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/bluetooth")
    private MobileElement textBluetooth;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/wifi")
    private MobileElement textWiFi;


    public String getValueLong() {
        return getText(valueLong);

    }

    public String getValueLat() {
        return getText(valueLat);

    }

    public String getStatusNFC() {
        return getText(textNfc);

    }

    public String getStatusGps() {
        return getText(textGps);

    }

    public String getBluetooth() {
        return getText(textBluetooth);

    }

    public String getWiFi() {
        return getText(textWiFi);

    }

}
