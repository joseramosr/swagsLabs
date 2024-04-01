package co.com.accenture.certificacion.swagslabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutInformationPage {
    public static final By BTN_CHECKOUT = AppiumBy.accessibilityId("test-CHECKOUT");
    public static final Target TXT_NAME = Target.the("Name Input").located(AppiumBy.accessibilityId("test-First Name"));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").located(AppiumBy.accessibilityId("test-Last Name"));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").located(AppiumBy.accessibilityId("test-Zip/Postal Code"));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").located(AppiumBy.accessibilityId("test-CONTINUE"));
    public static final By BTN_FINISH = AppiumBy.accessibilityId("test-FINISH");
    private CheckoutInformationPage(){}
}
