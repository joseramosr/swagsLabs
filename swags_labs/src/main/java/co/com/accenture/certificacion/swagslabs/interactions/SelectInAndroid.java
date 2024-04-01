package co.com.accenture.certificacion.swagslabs.interactions;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class SelectInAndroid implements Interaction {
    private final String text;
    public SelectInAndroid(String text) {
        this.text = text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String locator = String.format("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"%s\").instance(0))", text);
        Target element = Target.the("Title with the name of the product").located(AppiumBy.androidUIAutomator(locator));
        actor.attemptsTo(Click.on(element));
    }
    public static Performable theElementWithText(String text) {
        return instrumented(SelectInAndroid.class, text);
    }
}
