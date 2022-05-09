package stepsdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import utils.devicemanager.AndroidMobileDriver;
import utils.devicemanager.IOSMobileDriver;
import utils.devicemanager.MobileDriver;


import static utils.devicemanager.AppProperty.PLATFORM_NAME;
import static utils.devicemanager.ReadProperty.readProperty;
import static io.appium.java_client.remote.MobilePlatform.IOS;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Hooks {
    @Managed (driver = "Appium")
    public static WebDriver driver;
    private static boolean beforeAll = true;

    @Before
    public void setUp(){
        if (beforeAll) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    driver.quit();
                    driver = null;
                }
            });
            beforeAll = false;
        }
        driver = getProxiedDriver();
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(driver)));
    }

    @After(order = 0)
    static void teardown() {
        String platformName = readProperty(PLATFORM_NAME.propertyName());
        MobileDriver mobileDriver = new MobileDriver(new AndroidMobileDriver());
        if (IOS.equalsIgnoreCase(platformName)) {
            mobileDriver = new MobileDriver(new IOSMobileDriver());
        }
        mobileDriver.resetApp();
    }
}
