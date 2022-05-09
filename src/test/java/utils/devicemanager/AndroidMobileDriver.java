package utils.devicemanager;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;
import static utils.devicemanager.ReadProperty.readProperty;

public class AndroidMobileDriver implements IMobileDriver{
    @Override
    public void resetApp() {
        String appPackage = readProperty(AppProperty.APP_PACKAGE.propertyName());
        String appActivity = readProperty(AppProperty.APP_ACTIVITY.propertyName());
        Activity activity = new Activity(appPackage, appActivity);
        AndroidDriver driver = getProxiedDriver();
        driver.terminateApp(appPackage);
        driver.startActivity(activity);
    }
}
