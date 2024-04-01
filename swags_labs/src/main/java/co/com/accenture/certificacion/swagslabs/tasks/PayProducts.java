package co.com.accenture.certificacion.swagslabs.tasks;

import co.com.accenture.certificacion.swagslabs.interactions.SelectInAndroid;
import co.com.accenture.certificacion.swagslabs.interactions.SelectInIos;
import co.com.accenture.certificacion.swagslabs.models.CheckoutInformation;
import co.com.accenture.certificacion.swagslabs.utils.DriverCapabilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.accenture.certificacion.swagslabs.userinterfaces.CheckoutInformationPage.*;
import static co.com.accenture.certificacion.swagslabs.userinterfaces.ProductPage.BTN_OPEN_SHOP_CART;
import static co.com.accenture.certificacion.swagslabs.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PayProducts implements Task {

    private final CheckoutInformation checkoutInformation;

    public PayProducts(CheckoutInformation checkoutInformation) {
        this.checkoutInformation = checkoutInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String platformName = DriverCapabilities.getPlatformName();
        actor.attemptsTo(
                Click.on(BTN_OPEN_SHOP_CART),
                Check.whether(platformName.equalsIgnoreCase(ANDROID_OS))
                        .andIfSo(SelectInAndroid.theElementWithText(BTN_CHECKOUT_TEXT))
                        .otherwise(SelectInIos.theElementWith(BTN_CHECKOUT, BTN_CHECKOUT_TEXT, ATTRIBUTE_TEXT)),
                Enter.theValue(checkoutInformation.getFirstName()).into(TXT_NAME),
                Enter.theValue(checkoutInformation.getLastName()).into(TXT_LAST_NAME),
                Enter.theValue(checkoutInformation.getZipCode()).into(TXT_POST_CODE),
                Click.on(BTN_CONTINUE),
                Check.whether(platformName.equalsIgnoreCase(ANDROID_OS))
                        .andIfSo(SelectInAndroid.theElementWithText(BTN_FINISH_TEXT))
                        .otherwise(SelectInIos.theElementWith(BTN_FINISH, BTN_FINISH_TEXT, ATTRIBUTE_TEXT))
        );
    }
    public static Performable onTheCart(CheckoutInformation checkoutInformation) {
        return instrumented(PayProducts.class, checkoutInformation);
    }

}
