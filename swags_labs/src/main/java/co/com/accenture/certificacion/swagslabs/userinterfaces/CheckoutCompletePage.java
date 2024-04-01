package co.com.accenture.certificacion.swagslabs.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutCompletePage {
    public static final Target TITLE_CHECKOUT_COMPLETE  = Target.the("Title Checkout Complete").locatedForAndroid(AppiumBy.xpath(("//android.widget.TextView[@text='THANK YOU FOR YOU ORDER']"))).locatedForIOS(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='THANK YOU FOR YOU ORDER']"));

    private CheckoutCompletePage(){}
}