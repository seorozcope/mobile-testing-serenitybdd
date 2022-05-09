package utils.devicemanager;

import io.appium.java_client.ios.IOSDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;
import static utils.devicemanager.ReadProperty.readProperty;

public class IOSMobileDriver implements IMobileDriver{
    @Override
    public void resetApp() {
        String appBundleId = readProperty(AppProperty.BUNDLE_ID.propertyName());
        IOSDriver driver = getProxiedDriver();
        driver.terminateApp(appBundleId);
        driver.activateApp(appBundleId);
    }
}
