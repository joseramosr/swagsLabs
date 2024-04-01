package co.com.accenture.certificacion.swagslabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.accenture.certificacion.swagslabs.userinterfaces.LoginPage.*;
import static co.com.accenture.certificacion.swagslabs.utils.Constants.PASSWORD;
import static co.com.accenture.certificacion.swagslabs.utils.Constants.USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SingIn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USERNAME,isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(USERNAME).into(TXT_USERNAME),
                Enter.theValue(PASSWORD).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Performable toSwagsLabsApp() {
        return instrumented(SingIn.class);
    }
}
