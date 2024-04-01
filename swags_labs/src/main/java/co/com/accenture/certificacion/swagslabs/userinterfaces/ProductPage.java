package co.com.accenture.certificacion.swagslabs.userinterfaces;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {
    public static final Target TITLE_PRODUCTS = Target.the("Title products").locatedForAndroid(AppiumBy.xpath(("//android.widget.TextView[@text='PRODUCTS']"))).locatedForIOS(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='PRODUCTS']"));
    public static final Target BTN_BACK_TO_HOME= Target.the("Button Back to the Home").located(AppiumBy.accessibilityId("test-BACK TO PRODUCTS"));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(AppiumBy.accessibilityId("test-Cart"));
    public static By getLabelXpathByText(String text) {
        return AppiumBy.xpath(String.format("//*[@label='%s']", text));
    }
    private ProductPage(){}
}
