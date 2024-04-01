package co.com.accenture.certificacion.swagslabs.utils;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverCapabilities {
    private DriverCapabilities() {}
    public static String getPlatformName() {
        WebDriverFacade webDriverFacade = (WebDriverFacade) Serenity.getDriver();
        WebDriver driver = webDriverFacade.getProxiedDriver();
        return ((RemoteWebDriver) driver).getCapabilities().getCapability("platformName").toString();
    }

}

