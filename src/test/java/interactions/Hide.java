package interactions;

import io.appium.java_client.ios.IOSDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.remote.RemoteWebDriver;


import static io.appium.java_client.remote.MobilePlatform.IOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Hide implements Interaction {

    public static Hide keyboard(){
        return instrumented(Hide.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String platform = ((RemoteWebDriver) BrowseTheWeb.as(actor).getDriver()).getCapabilities()
                .getPlatformName().name();
        if (IOS.equalsIgnoreCase(platform)) {
            IOSDriver driver = getProxiedDriver();
            driver.hideKeyboard();
        }
    }
}
