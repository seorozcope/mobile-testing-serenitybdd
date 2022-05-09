package utils.devicemanager;

public enum AppProperty {
    APP_PACKAGE("appium.appPackage"),
    APP_ACTIVITY("appium.appActivity"),
    BUNDLE_ID("appium.bundleId"),
    PLATFORM_NAME("appium.platformName");

    AppProperty(String property) {
        this.propertyName = property;
    }

    final String propertyName;

    public String propertyName() {
        return propertyName;
    }
}
