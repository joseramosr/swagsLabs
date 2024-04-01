package co.com.accenture.certificacion.swagslabs.tasks;

import co.com.accenture.certificacion.swagslabs.interactions.SelectInAndroid;
import co.com.accenture.certificacion.swagslabs.interactions.SelectInIos;
import co.com.accenture.certificacion.swagslabs.utils.DriverCapabilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.accenture.certificacion.swagslabs.userinterfaces.ProductPage.*;
import static co.com.accenture.certificacion.swagslabs.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProducts implements Task {
    List<Map<String, String>> products;

    public AddProducts(List<Map<String, String>> products) {
        this.products = products;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String platformName = DriverCapabilities.getPlatformName();
        actor.attemptsTo(WaitUntil.the(TITLE_PRODUCTS, isVisible()).forNoMoreThan(10).seconds());
        for (Map<String, String> product : products) {
            actor.attemptsTo(
                    Check.whether(platformName.equalsIgnoreCase(ANDROID_OS))
                            .andIfSo(
                                    SelectInAndroid.theElementWithText(product.get(PRODUCT_NAME_KEY)),
                                    SelectInAndroid.theElementWithText(BTN_ADD_TO_CART_TEXT))
                            .otherwise(
                                    SelectInIos.theElementWith(getLabelXpathByText(product.get(PRODUCT_NAME_KEY)), product.get(PRODUCT_NAME_KEY), ATTRIBUTE_LABEL),
                                    SelectInIos.theElementWith(getLabelXpathByText(BTN_ADD_TO_CART_TEXT), BTN_ADD_TO_CART_TEXT, ATTRIBUTE_LABEL)
                            ),
                    Click.on(BTN_BACK_TO_HOME)
            );
        }
    }

    public static Performable toTheCart(List<Map<String, String>> products) {
        return instrumented(AddProducts.class, products);
    }
}
